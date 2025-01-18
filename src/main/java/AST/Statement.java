package AST;

public class Statement {
    private VariableDeclaration variableDeclaration;
    private ifStatement ifStatement;
    private ForStatement forStatement;
    private WhileStatement whileStatement;
    private CallFunction callFunction;
    private Print printStatement;
    private JsxElement jsxElement;
    private angularDirective directive;
    private ReturnStatement returnStatement;
    private Assignments assignment;

    public Statement(VariableDeclaration variableDeclaration) {
        this.variableDeclaration = variableDeclaration;
    }

    public Statement(ifStatement ifStatement) {
        this.ifStatement = ifStatement;
    }

    public Statement(ForStatement forStatement) {
        this.forStatement = forStatement;
    }

    public Statement(WhileStatement whileStatement) {
        this.whileStatement = whileStatement;
    }

    public Statement(CallFunction callFunction) {
        this.callFunction = callFunction;
    }

    public Statement(Print printStatement) {
        this.printStatement = printStatement;
    }

    public Statement(JsxElement jsxElement) {
        this.jsxElement = jsxElement;
    }

    public Statement(angularDirective angularDirective) {
        this.directive = angularDirective;
    }

    public Statement(ReturnStatement returnStatement) {
        this.returnStatement = returnStatement;
    }

    public Statement(Assignments assignment) {
        this.assignment = assignment;
    }

    public VariableDeclaration getVariableDeclaration() {
        return variableDeclaration;
    }

    public void setVariableDeclaration(VariableDeclaration variableDeclaration) {
        this.variableDeclaration = variableDeclaration;
    }

    public ifStatement getifStatement() {
        return ifStatement;
    }

    public void setifStatement(ifStatement ifStatement) {
        this.ifStatement = ifStatement;
    }

    public ForStatement getForStatement() {
        return forStatement;
    }

    public void setForStatement(ForStatement forStatement) {
        this.forStatement = forStatement;
    }

    public WhileStatement getWhileStatement() {
        return whileStatement;
    }

    public void setWhileStatement(WhileStatement whileStatement) {
        this.whileStatement = whileStatement;
    }

    public CallFunction getCallFunction() {
        return callFunction;
    }

    public void setCallFunction(CallFunction callFunction) {
        this.callFunction = callFunction;
    }

    public Print getPrintStatement() {
        return printStatement;
    }

    public void setPrintStatement(Print printStatement) {
        this.printStatement = printStatement;
    }

    public JsxElement getJsxElement() {
        return jsxElement;
    }

    public void setJsxElement(JsxElement jsxElement) {
        this.jsxElement = jsxElement;
    }

    public angularDirective getDirective() {
        return directive;
    }

    public void setDirectives(angularDirective directive) {
        this.directive = directive;
    }

    public ReturnStatement getReturnStatement() {
        return returnStatement;
    }

    public void setReturnStatement(ReturnStatement returnStatement) {
        this.returnStatement = returnStatement;
    }

    public Assignments getAssignment() {
        return assignment;
    }

    public void setAssignment(Assignments assignment) {
        this.assignment = assignment;
    }

    @Override
    public String toString() {
        if (variableDeclaration != null) {
            return "Statement{" +
                    "variableDeclaration=" + variableDeclaration +
                    '}';
        } else if (ifStatement != null) {
            return "Statement{" +
                    "ifStatement=" + ifStatement +
                    '}';
        } else if (forStatement != null) {
            return "Statement{" +
                    "forStatement=" + forStatement +
                    '}';
        } else if (whileStatement != null) {
            return "Statement{" +
                    "whileStatement=" + whileStatement +
                    '}';
        } else if (callFunction != null) {
            return "Statement{" +
                    "callFunction=" + callFunction +
                    '}';
        } else if (printStatement != null) {
            return "Statement{" +
                    "printStatement=" + printStatement +
                    '}';
        } else if (jsxElement != null) {
            return "Statement{" +
                    "jsxElement=" + jsxElement +
                    '}';
        } else if (directive != null) {
            return "Statement{" +
                    "Directives=" + directive +
                    '}';
        } else if (returnStatement != null) {
            return "Statement{" +
                    "returnStatement=" + returnStatement +
                    '}';
        } else {
            return "Statement{" +
                    "assignment=" + assignment +
                    '}';
        }
    }
}
