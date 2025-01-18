package AST;

public class Assignments {
    private String id;
    private Type type;
    private Value value;
    private CallFunction callFunction;

    // Constructor for ID and type
    public Assignments(String id, Type type) {
        this.id = id;
        this.type = type;
    }

    // Constructor for ID and value
    public Assignments(String id, Value value) {
        this.id = id;
        this.value = value;
    }

    // Constructor for `this` keyword
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
        if (type != null) {
            return "Assignment{" +
                    "id='" + id + '\'' +
                    ", type=" + type +
                    '}';
        } else if (value != null) {
            return "Assignment{" +
                    "id='" + id + '\'' +
                    ", value=" + value +
                    '}';
        } else {
            return "Assignment{" +
                    "id='" + id + '\'' +
                    ", callFunction=" + callFunction +
                    '}';
        }
    }
}
