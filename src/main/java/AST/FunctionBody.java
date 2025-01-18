package AST;

import java.util.List;

public class FunctionBody {
    private List<Statement> statements;
    private ReturnStatement returnStatement;

    public FunctionBody(List<Statement> statements, ReturnStatement returnStatement) {
        this.statements = statements;
        this.returnStatement = returnStatement;
    }

    public List<Statement> getStatements() {
        return statements;
    }

    public void setStatements(List<Statement> statements) {
        this.statements = statements;
    }

    public ReturnStatement getReturnStatement() {
        return returnStatement;
    }

    public void setReturnStatement(ReturnStatement returnStatement) {
        this.returnStatement = returnStatement;
    }

    @Override
    public String toString() {
        return "FunctionBody{" +
                "statements=" + statements +
                ", returnStatement=" + returnStatement +
                '}';
    }
}
