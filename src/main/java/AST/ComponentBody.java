package AST;

import java.util.List;

public class ComponentBody {
    private List<VariableDeclaration> variableDeclarations;
    private List<FunctionDeclaration> functionDeclarations;

    public ComponentBody(List<VariableDeclaration> variableDeclarations, List<FunctionDeclaration> functionDeclarations) {
        this.variableDeclarations = variableDeclarations;
        this.functionDeclarations = functionDeclarations;
    }


    public List<VariableDeclaration> getVariableDeclarations() {
        return variableDeclarations;
    }

    public void setVariableDeclarations(List<VariableDeclaration> variableDeclarations) {
        this.variableDeclarations = variableDeclarations;
    }

    public List<FunctionDeclaration> getFunctionDeclarations() {
        return functionDeclarations;
    }

    public void setFunctionDeclarations(List<FunctionDeclaration> functionDeclarations) {
        this.functionDeclarations = functionDeclarations;
    }

    @Override
    public String toString() {
        return "ComponentBody{" +
                "variableDeclarations=" + variableDeclarations +
                ", functionDeclarations=" + functionDeclarations +
                '}';
    }
}
