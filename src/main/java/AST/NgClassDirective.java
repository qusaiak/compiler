package AST;

import java.util.Map;

public class NgClassDirective {
    private Map<String, Boolean> classes;

    public NgClassDirective() {}

    public Map<String, Boolean> getClasses() {
        return classes;
    }

    public void setClasses(Map<String, Boolean> classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "NgClassDirective{" +
                "classes=" + classes +
                '}';
    }
}
