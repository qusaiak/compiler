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
        if (jsxElement != null) {
            return "JsxContent{" +
                    "\njsxElement=" + jsxElement +
                    "\n}";
        } else if (interpolation != null) {
            return "JsxContent{" +
                    "\ninterpolation=" + interpolation +
                    "\n}";
        } else if (id != null) {
            return "JsxContent{" +
                    "\nid='" + id + '\'' +
                    "\n}";
        } else {
            return "JsxContent{}";
        }
    }
}
