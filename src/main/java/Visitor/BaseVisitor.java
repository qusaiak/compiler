package Visitor;

import AST.*;
import org.Angular.AngularParser;
import org.Angular.AngularParserBaseVisitor;
import org.antlr.v4.runtime.tree.ParseTree;
import SymbolTable.*;

import java.util.ArrayList;
import java.util.List;


public class BaseVisitor extends AngularParserBaseVisitor<Object> {

    SymbolTable symbolTable = new SymbolTable();

    // Program

    @Override
    public Object visitProgram(AngularParser.ProgramContext ctx) {
        List<ImportStatement> importStatements = new ArrayList<>();
        List<VariableDeclaration> variableDeclarations = new ArrayList<>();
        List<ClassDeclaration> classDeclarations = new ArrayList<>();
        List<FunctionDeclaration> functionDeclarations = new ArrayList<>();
        List<ComponentDeclaration> componentDeclarations = new ArrayList<>();
        ExportStatement exportStatement = null;

        for (AngularParser.ImportStatementContext importCtx : ctx.importStatement()) {
            importStatements.add((ImportStatement) visit(importCtx));
        }
        for (AngularParser.VariableDeclarationContext varCtx : ctx.variableDeclaration()) {
            variableDeclarations.add((VariableDeclaration) visit(varCtx));
        }
        for (AngularParser.ClassDeclarationContext classCtx : ctx.classDeclaration()) {
            classDeclarations.add((ClassDeclaration) visit(classCtx));
        }
        for (AngularParser.FunctionDeclarationContext funcCtx : ctx.functionDeclaration()) {
            functionDeclarations.add((FunctionDeclaration) visit(funcCtx));
        }
        for (AngularParser.ComponentDeclarationContext compCtx : ctx.componentDeclaration()) {
            componentDeclarations.add((ComponentDeclaration) visit(compCtx));
        }
        if (ctx.exportStatement() != null) {
            exportStatement = (ExportStatement) visit(ctx.exportStatement());
        }
        System.out.println("******** SYMBOL TABLE:\n");
        this.symbolTable.print();
        return new Program(importStatements, variableDeclarations, classDeclarations, functionDeclarations, componentDeclarations, exportStatement);
    }

    //Import Statement

    @Override
    public Object visitImportStatement(AngularParser.ImportStatementContext ctx) {
        ImportStatement importStatement = new ImportStatement();

        if (ctx.ID() != null && !ctx.ID().isEmpty()) {
            importStatement.setId(ctx.ID(0).getText());
        } else if (ctx.LEFTCURLY() != null) {
            List<String> ids = new ArrayList<>();
            for (int i = 0; i < ctx.ID().size(); i++) {
                if (ctx.ID(i) != null) {
                    ids.add(ctx.ID(i).getText());
                }
            }
            importStatement.setIds(ids);
        }

        importStatement.setFrom(ctx.STRING().getText());
        Row row = new Row();
        row.setType("Import from");
        row.setValue(importStatement.getFrom());
        this.symbolTable.getRows().add(row);
        return importStatement;
    }

    // Export Statement

    @Override
    public Object visitExportStatement(AngularParser.ExportStatementContext ctx) {
        boolean isDefault = ctx.DEFAULT() != null;
        ClassDeclaration classDeclaration = null;
        VariableDeclaration variableDeclaration = null;
        FunctionDeclaration functionDeclaration = null;
        ComponentDeclaration componentDeclaration = null;
        Object object = null;
        List<String> ids = new ArrayList<>();

        if (ctx.classDeclaration() != null) {
            classDeclaration = (ClassDeclaration) visit(ctx.classDeclaration());
            Row row = new Row();
            row.setType("Export");
            row.setValue(new ExportStatement(classDeclaration, variableDeclaration, functionDeclaration, componentDeclaration, object).getClassDeclaration().toString());
            this.symbolTable.getRows().add(row);
        } else if (ctx.variableDeclaration() != null) {
            variableDeclaration = (VariableDeclaration) visit(ctx.variableDeclaration());
            Row row = new Row();
            row.setType("Export");
            row.setValue(new ExportStatement(classDeclaration, variableDeclaration, functionDeclaration, componentDeclaration, object).getVariableDeclaration().toString());
            this.symbolTable.getRows().add(row);
        } else if (ctx.functionDeclaration() != null) {
            functionDeclaration = (FunctionDeclaration) visit(ctx.functionDeclaration());
            Row row = new Row();
            row.setType("Export");
            row.setValue(new ExportStatement(classDeclaration, variableDeclaration, functionDeclaration, componentDeclaration, object).getFunctionDeclaration().toString());
            this.symbolTable.getRows().add(row);
        } else if (ctx.componentDeclaration() != null) {
            componentDeclaration = (ComponentDeclaration) visit(ctx.componentDeclaration());
            Row row = new Row();
            row.setType("Export");
            row.setValue(new ExportStatement(classDeclaration, variableDeclaration, functionDeclaration, componentDeclaration, object).getComponentDeclaration().toString());
            this.symbolTable.getRows().add(row);
        } else if (ctx.object() != null) {
            object = visitObject(ctx.object());
            Row row = new Row();
            row.setType("Export");
            row.setValue(new ExportStatement(classDeclaration, variableDeclaration, functionDeclaration, componentDeclaration, object).getObject().toString());
            this.symbolTable.getRows().add(row);
        } else if (ctx.LEFTCURLY() != null) {
            for (int i = 0; i < ctx.ID().size(); i++) {
                ids.add(ctx.ID(i).getText());
            }
        }

        if (isDefault) {
            return new ExportStatement(true, classDeclaration);
        } else if (!ids.isEmpty()) {
            return new ExportStatement(ids);
        } else {
            return new ExportStatement(classDeclaration, variableDeclaration, functionDeclaration, componentDeclaration, object);
        }
    }

    // Variable Declaration

    @Override
    public Object visitVariableDeclaration(AngularParser.VariableDeclarationContext ctx) {
        String varType = null;
        if (ctx.VAR() != null) {
            varType = ctx.VAR().getText();
        } else if (ctx.LET() != null) {
            varType = ctx.LET().getText();
        } else if (ctx.CONST() != null) {
            varType = ctx.CONST().getText();
        }

        String id = ctx.ID().getText();
        Type type = null;
        Value value = null;
        Array array = null;
        Object object = null;
        FunctionDeclaration functionDeclaration = null;

        if (ctx.type() != null) {
            type = (Type) visit(ctx.type());
        }

        if (ctx.value() != null) {
            value = (Value) visit(ctx.value(0));
        } else if (ctx.array() != null) {
            array = (Array) visit(ctx.array());
        } else if (ctx.object() != null) {
            object = (Object) visit(ctx.object());
        } else if (ctx.functionDeclaration() != null) {
            functionDeclaration = (FunctionDeclaration) visit(ctx.functionDeclaration());
        }

        if (type != null && value != null) {
            return new VariableDeclaration(varType, id, type, value);
        } else if (value != null) {
            return new VariableDeclaration(varType, id, value);
        } else if (array != null) {
            return new VariableDeclaration(varType, id, array);
        } else if (object != null) {
            return new VariableDeclaration(varType, id, object);
        } else {
            return new VariableDeclaration(varType, id, functionDeclaration);
        }
    }

    // Class Declaration

    @Override
    public Object visitClassDeclaration(AngularParser.ClassDeclarationContext ctx) {
        String className = ctx.ID(0).getText();
        String extendsClassName = ctx.EXTENDS() != null ? ctx.ID(1).getText() : null;
        List<String> implementsList = new ArrayList<>();
        List<ClassBody> classBody = new ArrayList<>();

        if (ctx.IMPLEMENTS() != null) {
            for (int i = ctx.EXTENDS() != null ? 2 : 1; i < ctx.ID().size(); i++) {
                implementsList.add(ctx.ID(i).getText());
            }
        }

        return new ClassDeclaration(className, extendsClassName, implementsList, classBody);
    }

    // Function Declaration

    @Override
    public Object visitFunctionDeclaration(AngularParser.FunctionDeclarationContext ctx) {
        String id = ctx.ID().getText();
        List<Parameter> parameters = new ArrayList<>();
        if (ctx.parameters() != null) {
            parameters = (List<Parameter>) visit(ctx.parameters());
        }

        Type returnType = null;
        if (ctx.type() != null) {
            returnType = (Type) visit(ctx.type());
        }

        FunctionBody functionBody = (FunctionBody) visit(ctx.functionBody());
        Row row = new Row();
        row.setType("FunctionName");
        row.setValue(new FunctionDeclaration(id, parameters, returnType, functionBody).getId());
        this.symbolTable.getRows().add(row);
        return new FunctionDeclaration(id, parameters, returnType, functionBody);
    }

    // Component Declaration

    @Override
    public Object visitComponentDeclaration(AngularParser.ComponentDeclarationContext ctx) {
        if (ctx.decorator() != null) {
            ComponentDeclaration component = new ComponentDeclaration((Decorator) visit(ctx.decorator()));
            Row row = new Row();
            row.setType("Component");
            row.setValue(component.getDecorator().toString());
            this.symbolTable.getRows().add(row);
            return new ComponentDeclaration((Decorator) visit(ctx.decorator()));
        } else {
            ComponentDeclaration component = new ComponentDeclaration((ComponentBody) visit(ctx.decorator()));
            Row row = new Row();
            row.setType("Component");
            row.setValue(component.getComponentBody().toString());
            this.symbolTable.getRows().add(row);
            return new ComponentDeclaration((ComponentBody) visit(ctx.componentBody()));
        }
    }

    // Value

    @Override
    public Object visitValue(AngularParser.ValueContext ctx) {
        if (ctx.type() != null) {
            Value value = new Value(ctx.type());
            Row row = new Row();
            row.setType("TypeValue");
            row.setValue(value.getType().toString());
            this.symbolTable.getRows().add(row);
            return new Value((Type) visit(ctx.type()));
        } else if (ctx.array() != null) {
            Value value = new Value(ctx.type());
            Row row = new Row();
            row.setType("Array");
            row.setValue(value.getNestedArray().toString());
            this.symbolTable.getRows().add(row);
            return new Value((Array) visit(ctx.array()));
        } else if (ctx.object() != null) {
            Value value = new Value(ctx.type());
            Row row = new Row();
            row.setType("Object");
            row.setValue(value.getNestedObject().toString());
            this.symbolTable.getRows().add(row);
            return new Value((Object) visit(ctx.object()));
        } else if (ctx.jsxElement() != null) {
            Value value = new Value(ctx.type());
            Row row = new Row();
            row.setType("JsxElement");
            row.setValue(value.getJsxElement().toString());
            this.symbolTable.getRows().add(row);
            return new Value((JsxElement) visit(ctx.jsxElement()));
        } else if (ctx.angularDirective() != null) {
            Value value = new Value(ctx.type());
            Row row = new Row();
            row.setType("Directive");
            row.setValue(value.getDirective().toString());
            this.symbolTable.getRows().add(row);
            return new Value((angularDirective) visit(ctx.angularDirective()));
        }

        return null;
    }

    // Array

    @Override
    public Object visitArray(AngularParser.ArrayContext ctx) {
        Array array = new Array();

        for (int i = 0; i < ctx.value().size(); i++) {
            array.addValue(visit(ctx.value(i)));
        }

        return array;
    }

    // Object

    @Override
    public Object visitObject(AngularParser.ObjectContext ctx) {
        object obj = new object();

        for (int i = 0; i < ctx.ID().size(); i++) {
            String key = ctx.ID(i).getText();
            Object value = visit(ctx.value(i));
            obj.addProperty(key, value);
        }

        return obj;
    }

    // Class Body

    @Override
    public Object visitClassBody(AngularParser.ClassBodyContext ctx) {
        List<Decorator> decorators = new ArrayList<>();
        List<ConstructorDeclaration> constructorDeclarations = new ArrayList<>();
        List<VariableDeclaration> variableDeclarations = new ArrayList<>();
        List<FunctionDeclaration> functionDeclarations = new ArrayList<>();

        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);
            if (child instanceof AngularParser.DecoratorContext) {
                decorators.add((Decorator) visit(child));
            } else if (child instanceof AngularParser.ConstructorDeclarationContext) {
                constructorDeclarations.add((ConstructorDeclaration) visit(child));
            } else if (child instanceof AngularParser.VariableDeclarationContext) {
                variableDeclarations.add((VariableDeclaration) visit(child));
            } else if (child instanceof AngularParser.FunctionDeclarationContext) {
                functionDeclarations.add((FunctionDeclaration) visit(child));
            }
        }

        return new ClassBody(decorators, constructorDeclarations, variableDeclarations, functionDeclarations);
    }

    // Decorator

    @Override
    public Object visitDecorator(AngularParser.DecoratorContext ctx) {
        String id = ctx.ID().getText();
        List<DecoratorArgument> arguments = new ArrayList<>();

        if (ctx.decoratorArguments() != null) {
            for (AngularParser.DecoratorArgumentsContext argCtx : ctx.decoratorArguments()) {
                arguments.add((DecoratorArgument) visit(argCtx));
            }
        }

        return new Decorator(id, arguments);
    }

    // Decorator Arguments




    // Constructor Declaration
    @Override
    public Object visitConstructorDeclaration(AngularParser.ConstructorDeclarationContext ctx) {
        List<Parameter> parameters = new ArrayList<>();
        if (ctx.parameters() != null) {;
            parameters = (List<Parameter>) visit(ctx.parameters());
        }

        FunctionBody functionBody = null;
        List<Assignments> assignments = new ArrayList<>();
        if (ctx.functionBody() != null) {
            functionBody = (FunctionBody) visit(ctx.functionBody());
        } else if (ctx.assignment() != null) {
            assignments.add((Assignments) visit(ctx.assignment()));
        }

        if (functionBody != null) {
            return new ConstructorDeclaration(parameters, functionBody);
        } else {
            return new ConstructorDeclaration(parameters, assignments);
        }
    }

    // Parameters

    @Override
    public Object visitParameters(AngularParser.ParametersContext ctx) {
        Parameters parameters = new Parameters();

        for (int i = 0; i < ctx.ID().size(); i++) {
            String accessModifier = null;
            if (ctx.PUBLIC(i) != null) {
                accessModifier = ctx.PUBLIC(i).getText();
            } else if (ctx.PRIVATE(i) != null) {
                accessModifier = ctx.PRIVATE(i).getText();
            }

            String id = ctx.ID(i).getText();
            Type type = null;
            if (ctx.type(i) != null) {
                type = (Type) visit(ctx.type(i));
            }

            Object value = null;
            if (ctx.value(i) != null) {
                value = visit(ctx.value(i));
            }

            Parameter parameter = new Parameter(accessModifier, id, type, value);
            parameters.addParameter(parameter);
        }

        if (ctx.LEFTCURLY() != null) {
            for (int i = 0; i < ctx.ID().size(); i++) {
                parameters.addId(ctx.ID(i).getText());
            }
        }

        return parameters;
    }

    // Function Body

    @Override
    public Object visitFunctionBody(AngularParser.FunctionBodyContext ctx) {
        List<Statement> statements = new ArrayList<>();
        for (AngularParser.StatementContext stmtCtx : ctx.statement()) {
            statements.add((Statement) visit(stmtCtx));
        }

        ReturnStatement returnStatement = null;
        if (ctx.returnStatement() != null) {
            returnStatement = (ReturnStatement) visit(ctx.returnStatement());
        }

        return new FunctionBody(statements, returnStatement);
    }

    // Return Statement
    @Override
    public Object visitReturnStatement(AngularParser.ReturnStatementContext ctx) {
        if (ctx.jsxElement() != null) {
            return new ReturnStatement((JsxElement) visit(ctx.jsxElement()));
        }

        Value value = (Value) visit(ctx.value(0));
        operation operation = null;
        Value secondValue = null;

        if (ctx.operation() != null) {
            operation = (operation) visit(ctx.operation());
            secondValue = (Value) visit(ctx.value(1));
        }

        return new ReturnStatement(value, operation, secondValue);
    }

    // Operation

    @Override
    public Object visitOperation(AngularParser.OperationContext ctx) {
        if (ctx.PLUS() != null) {
            return operation.PLUS;
        } else if (ctx.MINUS() != null) {
            return operation.MINUS;
        } else if (ctx.STAR() != null) {
            return operation.STAR;
        } else if (ctx.DIVISION() != null) {
            return operation.DIVISION;
        } else if (ctx.EQ() != null) {
            return operation.EQ;
        } else if (ctx.NEQ() != null) {
            return operation.NEQ;
        } else if (ctx.GREATERTHAN() != null) {
            return operation.GREATERTHAN;
        } else if (ctx.GREATEREQUAL() != null) {
            return operation.GREATEREQUAL;
        } else if (ctx.LESSTHAN() != null) {
            return operation.LESSTHAN;
        } else if (ctx.LESSEQUAL() != null) {
            return operation.LESSEQUAL;
        }
        return null;
    }

    // Statement

    @Override
    public Object visitStatement(AngularParser.StatementContext ctx) {
        if (ctx.variableDeclaration() != null) {
            return new Statement((VariableDeclaration) visit(ctx.variableDeclaration()));
        } else if (ctx.ifStatement() != null) {
            return new Statement((ifStatement) visit(ctx.ifStatement()));
        } else if (ctx.forStatement() != null) {
            return new Statement((ForStatement) visit(ctx.forStatement()));
        } else if (ctx.whileStatement() != null) {
            return new Statement((WhileStatement) visit(ctx.whileStatement()));
        } else if (ctx.callFunction() != null) {
            return new Statement((CallFunction) visit(ctx.callFunction()));
        } else if (ctx.printStatement() != null) {
            return new Statement((Print) visit(ctx.printStatement()));
        } else if (ctx.jsxElement() != null) {
            return new Statement((JsxElement) visit(ctx.jsxElement()));
        } else if (ctx.angularDirective() != null) {
            return new Statement((angularDirective) visit(ctx.angularDirective()));
        } else if (ctx.returnStatement() != null) {
            return new Statement((ReturnStatement) visit(ctx.returnStatement()));
        } else if (ctx.assignment() != null) {
            return new Statement((Assignments) visit(ctx.assignment()));
        }
        return null;
    }

    // Component Body

    @Override
    public Object visitComponentBody(AngularParser.ComponentBodyContext ctx) {
        List<VariableDeclaration> variableDeclarations = new ArrayList<>();
        List<FunctionDeclaration> functionDeclarations = new ArrayList<>();

        for (AngularParser.VariableDeclarationContext varCtx : ctx.variableDeclaration()) {
            variableDeclarations.add((VariableDeclaration) visit(varCtx));
        }
        for (AngularParser.FunctionDeclarationContext funcCtx : ctx.functionDeclaration()) {
            functionDeclarations.add((FunctionDeclaration) visit(funcCtx));
        }
        ComponentBody componentBody =  new ComponentBody(variableDeclarations, functionDeclarations);

        Row row = new Row();
        row.setType("ComponentBody");
        row.setValue(componentBody.getFunctionDeclarations().toString());
        row.setValue(componentBody.getVariableDeclarations().toString());
        this.symbolTable.getRows().add(row);
        return new ComponentBody(variableDeclarations, functionDeclarations);
    }

    // IF Statement

    @Override
    public Object visitIfStatement(AngularParser.IfStatementContext ctx) {
        Condition condition = (Condition) visit(ctx.condition());

        List<Statement> thenStatements = new ArrayList<>();
        for (AngularParser.StatementContext stmtCtx : ctx.statement()) {
            thenStatements.add((Statement) visit(stmtCtx));
        }

        List<Statement> elseStatements = new ArrayList<>();
        if (ctx.ELSE() != null) {
            for (AngularParser.StatementContext stmtCtx : ctx.statement()) {
                elseStatements.add((Statement) visit(stmtCtx));
            }
        }

        return new ifStatement(condition, thenStatements, elseStatements);
    }

    //Condition

    @Override
    public Object visitCondition(AngularParser.ConditionContext ctx) {
        Expression left = (Expression) visit(ctx.expression(0));
        Expression right = null;
        String operator = null;

        if (ctx.AND() != null) {
            operator = ctx.AND().getText();
            right = (Expression) visit(ctx.expression(1));
        } else if (ctx.OR() != null) {
            operator = ctx.OR().getText();
            right = (Expression) visit(ctx.expression(1));
        }

        if (right != null) {
            return new Condition(left, right, operator);
        } else {
            return new Condition(left, null, null);
        }
    }

    // For Statement

    @Override
    public Object visitForStatement(AngularParser.ForStatementContext ctx) {
        VariableDeclaration variableDeclaration = null;
        Condition condition = null;
        Statement body = null;

        if (ctx.variableDeclaration() != null) {
            variableDeclaration = (VariableDeclaration) visit(ctx.variableDeclaration());
        }

        if (ctx.condition() != null) {
            condition = (Condition) visit(ctx.condition());
        }

        if (ctx.statement(0) != null) {
            body = (Statement) visit(ctx.statement(0));
        }

        List<Statement> statements = new ArrayList<>();
        for (int i = 1; i < ctx.statement().size(); i++) {
            statements.add((Statement) visit(ctx.statement(i)));
        }

        return new ForStatement(variableDeclaration, condition, body);
    }

    // While Statement

    @Override
    public Object visitWhileStatement(AngularParser.WhileStatementContext ctx) {
        Condition condition = (Condition) visit(ctx.condition());
        List<Statement> body = new ArrayList<>();

        for (AngularParser.StatementContext stmtCtx : ctx.statement()) {
            body.add((Statement) visit(stmtCtx));
        }

        return new WhileStatement(condition, body);
    }

    // Call Function

    @Override
    public Object visitCallFunction(AngularParser.CallFunctionContext ctx) {
        String functionName = ctx.ID().getText();
        List<Expression> arguments = new ArrayList<>();

        for (AngularParser.ExpressionContext exprCtx : ctx.expression()) {
            arguments.add((Expression) visit(exprCtx));
        }

        return new CallFunction(functionName, arguments);
    }

    // JSX Element

    @Override
    public Object visitJsxElement(AngularParser.JsxElementContext ctx) {
        if (ctx.selfClosingTag() != null) {
            return new JsxElement((SelfClosingTag) visit(ctx.selfClosingTag()));
        }

        OpeningTag openingTag = (OpeningTag) visit(ctx.openingTag());
        List<JsxContent> jsxContents = new ArrayList<>();
        for (AngularParser.JsxContentContext contentCtx : ctx.jsxContent()) {
            jsxContents.add((JsxContent) visit(contentCtx));
        }
        ClosingTag closingTag = (ClosingTag) visit(ctx.closingTag());
        JsxElement jsxElement = new JsxElement(openingTag, jsxContents, closingTag);
        Row row = new Row();
        row.setType("JSXElement");
        row.setValue(jsxElement.getJsxContents().toString());
        this.symbolTable.getRows().add(row);
        return new JsxElement(openingTag, jsxContents, closingTag);
    }

    // Opening Tag

    @Override
    public Object visitOpeningTag(AngularParser.OpeningTagContext ctx) {
        String id = ctx.ID().getText();
        JsxAttributes jsxAttributes = (JsxAttributes) visit(ctx.jsxAttributes());

        return new OpeningTag(id, jsxAttributes);
    }

    // Closing Tag

    @Override
    public Object visitClosingTag(AngularParser.ClosingTagContext ctx) {
        String id = ctx.ID().getText();
        return new ClosingTag(id);
    }

    // Self Closing Tag

    @Override
    public Object visitSelfClosingTag(AngularParser.SelfClosingTagContext ctx) {
        String id = ctx.ID().getText();
        JsxAttributes jsxAttributes = (JsxAttributes) visit(ctx.jsxAttributes());

        return new SelfClosingTag(id, jsxAttributes);
    }

    // JSX Content

    @Override
    public Object visitJsxContent(AngularParser.JsxContentContext ctx) {
        if (ctx.jsxElement() != null) {
            return new JsxContent((JsxElement) visit(ctx.jsxElement()));
        } else if (ctx.interpolation() != null) {
            return new JsxContent((interpolation) visit(ctx.interpolation()));
        } else if (ctx.ID() != null) {
            return new JsxContent(ctx.ID().getText());
        }

        return null;
    }

    // Interpolation

    @Override
    public Object visitInterpolation(AngularParser.InterpolationContext ctx) {
        Expression expression = (Expression) visit(ctx.expression());
        return new interpolation(expression);
    }

    //Jsx Attributes

    @Override
    public Object visitJsxAttributes(AngularParser.JsxAttributesContext ctx) {
        List<angularDirective> angularDirectives = new ArrayList<>();
        List<JsxAttribute> jsxAttributes = new ArrayList<>();
        List<jsxEvent> jsxEvents = new ArrayList<>();
        List<JsxBinding> jsxBindings = new ArrayList<>();
        List<JsxClass> jsxClasses = new ArrayList<>();

        for (ParseTree child : ctx.children) {
            if (child instanceof AngularParser.DirectiveContext) {
                angularDirectives.add((angularDirective) visit(child));
            } else if (child instanceof AngularParser.JsxAttributeContext) {
                jsxAttributes.add((JsxAttribute) visit(child));
            } else if (child instanceof AngularParser.JsxEventContext) {
                jsxEvents.add((jsxEvent) visit(child));
            } else if (child instanceof AngularParser.JsxBindingContext) {
                jsxBindings.add((JsxBinding) visit(child));
            } else if (child instanceof AngularParser.JsxClassContext) {
                jsxClasses.add((JsxClass) visit(child));
            }
        }

        return new JsxAttributes(angularDirectives, jsxAttributes, jsxEvents, jsxBindings, jsxClasses);
    }

    // Angular Directive

    @Override
    public Object visitAngularDirective(AngularParser.AngularDirectiveContext ctx) {
        String directive = ctx.directive().getText();
        String value = ctx.STRING().getText();
        return new angularDirective(directive, value);
    }

    // Directive

    @Override
    public Object visitDirective(AngularParser.DirectiveContext ctx) {
        if (ctx.NGIF() != null) {
            return Directive.NGIF;
        } else if (ctx.NGSWITCH() != null) {
            return Directive.NGSWITCH;
        } else if (ctx.NGFOR() != null) {
            return Directive.NGFOR;
        } else if (ctx.NGSTYLE() != null) {
            return Directive.NGSTYLE;
        } else if (ctx.NGCLASS() != null) {
            return Directive.NGCLASS;
        }
        return null;
    }

    // JSX Attribute

    @Override
    public Object visitJsxAttribute(AngularParser.JsxAttributeContext ctx) {
        String id = ctx.ID().getText();
        String value = ctx.STRING().getText();
        JsxAttribute jsxAttribute = new JsxAttribute(id, value);
        Row row = new Row();
        row.setType("JSXAttribute");
        row.setValue(jsxAttribute.getId());
        this.symbolTable.getRows().add(row);
        return new JsxAttribute(id, value);
    }

    // JSX Event

    @Override
    public Object visitJsxEvent(AngularParser.JsxEventContext ctx) {
        String id = ctx.ID().getText();
        String value = ctx.STRING().getText();
        return new jsxEvent(id, value);
    }

    // JSX Binding

    @Override
    public Object visitJsxBinding(AngularParser.JsxBindingContext ctx) {
        String id = ctx.ID().getText();

        if (ctx.STRING() != null) {
            String value = ctx.STRING().getText();
            return new JsxBinding(id, value);
        } else if (ctx.interpolation() != null) {
            interpolation interpolation = (interpolation) visit(ctx.interpolation());
            return new JsxBinding(id, interpolation);
        }

        return null;
    }

    // Jsx Class

    @Override
    public Object visitJsxClass(AngularParser.JsxClassContext ctx) {
        String className = ctx.STRING().getText();
        Row row = new Row();
        row.setType("JSXClass");
        row.setValue(className.getClass().toString());
        this.symbolTable.getRows().add(row);
        return new JsxClass(className);
    }

    // Expression

    @Override
    public Object visitExpression(AngularParser.ExpressionContext ctx) {
        if (ctx.ID().size() == 1) {
            return new Expression(ctx.ID(0).getText());
        } else if (ctx.ID().size() == 2) {
            return new Expression(ctx.ID(0).getText() + "." + ctx.ID(1).getText());
        } else if (ctx.STRING() != null) {
            return new Expression(ctx.STRING().getText());
        } else if (ctx.INT() != null) {
            return new Expression(Integer.parseInt(ctx.INT().getText()));
        } else if (ctx.DOUBLE() != null) {
            return new Expression(String.valueOf(Double.parseDouble(ctx.DOUBLE().getText())));
        } else if (ctx.BOOLEAN() != null) {
            return new Expression(String.valueOf(Boolean.parseBoolean(ctx.BOOLEAN().getText())));
        } else if (ctx.value() != null) {
            return new Expression(String.valueOf((Value) visit(ctx.value())));
        } else if (ctx.callFunction() != null) {
            return new Expression(String.valueOf((CallFunction) visit(ctx.callFunction())));
        } else if (ctx.array() != null) {
            return new Expression(String.valueOf((Array) visit(ctx.array())));
        } else if (ctx.object() != null) {
            return new Expression(String.valueOf((Object) visit(ctx.object())));
        } else if (ctx.expression().size() == 2 && ctx.operation() != null) {
            Expression left = (Expression) visit(ctx.expression(0));
            Expression right = (Expression) visit(ctx.expression(1));
            operation op = (operation) visit(ctx.operation());
            return new Expression(left, right, op);
        }

        return null;
    }

    // Type

    @Override
    public Object visitType(AngularParser.TypeContext ctx) {
        return new Type(ctx.getText());
    }

    // Print Statement

    @Override
    public Object visitPrintStatement(AngularParser.PrintStatementContext ctx) {
        List<String> expressions = new ArrayList<>();

        expressions.add(ctx.expression().getText());

        return new Print(expressions);
    }

}
