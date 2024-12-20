package AST;

import java.util.List;

public class Decorator {
    private String id;
    private List<Object> decoratorArguments;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Object> getDecoratorArguments() {
        return decoratorArguments;
    }

    public void setDecoratorArguments(List<Object> decoratorArguments) {
        this.decoratorArguments = decoratorArguments;
    }

    @Override
    public String toString() {
        if (decoratorArguments != null && !decoratorArguments.isEmpty()) {
            return "Decorator{" +
                    "\nid='" + id + '\'' +
                    "\n, decoratorArguments=" + decoratorArguments +
                    "\n}";
        }
        return "Decorator{" +
                "\nid='" + id + '\'' +
                "\n}";
    }
}
