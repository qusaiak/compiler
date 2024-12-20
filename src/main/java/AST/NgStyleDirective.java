package AST;

import java.util.Map;

public class NgStyleDirective {
    private Map<String, String> styles;

    public NgStyleDirective() {}

    public Map<String, String> getStyles() {
        return styles;
    }

    public void setStyles(Map<String, String> styles) {
        this.styles = styles;
    }

    @Override
    public String toString() {
        return "NgStyleDirective{" +
                "styles=" + styles +
                '}';
    }
}
