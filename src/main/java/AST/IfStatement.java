package AST;

import java.util.List;
import java.util.Objects;

public class ifStatement {
    private Condition condition;
    private List<Statement> thenStatements;
    private List<Statement> elseStatements;

    public ifStatement(Condition condition, List<Statement> thenStatements, List<Statement> elseStatements) {
        this.condition = condition;
        this.thenStatements = thenStatements;
        this.elseStatements = elseStatements;
    }

    public Condition getCondition() {
        return condition;
    }

    public List<Statement> getThenStatements() {
        return thenStatements;
    }

    public List<Statement> getElseStatements() {
        return elseStatements;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ifStatement that = (ifStatement) o;
        return Objects.equals(condition, that.condition) &&
                Objects.equals(thenStatements, that.thenStatements) &&
                Objects.equals(elseStatements, that.elseStatements);
    }

    @Override
    public int hashCode() {
        return Objects.hash(condition, thenStatements, elseStatements);
    }
}
