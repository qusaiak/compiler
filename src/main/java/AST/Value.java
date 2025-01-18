package AST;

import java.util.List;

public class Value {
    private Type type;
    private List<Value> nestedArray;
    private Object nestedObject;
    private JsxElement jsxElement;
    private angularDirective directive;
    private boolean isNull;

    public Value(Type type) {
        this.type = type;
    }

    public Type getType() {
        return type;
    }

    public Value(Object nestedObject) {
        this.nestedObject = nestedObject;
    }

    public Object getNestedObject() {
        return nestedObject;
    }

    public Value(List<Value> nestedArray) {
        this.nestedArray = nestedArray;
    }

    public List<Value> getNestedArray() {
        return nestedArray;
    }

    public Value(JsxElement jsxElement) {
        this.jsxElement = jsxElement;
    }

    public JsxElement getJsxElement() {
        return jsxElement;
    }

    public Value(angularDirective directive) {
        this.directive = directive;
    }

    public Value(boolean isNull) {
        this.isNull = isNull;
    }

    public angularDirective getDirective() {
        return directive;
    }

    public void setDirective(angularDirective directive) {
        this.directive = directive;
    }

    @Override
    public String toString() {
        if (type != null) return type.toString();
        if (nestedObject != null) return nestedObject.toString();
        if (nestedArray != null) return nestedArray.toString();
        if (jsxElement != null) return jsxElement.toString();
        if (directive != null) return directive.toString();
        if (isNull) return "null";
        return "undefined";
    }
}
