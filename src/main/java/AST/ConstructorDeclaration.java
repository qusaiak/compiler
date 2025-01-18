package AST;

import java.util.List;

public class ConstructorDeclaration {
    private List<Parameter> parameters;
    private FunctionBody functionBody;
    private List<Assignments> assignments;

    public ConstructorDeclaration(List<Parameter> parameters, FunctionBody functionBody) {
        this.parameters = parameters;
        this.functionBody = functionBody;
    }

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
        StringBuilder sb = new StringBuilder();
        sb.append("ConstructorDeclaration: {\n");
        sb.append("  parameters=").append(parameters).append("\n");
        if (functionBody != null) {
            sb.append("  functionBody=").append(functionBody).append("\n");
        }
        if (assignments != null && !assignments.isEmpty()) {
            sb.append("  assignments=").append(assignments).append("\n");
        }
        sb.append("}");
        return sb.toString();
    }


}
