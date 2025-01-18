package AST;

public class jsxEvent {
    private String id;
    private String value;

    public jsxEvent(String id, String value) {
        this.id = id;
        this.value = value;
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

    @Override
    public String toString() {
        return "JsxEvent: {\n" +
                "  id='" + id + "',\n" +
                "  value='" + value + "'\n" +
                "}";
    }

}
