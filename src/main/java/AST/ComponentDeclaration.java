package AST;

public class ComponentDeclaration {
    private Decorator decorator;
    private ComponentBody componentBody;

    public ComponentDeclaration(Decorator decorator) {
        this.decorator = decorator;
    }

    public ComponentDeclaration(ComponentBody componentBody) {
        this.componentBody = componentBody;
    }

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
        if (decorator != null) {
            return "ComponentDeclaration{" +
                    "decorator=" + decorator +
                    '}';
        } else {
            return "ComponentDeclaration{" +
                    "componentBody=" + componentBody +
                    '}';
        }
    }
}
