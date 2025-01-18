package AST;

import java.util.ArrayList;
import java.util.List;

public class Print{
    private List<String> expressions = new ArrayList<>();

    public Print(List<String> expressions) {
        this.expressions=expressions;
    }

    public List<String> getExpressions() {
        return expressions;
    }

    public void setExpressions(List<String> expressions) {
        this.expressions = expressions;
    }

    @Override
    public String toString() {
        return "PrintStatement{" +
                "\nexpressions=" + expressions +
                "\n}";
    }
}
