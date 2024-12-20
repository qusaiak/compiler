package AST;

import java.util.List;

public class ForStatement {
    private VariableDeclaration variableDeclaration;
    private Condition condition;
    private FunctionStatement statement;
    private List<FunctionStatement> bodyStatements;

    public VariableDeclaration getVariableDeclaration() {
        return variableDeclaration;
    }

    public void setVariableDeclaration(VariableDeclaration variableDeclaration) {
        this.variableDeclaration = variableDeclaration;
    }

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    public FunctionStatement getStatement() {
        return statement;
    }

    public void setStatement(FunctionStatement statement) {
        this.statement = statement;
    }

    public List<FunctionStatement> getBodyStatements() {
        return bodyStatements;
    }

    public void setBodyStatements(List<FunctionStatement> bodyStatements) {
        this.bodyStatements = bodyStatements;
    }

    @Override
    public String toString() {
        return "ForStatement{" +
                "\nvariableDeclaration=" + variableDeclaration +
                "\ncondition=" + condition +
                "\nstatement=" + statement +
                "\nbodyStatements=" + bodyStatements +
                "\n}";
    }
}
