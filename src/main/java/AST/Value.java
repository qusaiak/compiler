package AST;

import java.util.List;

public class Value {
    private String stringValue;
    private Integer intValue;
    private Double doubleValue;
    private Boolean booleanValue;
    private Object nestedObject;
    private List<Value> nestedArray;
    private JsxElement jsxElement;
    private boolean isNull;

    public Value(String stringValue) {
        this.stringValue = stringValue;
    }

    public Value(Integer intValue) {
        this.intValue = intValue;
    }

    public Value(Double doubleValue) {
        this.doubleValue = doubleValue;
    }

    public Value(Boolean booleanValue) {
        this.booleanValue = booleanValue;
    }

    public Value(Object nestedObject) {
        this.nestedObject = nestedObject;
    }

    public Value(List<Value> nestedArray) {
        this.nestedArray = nestedArray;
    }

    public Value(JsxElement jsxElement) {
        this.jsxElement = jsxElement;
    }

    public Value(boolean isNull) {
        this.isNull = isNull;
    }

    @Override
    public String toString() {
        if (stringValue != null) return "\"" + stringValue + "\"";
        if (intValue != null) return intValue.toString();
        if (doubleValue != null) return doubleValue.toString();
        if (booleanValue != null) return booleanValue.toString();
        if (nestedObject != null) return nestedObject.toString();
        if (nestedArray != null) return nestedArray.toString();
        if (jsxElement != null) return jsxElement.toString();
        if (isNull) return "null";
        return "undefined";
    }
}
