package AST;

import java.util.Objects;

public class Condition {
    private Expression left;
    private Expression right;
    private String operator;

    public Condition(Expression left, Expression right, String operator) {
        this.left = left;
        this.right = right;
        this.operator = operator;
    }

    public Expression getLeft() {
        return left;
    }

    public Expression getRight() {
        return right;
    }

    public String getOperator() {
        return operator;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Condition that = (Condition) o;
        return Objects.equals(left, that.left) &&
                Objects.equals(right, that.right) &&
                Objects.equals(operator, that.operator);
    }

    @Override
    public int hashCode() {
        return Objects.hash(left, right, operator);
    }
}
