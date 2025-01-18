package AST;

import java.util.ArrayList;
import java.util.List;

public class DecoratorArgument {
    private List<ArgumentContent> argumentContents = new ArrayList<>();

    public List<ArgumentContent> getArgumentContents() {
        return argumentContents;
    }

    public void setArgumentContents(List<ArgumentContent> argumentContents) {
        this.argumentContents = argumentContents;
    }

    public void addArgumentContent(ArgumentContent argumentContent) {
        argumentContents.add(argumentContent);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DecoratorArguments: {\n");
        if (argumentContents != null && !argumentContents.isEmpty()) {
            sb.append("  argumentContents=").append(argumentContents).append("\n");
        }
        sb.append("}");
        return sb.toString();
    }

}
