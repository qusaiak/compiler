package AST;

import java.util.List;

public class Decorator {
    private String id;
    private List<DecoratorArgument> arguments;

    public Decorator(String id) {
        this.id = id;
    }

    public Decorator(String id, List<DecoratorArgument> arguments) {
        this.id = id;
        this.arguments = arguments;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<DecoratorArgument> getArguments() {
        return arguments;
    }

    public void setArguments(List<DecoratorArgument> arguments) {
        this.arguments = arguments;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Decorator: {\n");
        sb.append("  id='").append(id).append("'\n");
        if (arguments != null && !arguments.isEmpty()) {
            sb.append("  arguments=").append(arguments).append("\n");
        }
        sb.append("}");
        return sb.toString();
    }


}
