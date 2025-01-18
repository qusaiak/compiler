package AST;

public class interpolation {
    private Expression expression;

    public interpolation(Expression expression) {
        this.expression = expression;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        return "Interpolation{" +
                "expression=" + expression +
                '}';
    }
}
