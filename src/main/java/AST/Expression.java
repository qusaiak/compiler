package AST;

public class Expression {
    private Value value;
    private String id;
    private String complexId;
    private CallFunction callFunction;
    private angularDirective directive;
    private Expression left;
    private Expression right;
    private AST.operation operation;

    public Expression(String text) {
        this.id= text;
    }

    public Expression(int i) {
    }

    public Expression(Expression left, Expression right, AST.operation op) {
        this.left=left;
        this.right= right;
        this.operation=op;
    }

    // Getters and Setters
    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    public String getId() {
        return id;
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

    public angularDirective getDirective() {
        return directive;
    }

    public void setDirective(angularDirective directive) {
        this.directive = directive;
    }

    public Expression getLeft() {
        return left;
    }

    public void setLeft(Expression left) {
        this.left = left;
    }

    public Expression getRight() {
        return right;
    }

    public void setRight(Expression right) {
        this.right = right;
    }

    public operation getOperation() {
        return operation;
    }

    public void setOperation(operation operation) {
        this.operation = operation;
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
        } else if (left != null && right != null && operation != null) {
            return "Expression{" +
                    "\nleft=" + left +
                    "\noperation=" + operation +
                    "\nright=" + right +
                    "\n}";
        } else {
            return "Expression{}";
        }
    }
}
