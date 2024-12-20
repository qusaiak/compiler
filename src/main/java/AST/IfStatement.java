package AST;

import java.util.List;

public class IfStatement {
    private Condition condition;
    private List<FunctionStatement> thenStatements;
    private List<FunctionStatement> elseStatements;

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    public List<FunctionStatement> getThenStatements() {
        return thenStatements;
    }

    public void setThenStatements(List<FunctionStatement> thenStatements) {
        this.thenStatements = thenStatements;
    }

    public List<FunctionStatement> getElseStatements() {
        return elseStatements;
    }

    public void setElseStatements(List<FunctionStatement> elseStatements) {
        this.elseStatements = elseStatements;
    }

    @Override
    public String toString() {
        return "IfStatement{" +
                "\ncondition=" + condition +
                "\nthenStatements=" + thenStatements +
                "\nelseStatements=" + elseStatements +
                "\n}";
    }
}
