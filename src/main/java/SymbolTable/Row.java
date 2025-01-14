package SymbolTable;

public class Row {
    private String type;
    private String value;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Row{" +
                "type='" + type + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
