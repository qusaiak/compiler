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

    public ComponentDeclaration(Decorator decorator, ComponentBody componentBody) {
        this.decorator = decorator;
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
        StringBuilder sb = new StringBuilder();
        sb.append("ComponentDeclaration: {\n");
        if (decorator != null) {
            sb.append("  decorator=").append(decorator).append("\n");
        }
        if (componentBody != null) {
            sb.append("  componentBody=").append(componentBody).append("\n");
        }
        sb.append("}");
        return sb.toString();
    }

}
