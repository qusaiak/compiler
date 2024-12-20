package Visitor;
import AST.*;
import org.Angular.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class BaseVisitor extends AngularParserBaseVisitor<Object> {

    @Override
    public Object visitProgram(AngularParser.ProgramContext ctx) {
        Program program = new Program();

        List<AngularParser.ImportStatementContext> importStatements = ctx.importStatement();
        for (AngularParser.ImportStatementContext importCtx : importStatements) {
            program.getImportStatements().add((ImportStatement) visit(importCtx));
        }

        for (AngularParser.VariableDeclarationContext varCtx : ctx.variableDeclaration()) {
            program.getVariableDeclarations().add((VariableDeclaration) visit(varCtx));
        }
        for (AngularParser.ClassDeclarationContext classCtx : ctx.classDeclaration()) {
            program.getClassDeclarations().add((ClassDeclaration) visit(classCtx));
        }
        for (AngularParser.FunctionDeclarationContext funcCtx : ctx.functionDeclaration()) {
            program.getFunctionDeclarations().add((FunctionDeclaration) visit(funcCtx));
        }
        for (AngularParser.ComponentDeclarationContext compCtx : ctx.componentDeclaration()) {
            program.getComponentDeclarations().add((ComponentDeclaration) visit(compCtx));
        }

        if (ctx.exportStatement() != null) {
            program.setExportStatement((ExportStatement) visit(ctx.exportStatement()));
        }

        return program;
    }

    @Override
    public Object visitImportStatement(AngularParser.ImportStatementContext ctx) {
        ImportStatement importStatement = new ImportStatement();
        if (ctx.ID() != null && !ctx.ID().isEmpty()) {
            importStatement.setImportId(ctx.ID(0).getText());
        }
        if (ctx.STRING() != null) {
            importStatement.setFrom(ctx.STRING().getText());
        }
        return importStatement;
    }

    @Override
    public Object visitExportStatement(AngularParser.ExportStatementContext ctx) {
        ExportStatement exportStatement = new ExportStatement();
        if (ctx.DEFAULT() != null) {
            exportStatement.setDefaultExport(true);
        }
        exportStatement.setClassName(ctx.CLASS().getText());
        return exportStatement;
    }

    @Override
    public Object visitVariableDeclaration(AngularParser.VariableDeclarationContext ctx) {
        VariableDeclaration variableDeclaration = new VariableDeclaration();
        variableDeclaration.setType(ctx.getChild(0).getText());
        variableDeclaration.setId(ctx.ID().getText());
        variableDeclaration.setValue((Value) visit(ctx.value()));
        return variableDeclaration;
    }

    @Override
    public Object visitClassDeclaration(AngularParser.ClassDeclarationContext ctx) {
        ClassDeclaration classDeclaration = new ClassDeclaration();
        classDeclaration.setClassName(ctx.ID(0).getText());
        if (ctx.EXTENDS() != null) {
            classDeclaration.setSuperClass(ctx.ID(1).getText());
        }
        if (ctx.IMPLEMENTS() != null) {
            List<String> implementsList = new ArrayList<>();
            for (int i = 1; i < ctx.ID().size(); i++) {
                implementsList.add(ctx.ID(i).getText());
            }
            classDeclaration.setInterfaces(implementsList);
        }
        classDeclaration.setClassBody((ClassBody) visit(ctx.classBody()));
        return classDeclaration;
    }

    @Override
    public Object visitFunctionDeclaration(AngularParser.FunctionDeclarationContext ctx) {
        FunctionDeclaration functionDeclaration = new FunctionDeclaration();

        RegularFunction regularFunction = new RegularFunction();
        regularFunction.setFunctionName(ctx.ID().getText());

        if (ctx.parameters() != null) {
            regularFunction.setParameters((Parameters) visit(ctx.parameters()));
        }

        regularFunction.setFunctionBody((FunctionBody) visit(ctx.functionBody()));
        functionDeclaration.setRegularFunction(regularFunction);

        return functionDeclaration;
    }

    @Override
    public Object visitComponentDeclaration(AngularParser.ComponentDeclarationContext ctx) {
        ComponentDeclaration componentDeclaration = new ComponentDeclaration();
        componentDeclaration.setDecorator((Decorator) visit(ctx.decorator()));
        componentDeclaration.setComponentBody((ComponentBody) visit(ctx.componentBody()));
        return componentDeclaration;
    }
    @Override
    public Object visitValue(AngularParser.ValueContext ctx) {
        Value value = null;
        if (ctx.STRING() != null) {
            value = new Value(ctx.STRING().getText());
        } else if (ctx.INT() != null) {
            value = new Value(Integer.parseInt(ctx.INT().getText()));
        } else if (ctx.DOUBLE() != null) {
            value = new Value(Double.parseDouble(ctx.DOUBLE().getText()));
        } else if (ctx.BOOLEAN() != null) {
            value = new Value(Boolean.parseBoolean(ctx.BOOLEAN().getText()));
        } else if (ctx.NULL() != null) {
            value = new Value(true);
        } else if (ctx.array() != null) {
            value = new Value((List<Value>) visit(ctx.array()));
        } else if (ctx.object() != null) {
            value = new Value((Object) visit(ctx.object()));
        } else if (ctx.jsxElement() != null) {
            value = new Value((JsxElement) visit(ctx.jsxElement()));
        } else if (ctx.directive() != null) {
            value = new Value((Directives) visit(ctx.directive()));
        }
        return value;
    }
    @Override
    public Object visitArray(AngularParser.ArrayContext ctx) {
        List<Value> values = new ArrayList<>();
        for (AngularParser.ValueContext valueCtx : ctx.value()) {
            values.add((Value) visit(valueCtx));
        }
        return values;
    }
    @Override
    public Object visitObject(AngularParser.ObjectContext ctx) {
        Map<String, Value> objectMap = new HashMap<>();
        for (int i = 0; i < ctx.ID().size(); i++) {
            String key = ctx.ID(i).getText();
            Value value = (Value) visit(ctx.value(i));
            objectMap.put(key, value);
        }
        return objectMap;
    }
    @Override
    public Object visitJsxElement(AngularParser.JsxElementContext ctx) {
        String tagName = ctx.ID(0).getText();
        List<JsxAttribute> attributes = new ArrayList<>();
        List<Directives> directives = new ArrayList<>();
        List<Value> children = new ArrayList<>();

        for (AngularParser.JsxAttributeContext attrCtx : ctx.jsxAttribute()) {
            attributes.add((JsxAttribute) visit(attrCtx));
        }
        for (AngularParser.DirectiveContext dirCtx : ctx.directive()) {
            directives.add((Directives) visit(dirCtx));
        }
        for (AngularParser.ContentContext contentCtx : ctx.content()) {
            children.add((Value) visit(contentCtx));
        }

        return new JsxElement(tagName, attributes, children, directives);
    }
    @Override
    public Object visitDirective(AngularParser.DirectiveContext ctx) {
        if (ctx.NGIF() != null) {
            NgIfDirective ngIfDirective = new NgIfDirective();
            ngIfDirective.setCondition((Boolean) visit(ctx.condition()));
            return ngIfDirective;
        } else if (ctx.NGSWITCH() != null) {
            NgSwitchCaseDirective<Object> ngSwitchDirective = new NgSwitchCaseDirective<>();
            ngSwitchDirective.setCaseValue(visit(ctx.expression()));
            return ngSwitchDirective;
        } else if (ctx.NGFOR() != null) {
            NgForDirective<Object> ngForDirective = new NgForDirective<>();
            ngForDirective.setItems((List<Object>) visit(ctx.expression()));
            return ngForDirective;
        } else if (ctx.NGSTYLE() != null) {
            NgStyleDirective ngStyleDirective = new NgStyleDirective();
            ngStyleDirective.setStyles((Map<String, String>) visit(ctx.expression()));
            return ngStyleDirective;
        } else if (ctx.NGCLASS() != null) {
            NgClassDirective ngClassDirective = new NgClassDirective();
            ngClassDirective.setClasses((Map<String, Boolean>) visit(ctx.expression()));
            return ngClassDirective;
        }
        return null;
    }
    @Override
    public Object visitClassBody(AngularParser.ClassBodyContext ctx) {
        ClassBody classBody = new ClassBody();

        if (ctx.decorator() != null) {
            classBody.setDecorator((Decorator) visit(ctx.decorator()));
        }
        if (ctx.functionDeclaration() != null) {
            classBody.setFunctionDeclaration((FunctionDeclaration) visit(ctx.functionDeclaration()));
        }
        if (ctx.variableDeclaration() != null) {
            classBody.setVariableDeclaration((VariableDeclaration) visit(ctx.variableDeclaration()));
        }
        if (ctx.constructorDeclaration() != null) {
            classBody.setConstructorDeclaration((ConstructorDeclaration) visit(ctx.constructorDeclaration()));
        }

        return classBody;
    }

    @Override
    public Object visitConstructorDeclaration(AngularParser.ConstructorDeclarationContext ctx) {
        ConstructorDeclaration constructorDeclaration = new ConstructorDeclaration();

        if (ctx.parameters() != null) {
            constructorDeclaration.setParameters((Parameters) visit(ctx.parameters()));
        }

        constructorDeclaration.setFunctionBody((FunctionBody) visit(ctx.functionBody()));

        return constructorDeclaration;
    }
    @Override
    public Object visitDecorator(AngularParser.DecoratorContext ctx) {
        Decorator decorator = new Decorator();
        decorator.setId(ctx.ID().getText());

        if (ctx.decoratorArguments() != null) {
            decorator.setDecoratorArguments((List<Object>) visit(ctx.decoratorArguments()));
        }

        return decorator;
    }
    @Override
    public Object visitDecoratorArguments(AngularParser.DecoratorArgumentsContext ctx) {
        List<DecoratorArgument> arguments = new ArrayList<>();

        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);
            DecoratorArgument decoratorArgument = new DecoratorArgument();

            if (child instanceof AngularParser.ValueContext) {
                decoratorArgument.setValue((Value) visit(child));
                arguments.add(decoratorArgument);
            } else if (child.getText().startsWith("{") && child.getText().endsWith("}")) {
                decoratorArgument.setJson(child.getText());
                arguments.add(decoratorArgument);
            } else if (child instanceof TerminalNode terminalNode) {
                decoratorArgument.setId(terminalNode.getText());
                arguments.add(decoratorArgument);
            }
        }

        return arguments;
    }
    @Override
    public Object visitParameters(AngularParser.ParametersContext ctx) {
        Parameters parameters = new Parameters();
        List<String> ids = new ArrayList<>();

        for (TerminalNode idNode : ctx.ID()) {
            ids.add(idNode.getText());
        }

        parameters.setIds(ids);
        return parameters;
    }
    @Override
    public Object visitFunctionBody(AngularParser.FunctionBodyContext ctx) {
        FunctionBody functionBody = new FunctionBody();
        List<FunctionStatement> FunctionStatementList = new ArrayList<>();

        for (AngularParser.StatementContext statementCtx : ctx.statement()) {
            FunctionStatementList.add((FunctionStatement) visit(statementCtx));
        }

        if (ctx.returnStatement() != null) {
            functionBody.setReturnStatement((ReturnStatement) visit(ctx.returnStatement()));
        }

        functionBody.setFunctionStatementList(FunctionStatementList);
        return functionBody;
    }
    @Override
    public Object visitReturnStatement(AngularParser.ReturnStatementContext ctx) {
        ReturnStatement returnStatement = new ReturnStatement();
        List<JsxElement> jsxElementList = new ArrayList<>();

        for (int i = 0; i < ctx.getChildCount(); i++) {
            if (ctx.getChild(i) instanceof AngularParser.JsxElementContext) {
                jsxElementList.add((JsxElement) visit(ctx.getChild(i)));
            }
        }

        returnStatement.setJsxElementList(jsxElementList);
        return returnStatement;
    }
    @Override
    public Object visitStatement(AngularParser.StatementContext ctx) {
        FunctionStatement FunctionStatement = null;

        if (ctx.forStatement() != null) {
            ForStatement forStatement = new ForStatement();
            forStatement.setVariableDeclaration((VariableDeclaration) visit(ctx.forStatement().variableDeclaration()));
            forStatement.setCondition((Condition) visit(ctx.forStatement().condition()));

            List<FunctionStatement> bodyStatements = new ArrayList<>();
            for (AngularParser.StatementContext statementCtx : ctx.forStatement().statement()) {
                bodyStatements.add((FunctionStatement) visit(statementCtx));
            }
            forStatement.setBodyStatements(bodyStatements);

            FunctionStatement = forStatement.getStatement();
        }

        return FunctionStatement;
    }
    @Override
    public Object visitComponentBody(AngularParser.ComponentBodyContext ctx) {
        ComponentBody componentBody = new ComponentBody();
        List<VariableDeclaration> variableDeclarations = new ArrayList<>();
        List<FunctionDeclaration> functionDeclarations = new ArrayList<>();

        for (AngularParser.VariableDeclarationContext variableCtx : ctx.variableDeclaration()) {
            variableDeclarations.add((VariableDeclaration) visit(variableCtx));
        }

        for (AngularParser.FunctionDeclarationContext functionCtx : ctx.functionDeclaration()) {
            functionDeclarations.add((FunctionDeclaration) visit(functionCtx));
        }

        componentBody.setVariableDeclarations(variableDeclarations);
        componentBody.setFunctionDeclarations(functionDeclarations);

        return componentBody;
    }
    @Override
    public Object visitIfStatement(AngularParser.IfStatementContext ctx) {
        IfStatement ifStatement = new IfStatement();
        ifStatement.setCondition((Condition) visit(ctx.condition()));

        List<FunctionStatement> thenStatements = new ArrayList<>();
        for (ParseTree child : ctx.statement(0).children) {
            if (child instanceof AngularParser.StatementContext) {
                thenStatements.add((FunctionStatement) visit(child));
            }
        }
        ifStatement.setThenStatements(thenStatements);

        List<FunctionStatement> elseStatements = new ArrayList<>();
        if (ctx.statement().size() > 1) {
            for (ParseTree child : ctx.statement(1).children) {
                if (child instanceof AngularParser.StatementContext) {
                    elseStatements.add((FunctionStatement) visit(child));
                }
            }
        }
        ifStatement.setElseStatements(elseStatements);

        return ifStatement;
    }


    @Override
    public Object visitCondition(AngularParser.ConditionContext ctx) {
        Condition condition = new Condition();
        condition.setLeftExpression((Expression) visit(ctx.expression(0)));
        condition.setRightExpression((Expression) visit(ctx.expression(1)));
        condition.setOperator(ctx.getChild(1).getText());
        return condition;
    }
    @Override
    public Object visitForStatement(AngularParser.ForStatementContext ctx) {
        ForStatement forStatement = new ForStatement();
        forStatement.setVariableDeclaration((VariableDeclaration) visit(ctx.variableDeclaration()));
        forStatement.setCondition((Condition) visit(ctx.condition()));

        List<FunctionStatement> bodyStatements = new ArrayList<>();
        for (ParseTree child : ctx.children) {
            if (child instanceof AngularParser.StatementContext) {
                bodyStatements.add((FunctionStatement) visit(child));
            }
        }
        forStatement.setBodyStatements(bodyStatements);

        return forStatement;
    }


    @Override
    public Object visitWhileStatement(AngularParser.WhileStatementContext ctx) {
        WhileStatement whileStatement = new WhileStatement();
        whileStatement.setCondition((Condition) visit(ctx.condition()));

        List<FunctionStatement> bodyStatements = new ArrayList<>();
        for (ParseTree child : ctx.children) {
            if (child instanceof AngularParser.StatementContext) {
                bodyStatements.add((FunctionStatement) visit(child));
            }
        }
        whileStatement.setBodyStatements(bodyStatements);

        return whileStatement;
    }
    @Override
    public Object visitExpression(AngularParser.ExpressionContext ctx) {
        Expression expression = new Expression();

        if (ctx.value() != null) {
            expression.setValue((Value) visit(ctx.value()));
        } else if (ctx.ID().size() == 1) {
            expression.setId(ctx.ID(0).getText());
        } else if (ctx.ID().size() == 2) {
            expression.setComplexId(ctx.ID(0).getText() + "." + ctx.ID(1).getText());
        } else if (ctx.callFunction() != null) {
            expression.setCallFunction((CallFunction) visit(ctx.callFunction()));
        } else if (ctx.directive() != null) {
            expression.setDirective((Directives) visit(ctx.directive()));
        }

        return expression;
    }
    @Override
    public Object visitCallFunction(AngularParser.CallFunctionContext ctx) {
        CallFunction callFunction = new CallFunction();
        callFunction.setFunctionName(ctx.ID().getText());

        List<String> arguments = new ArrayList<>();
        for (AngularParser.ExpressionContext exprCtx : ctx.expression()) {
            arguments.add(visit(exprCtx).toString());
        }
        callFunction.setArguments(arguments);

        return callFunction;
    }

    @Override
    public Object visitJsxAttribute(AngularParser.JsxAttributeContext ctx) {
        String name = ctx.ID().getText();
        Value value = (Value) visit(ctx.expression());

        return new JsxAttribute(name, value);
    }


    @Override
    public Object visitJsxClass(AngularParser.JsxClassContext ctx) {
        String className = ctx.STRING().getText();

        System.out.println("JSX Class: " + className);

        return className;
    }
    @Override
    public Object visitContent(AngularParser.ContentContext ctx) {
        if (ctx.jsxElement() != null) {
            return visit(ctx.jsxElement());
        } else if (ctx.shortIf() != null) {
            return visit(ctx.shortIf());
        } else if (ctx.callFunction() != null) {
            return visit(ctx.callFunction());
        } else if (ctx.ID() != null) {
            return ctx.ID().getText();
        }
        return null;
    }

    @Override
    public Object visitShortIf(AngularParser.ShortIfContext ctx) {
        boolean condition = Boolean.parseBoolean(ctx.condition().getText());
        JsxElement jsxElement = (JsxElement) visit(ctx.jsxElement());

        if (condition) {
            return jsxElement;
        }
        return null;
    }
    @Override
    public Object visitType(AngularParser.TypeContext ctx) {
        Type type;

        if (ctx.ID() != null) {
            type = new Type(ctx.ID().getText(), Type.TypeCategory.ID);
        } else if (ctx.STRING() != null) {
            type = new Type(ctx.STRING().getText(), Type.TypeCategory.STRING);
        } else if (ctx.INT() != null) {
            type = new Type(ctx.INT().getText(), Type.TypeCategory.INT);
        } else if (ctx.DOUBLE() != null) {
            type = new Type(ctx.DOUBLE().getText(), Type.TypeCategory.DOUBLE);
        } else if (ctx.BOOLEAN() != null) {
            type = new Type(ctx.BOOLEAN().getText(), Type.TypeCategory.BOOLEAN);
        } else {
            type = new Type("undefined", Type.TypeCategory.UNDEFINED);
        }

        return type;
    }
    @Override
    public Object visitPrintStatement(AngularParser.PrintStatementContext ctx) {
        Print print = new Print();

        String expressionString = visit(ctx.expression()).toString();
        List<String> strings = new ArrayList<>();
        strings.add(expressionString);
        print.setStrings(strings);

        return print;
    }

}
