package AST;

public class JsxContent {
    private JsxElement jsxElement;
    private interpolation interpolation;
    private String id;

    public JsxContent(JsxElement jsxElement) {
        this.jsxElement = jsxElement;
    }

    public JsxContent(interpolation interpolation) {
        this.interpolation = interpolation;
    }

    public JsxContent(String id) {
        this.id = id;
    }

    public JsxElement getJsxElement() {
        return jsxElement;
    }

    public void setJsxElement(JsxElement jsxElement) {
        this.jsxElement = jsxElement;
    }

    public interpolation getInterpolation() {
        return interpolation;
    }

    public void setInterpolation(interpolation interpolation) {
        this.interpolation = interpolation;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("JsxContent: {\n");
        if (jsxElement != null) {
            sb.append("  jsxElement=").append(jsxElement).append("\n");
        }
        if (interpolation != null) {
            sb.append("  interpolation=").append(interpolation).append("\n");
        }
        if (id != null) {
            sb.append("  id='").append(id).append("'\n");
        }
        sb.append("}");
        return sb.toString();
    }

}
