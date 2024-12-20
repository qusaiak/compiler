package AST;

public class Expression {
    private Value value;
    private String id;
    private String complexId;
    private CallFunction callFunction;
    private Directives directive;

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getComplexId() {
        return complexId;
    }

    public void setComplexId(String complexId) {
        this.complexId = complexId;
    }

    public CallFunction getCallFunction() {
        return callFunction;
    }

    public void setCallFunction(CallFunction callFunction) {
        this.callFunction = callFunction;
    }

    public Directives getDirective() {
        return directive;
    }

    public void setDirective(Directives directive) {
        this.directive = directive;
    }

    @Override
    public String toString() {
        if (value != null) {
            return "Expression{" +
                    "\nvalue=" + value +
                    "\n}";
        } else if (id != null) {
            return "Expression{" +
                    "\nid='" + id + '\'' +
                    "\n}";
        } else if (complexId != null) {
            return "Expression{" +
                    "\ncomplexId='" + complexId + '\'' +
                    "\n}";
        } else if (callFunction != null) {
            return "Expression{" +
                    "\ncallFunction=" + callFunction +
                    "\n}";
        } else if (directive != null) {
            return "Expression{" +
                    "\ndirective=" + directive +
                    "\n}";
        } else {
            return "Expression{}";
        }
    }
}
