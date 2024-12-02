package AST;

import java.util.List;

public class Array {
    private List<Value> values;

    public Array(List<Value> values) {
        this.values = values;
    }

    public List<Value> getValues() {
        return values;
    }

    public void setValues(List<Value> values) {
        this.values = values;
    }

    @Override
    public String toString() {
        return "Array{" +
                "values=" + values +
                '}';
    }
}
