package AST;

public class VariableDeclaration {
    private String type;
    private String variable;
    private String id;
    private FunctionDeclaration functionDeclaration;
    private Array array;
    private Value value;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getVariable() {
        return variable;
    }

    public void setVariable(String variable) {
        this.variable = variable;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public FunctionDeclaration getFunctionDeclaration() {
        return functionDeclaration;
    }

    public void setFunctionDeclaration(FunctionDeclaration functionDeclaration) {
        this.functionDeclaration = functionDeclaration;
    }

    public Array getArray() {
        return array;
    }

    public void setArray(Array array) {
        this.array = array;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    @Override
    public String toString() {
        if (value != null)
            return "VariableDeclaration{" +
                    "\n type='" + type + '\'' +
                    "\n, variable='" + variable + '\'' +
                    "\n, value=" + value +
                    "\n}";

        else if (functionDeclaration != null)
            return "VariableDeclaration{" +
                    "\n type='" + type + '\'' +
                    "\n, variable='" + variable + '\'' +
                    "\n, functionDeclaration=" + functionDeclaration +
                    "\n}";

        else if (array != null)
            return "VariableDeclaration{" +
                    "\n type='" + type + '\'' +
                    "\n, variable='" + variable + '\'' +
                    "\n, array=" + array +
                    "\n}";

        return "VariableDeclaration{" +
                "\n type='" + type + '\'' +
                "\n, variable='" + variable + '\'' +
                "\n, id=" + id +
                "\n}";
    }
}
