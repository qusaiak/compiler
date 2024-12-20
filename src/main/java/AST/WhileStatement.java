package AST;

import java.util.List;

public class WhileStatement {
    private Condition condition;
    private List<FunctionStatement> bodyStatements;

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    public List<FunctionStatement> getBodyStatements() {
        return bodyStatements;
    }

    public void setBodyStatements(List<FunctionStatement> bodyStatements) {
        this.bodyStatements = bodyStatements;
    }

    @Override
    public String toString() {
        return "WhileStatement{" +
                "\ncondition=" + condition +
                "\nbodyStatements=" + bodyStatements +
                "\n}";
    }
}
