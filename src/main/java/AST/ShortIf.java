package AST;

public class ShortIf {
    private Condition condition;
    private JsxElement jsxElement;

    public ShortIf(Condition condition, JsxElement jsxElement) {
        this.condition = condition;
        this.jsxElement = jsxElement;
    }

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    public JsxElement getJsxElement() {
        return jsxElement;
    }

    public void setJsxElement(JsxElement jsxElement) {
        this.jsxElement = jsxElement;
    }

    @Override
    public String toString() {
        return "ShortIf{" +
                "condition=" + condition +
                ", jsxElement=" + jsxElement +
                '}';
    }
}

