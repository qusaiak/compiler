package AST;

public class Condition {
    private Expression leftExpression;
    private Expression rightExpression;
    private String operator;

    public Expression getLeftExpression() {
        return leftExpression;
    }

    public void setLeftExpression(Expression leftExpression) {
        this.leftExpression = leftExpression;
    }

    public Expression getRightExpression() {
        return rightExpression;
    }

    public void setRightExpression(Expression rightExpression) {
        this.rightExpression = rightExpression;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    @Override
    public String toString() {
        return "Condition{" +
                "\nleftExpression=" + leftExpression +
                "\nrightExpression=" + rightExpression +
                "\noperator='" + operator + '\'' +
                "\n}";
    }
}
