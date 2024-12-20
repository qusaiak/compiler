package AST;

import java.util.ArrayList;
import java.util.List;

public class Print {
    private List<String> strings = new ArrayList<>();

    public List<String> getStrings() {
        return strings;
    }

    public void setStrings(List<String> strings) {
        this.strings = strings;
    }

    @Override
    public String toString() {
        return "Print{" +
                "\nstrings=" + strings +
                "\n}";
    }
}
