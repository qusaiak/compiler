package AST;

import java.util.Objects;

public class ForStatement {
    private VariableDeclaration variableDeclaration;
    private Condition condition;
    private Statement body;

    public ForStatement(VariableDeclaration variableDeclaration, Condition condition, Statement body) {
        this.variableDeclaration = variableDeclaration;
        this.condition = condition;
        this.body = body;
    }

    public VariableDeclaration getVariableDeclaration() {
        return variableDeclaration;
    }

    public Condition getCondition() {
        return condition;
    }

    public Statement getBody() {
        return body;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ForStatement that = (ForStatement) o;
        return Objects.equals(variableDeclaration, that.variableDeclaration) &&
                Objects.equals(condition, that.condition) &&
                Objects.equals(body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(variableDeclaration, condition, body);
    }
}
