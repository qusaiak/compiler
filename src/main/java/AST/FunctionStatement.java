package AST;

public class FunctionStatement {
    private VariableDeclaration variableDeclaration;
    private IfStatement ifStatement;
    private ForStatement forStatement;
    private WhileStatement whileStatement;
    private CallFunction callFunction;
    private Print printStatement;
    private JsxElement jsxElement;
    private Directives directive;

    public VariableDeclaration getVariableDeclaration() {
        return variableDeclaration;
    }

    public void setVariableDeclaration(VariableDeclaration variableDeclaration) {
        this.variableDeclaration = variableDeclaration;
    }

    public IfStatement getIfStatement() {
        return ifStatement;
    }

    public void setIfStatement(IfStatement ifStatement) {
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

    public Directives getDirective() {
        return directive;
    }

    public void setDirective(Directives directive) {
        this.directive = directive;
    }

    @Override
    public String toString() {
        if (variableDeclaration != null) {
            return "FunctionStatement{" +
                    "\nvariableDeclaration=" + variableDeclaration +
                    "\n}";
        }

        if (ifStatement != null) {
            return "FunctionStatement{" +
                    "\nifStatement=" + ifStatement +
                    "\n}";
        }

        if (forStatement != null) {
            return "FunctionStatement{" +
                    "\nforStatement=" + forStatement +
                    "\n}";
        }

        if (whileStatement != null) {
            return "FunctionStatement{" +
                    "\nwhileStatement=" + whileStatement +
                    "\n}";
        }

        if (callFunction != null) {
            return "FunctionStatement{" +
                    "\ncallFunction=" + callFunction +
                    "\n}";
        }

        if (printStatement != null) {
            return "FunctionStatement{" +
                    "\nprintStatement=" + printStatement +
                    "\n}";
        }

        if (jsxElement != null) {
            return "FunctionStatement{" +
                    "\njsxElement=" + jsxElement +
                    "\n}";
        }

        if (directive != null) {
            return "FunctionStatement{" +
                    "\ndirective=" + directive +
                    "\n}";
        }

        return "FunctionStatement{}";
    }
}
