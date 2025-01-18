package AST;

public class JsxBinding {
    private String id;
    private String value;
    private interpolation interpolation;

    public JsxBinding(String id, String value) {
        this.id = id;
        this.value = value;
    }

    public JsxBinding(String id, interpolation interpolation) {
        this.id = id;
        this.interpolation = interpolation;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public interpolation getInterpolation() {
        return interpolation;
    }

    public void setInterpolation(interpolation interpolation) {
        this.interpolation = interpolation;
    }

    @Override
    public String toString() {
        if (value != null) {
            return "JsxBinding{" +
                    "id='" + id + '\'' +
                    ", value='" + value + '\'' +
                    '}';
        } else {
            return "JsxBinding{" +
                    "id='" + id + '\'' +
                    ", interpolation=" + interpolation +
                    '}';
        }
    }
}
