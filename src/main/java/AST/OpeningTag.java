package AST;

public class OpeningTag {
    private String id;
    private JsxAttributes jsxAttributes;

    public OpeningTag(String id, JsxAttributes jsxAttributes) {
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
        StringBuilder sb = new StringBuilder();
        sb.append("OpeningTag: {\n");
        sb.append("  id='").append(id).append("'\n");
        if (jsxAttributes != null) {
            sb.append("  jsxAttributes=").append(jsxAttributes).append("\n");
        }
        sb.append("}");
        return sb.toString();
    }

}
