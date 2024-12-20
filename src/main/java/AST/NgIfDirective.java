package AST;

public class NgIfDirective {
    private boolean condition;

    public NgIfDirective() {}

    public boolean getCondition() {
        return condition;
    }

    public void setCondition(boolean condition) {
        this.condition = condition;
    }

    @Override
    public String toString() {
        return "NgIfDirective{" +
                "condition=" + condition +
                '}';
    }
}
