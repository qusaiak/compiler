package AST;

public class ReturnStatement {
    private Value value;
    private operation operation;
    private Value secondValue;
    private JsxElement jsxElement;

    public ReturnStatement(Value value, operation operation, Value secondValue) {
        this.value = value;
        this.operation = operation;
        this.secondValue = secondValue;
    }

    public ReturnStatement(JsxElement jsxElement) {
        this.jsxElement = jsxElement;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    public operation getOperation() {
        return operation;
    }

    public void setOperation(operation operation) {
        this.operation = operation;
    }

    public Value getSecondValue() {
        return secondValue;
    }

    public void setSecondValue(Value secondValue) {
        this.secondValue = secondValue;
    }

    public JsxElement getJsxElement() {
        return jsxElement;
    }

    public void setJsxElement(JsxElement jsxElement) {
        this.jsxElement = jsxElement;
    }

    @Override
    public String toString() {
        if (jsxElement != null) {
            return "ReturnStatement{" +
                    "jsxElement=" + jsxElement +
                    '}';
        } else {
            return "ReturnStatement{" +
                    "value=" + value +
                    ", operation=" + operation +
                    ", secondValue=" + secondValue +
                    '}';
        }
    }
}
