package AST;

import java.util.ArrayList;
import java.util.List;

public class CallFunction {
    private String functionName;
    private List<String> arguments = new ArrayList<>();

    public String getFunctionName() {
        return functionName;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    public List<String> getArguments() {
        return arguments;
    }

    public void setArguments(List<String> arguments) {
        this.arguments = arguments;
    }

    @Override
    public String toString() {
        return "CallFunc{" +
                "\n functionName='" + functionName + '\'' +
                "\n arguments=" + arguments +
                "\n}";
    }
}
