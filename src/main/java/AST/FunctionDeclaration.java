package AST;

import java.util.List;

public class FunctionDeclaration {
    private String id;
    private List<Parameter> parameters;
    private Type returnType;
    private FunctionBody functionBody;

    public FunctionDeclaration(String id, List<Parameter> parameters, Type returnType, FunctionBody functionBody) {
        this.id = id;
        this.parameters = parameters;
        this.returnType = returnType;
        this.functionBody = functionBody;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Parameter> getParameters() {
        return parameters;
    }

    public void setParameters(List<Parameter> parameters) {
        this.parameters = parameters;
    }

    public Type getReturnType() {
        return returnType;
    }

    public void setReturnType(Type returnType) {
        this.returnType = returnType;
    }

    public FunctionBody getFunctionBody() {
        return functionBody;
    }

    public void setFunctionBody(FunctionBody functionBody) {
        this.functionBody = functionBody;
    }

    @Override
    public String toString() {
        return "FunctionDeclaration{" +
                "id='" + id + '\'' +
                ", parameters=" + parameters +
                ", returnType=" + returnType +
                ", functionBody=" + functionBody +
                '}';
    }
}
