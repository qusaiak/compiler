package AST;

public class SelfClosingTag {
    private String id;
    private JsxAttributes jsxAttributes;

    public SelfClosingTag(String id, JsxAttributes jsxAttributes) {
        this.id = id;
        this.jsxAttributes = jsxAttributes;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public JsxAttributes getJsxAttributes() {
        return jsxAttributes;
    }

    public void setJsxAttributes(JsxAttributes jsxAttributes) {
        this.jsxAttributes = jsxAttributes;
    }

    @Override
    public String toString() {
        return "SelfClosingTag{" +
                "id='" + id + '\'' +
                ", jsxAttributes=" + jsxAttributes +
                '}';
    }
}
