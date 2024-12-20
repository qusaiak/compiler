package AST;

public class ConstructorDeclaration {
    private Parameters parameters;
    private FunctionBody functionBody;

    public Parameters getParameters() {
        return parameters;
    }

    public void setParameters(Parameters parameters) {
        this.parameters = parameters;
    }

    public FunctionBody getFunctionBody() {
        return functionBody;
    }

    public void setFunctionBody(FunctionBody functionBody) {
        this.functionBody = functionBody;
    }

    @Override
    public String toString() {
        return "ConstructorDeclaration{" +
                "\nparameters=" + parameters +
                "\n, functionBody=" + functionBody +
                "\n}";
    }
}
