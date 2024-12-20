package AST;

import java.util.List;

public class ComponentBody {
    private List<VariableDeclaration> variableDeclarations;
    private List<FunctionDeclaration> functionDeclarations;

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
                "\nvariableDeclarations=" + variableDeclarations +
                "\n, functionDeclarations=" + functionDeclarations +
                "\n}";
    }
}
