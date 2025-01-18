package AST;

import java.util.List;

public class ClassBody {
    private List<Decorator> decorators;
    private List<ConstructorDeclaration> constructorDeclarations;
    private List<VariableDeclaration> variableDeclarations;
    private List<FunctionDeclaration> functionDeclarations;

    public ClassBody(List<Decorator> decorators,
                     List<ConstructorDeclaration> constructorDeclarations,
                     List<VariableDeclaration> variableDeclarations,
                     List<FunctionDeclaration> functionDeclarations) {
        this.decorators = decorators;
        this.constructorDeclarations = constructorDeclarations;
        this.variableDeclarations = variableDeclarations;
        this.functionDeclarations = functionDeclarations;
    }

    public List<Decorator> getDecorators() {
        return decorators;
    }

    public void setDecorators(List<Decorator> decorators) {
        this.decorators = decorators;
    }

    public List<ConstructorDeclaration> getConstructorDeclarations() {
        return constructorDeclarations;
    }

    public void setConstructorDeclarations(List<ConstructorDeclaration> constructorDeclarations) {
        this.constructorDeclarations = constructorDeclarations;
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
        StringBuilder sb = new StringBuilder();
        sb.append("ClassBody: {\n");
        if (decorators != null && !decorators.isEmpty()) {
            sb.append("  decorators=").append(decorators).append("\n");
        }
        if (constructorDeclarations != null && !constructorDeclarations.isEmpty()) {
            sb.append("  constructorDeclarations=").append(constructorDeclarations).append("\n");
        }
        if (variableDeclarations != null && !variableDeclarations.isEmpty()) {
            sb.append("  variableDeclarations=").append(variableDeclarations).append("\n");
        }
        if (functionDeclarations != null && !functionDeclarations.isEmpty()) {
            sb.append("  functionDeclarations=").append(functionDeclarations).append("\n");
        }
        sb.append("}");
        return sb.toString();
    }


}
