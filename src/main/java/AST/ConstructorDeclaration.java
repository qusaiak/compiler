package AST;

import java.util.List;

public class ConstructorDeclaration {
    private List<Parameter> parameters;
    private FunctionBody functionBody;
    private List<Assignments> assignments;

    // Constructor for function body
    public ConstructorDeclaration(List<Parameter> parameters, FunctionBody functionBody) {
        this.parameters = parameters;
        this.functionBody = functionBody;
    }

    // Constructor for assignments
    public ConstructorDeclaration(List<Parameter> parameters, List<Assignments> assignments) {
        this.parameters = parameters;
        this.assignments = assignments;
    }

    public List<Parameter> getParameters() {
        return parameters;
    }

    public void setParameters(List<Parameter> parameters) {
        this.parameters = parameters;
    }

    public FunctionBody getFunctionBody() {
        return functionBody;
    }

    public void setFunctionBody(FunctionBody functionBody) {
        this.functionBody = functionBody;
    }

    public List<Assignments> getAssignments() {
        return assignments;
    }

    public void setAssignments(List<Assignments> assignments) {
        this.assignments = assignments;
    }

    @Override
    public String toString() {
        if (functionBody != null) {
            return "ConstructorDeclaration{" +
                    "parameters=" + parameters +
                    ", functionBody=" + functionBody +
                    '}';
        } else {
            return "ConstructorDeclaration{" +
                    "parameters=" + parameters +
                    ", assignments=" + assignments +
                    '}';
        }
    }
}
