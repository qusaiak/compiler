package AST;

public class ClassBody {
    private Decorator decorator;
    private FunctionDeclaration functionDeclaration;
    private VariableDeclaration variableDeclaration;
    private ConstructorDeclaration constructorDeclaration;

    public Decorator getDecorator() {
        return decorator;
    }

    public void setDecorator(Decorator decorator) {
        this.decorator = decorator;
    }

    public FunctionDeclaration getFunctionDeclaration() {
        return functionDeclaration;
    }

    public void setFunctionDeclaration(FunctionDeclaration functionDeclaration) {
        this.functionDeclaration = functionDeclaration;
    }

    public VariableDeclaration getVariableDeclaration() {
        return variableDeclaration;
    }

    public void setVariableDeclaration(VariableDeclaration variableDeclaration) {
        this.variableDeclaration = variableDeclaration;
    }

    public ConstructorDeclaration getConstructorDeclaration() {
        return constructorDeclaration;
    }

    public void setConstructorDeclaration(ConstructorDeclaration constructorDeclaration) {
        this.constructorDeclaration = constructorDeclaration;
    }

    @Override
    public String toString() {
        if (decorator != null) {
            return "ClassBody{" +
                    "\ndecorator=" + decorator +
                    "\n}";
        } else if (functionDeclaration != null) {
            return "ClassBody{" +
                    "\nfunctionDeclaration=" + functionDeclaration +
                    "\n}";
        } else if (variableDeclaration != null) {
            return "ClassBody{" +
                    "\nvariableDeclaration=" + variableDeclaration +
                    "\n}";
        } else if (constructorDeclaration != null) {
            return "ClassBody{" +
                    "\nconstructorDeclaration=" + constructorDeclaration +
                    "\n}";
        }
        return "ClassBody{}";
    }
}
