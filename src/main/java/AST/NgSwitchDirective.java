package AST;

import java.util.ArrayList;
import java.util.List;

public class NgSwitchDirective<T> {
    private T switchValue;
    private final List<NgSwitchCaseDirective<T>> cases = new ArrayList<>();
    private NgSwitchDefaultDirective<T> defaultCase;

    public NgSwitchDirective() {}

    public T getSwitchValue() {
        return switchValue;
    }

    public void setSwitchValue(T switchValue) {
        this.switchValue = switchValue;
    }

    public void addCase(NgSwitchCaseDirective<T> switchCase) {
        cases.add(switchCase);
    }

    public void setDefaultCase(NgSwitchDefaultDirective<T> defaultCase) {
        this.defaultCase = defaultCase;
    }

    public List<NgSwitchCaseDirective<T>> getCases() {
        return cases;
    }

    public NgSwitchDefaultDirective<T> getDefaultCase() {
        return defaultCase;
    }

    @Override
    public String toString() {
        return "NgSwitchDirective{" +
                "switchValue=" + switchValue +
                ", cases=" + cases +
                ", defaultCase=" + defaultCase +
                '}';
    }
}
