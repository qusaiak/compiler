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
        return "ClassBody{" +
                "decorators=" + decorators +
                ", constructorDeclarations=" + constructorDeclarations +
                ", variableDeclarations=" + variableDeclarations +
                ", functionDeclarations=" + functionDeclarations +
                '}';
    }
}
