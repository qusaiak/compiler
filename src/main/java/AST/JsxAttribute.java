package AST;

public class JsxAttribute {
    private final String name;
    private final Value value;

    public JsxAttribute(String name, Value value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public Value getValue() {
        return value;
    }

    @Override
    public String toString() {
        return name + "=\"" + value.toString() + "\"";
    }
}
