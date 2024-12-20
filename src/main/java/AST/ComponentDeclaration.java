package AST;

public class ComponentDeclaration {
    private Decorator decorator;
    private ComponentBody componentBody;

    public Decorator getDecorator() {
        return decorator;
    }

    public void setDecorator(Decorator decorator) {
        this.decorator = decorator;
    }

    public ComponentBody getComponentBody() {
        return componentBody;
    }

    public void setComponentBody(ComponentBody componentBody) {
        this.componentBody = componentBody;
    }

    @Override
    public String toString() {
        return "ComponentDeclaration{" +
                "\ndecorator=" + decorator +
                "\n, componentBody=" + componentBody +
                "\n}";
    }
}
