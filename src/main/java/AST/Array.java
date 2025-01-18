package AST;

import java.util.ArrayList;
import java.util.List;

public class Array {
    private List<Object> values = new ArrayList<>();

    public List<Object> getValues() {
        return values;
    }

    public void setValues(List<Object> values) {
        this.values = values;
    }

    public void addValue(Object value) {
        values.add(value);
    }

    @Override
    public String toString() {
        return "Array{" +
                "\nvalues=" + values +
                "\n}";
    }
}
