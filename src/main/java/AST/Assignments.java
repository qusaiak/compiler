package AST;

public class Assignments {
    private String id;
    private Type type;
    private Value value;
    private CallFunction callFunction;

    public Assignments(String id, Type type) {
        this.id = id;
        this.type = type;
    }

    public Assignments(String id, Value value) {
        this.id = id;
        this.value = value;
    }

    public Assignments(String id, CallFunction callFunction) {
        this.id = id;
        this.callFunction = callFunction;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    public CallFunction getCallFunction() {
        return callFunction;
    }

    public void setCallFunction(CallFunction callFunction) {
        this.callFunction = callFunction;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Assignments: {\n");
        sb.append("  id='").append(id).append("'\n");
        if (type != null) {
            sb.append("  type=").append(type).append('\n');
        }
        if (value != null) {
            sb.append("  value=").append(value).append('\n');
        }
        if (callFunction != null) {
            sb.append("  callFunction=").append(callFunction).append('\n');
        }
        sb.append("}");
        return sb.toString();
    }


}
