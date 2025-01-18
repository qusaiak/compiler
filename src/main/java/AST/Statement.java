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
        StringBuilder sb = new StringBuilder();
        sb.append("Statement: {\n");
        if (variableDeclaration != null) {
            sb.append("  variableDeclaration=").append(variableDeclaration).append("\n");
        } else if (ifStatement != null) {
            sb.append("  ifStatement=").append(ifStatement).append("\n");
        } else if (forStatement != null) {
            sb.append("  forStatement=").append(forStatement).append("\n");
        } else if (whileStatement != null) {
            sb.append("  whileStatement=").append(whileStatement).append("\n");
        } else if (callFunction != null) {
            sb.append("  callFunction=").append(callFunction).append("\n");
        } else if (printStatement != null) {
            sb.append("  printStatement=").append(printStatement).append("\n");
        } else if (jsxElement != null) {
            sb.append("  jsxElement=").append(jsxElement).append("\n");
        } else if (directive != null) {
            sb.append("  directive=").append(directive).append("\n");
        } else if (returnStatement != null) {
            sb.append("  returnStatement=").append(returnStatement).append("\n");
        } else if (assignment != null) {
            sb.append("  assignment=").append(assignment).append("\n");
        }
        sb.append("}");
        return sb.toString();
    }

}
