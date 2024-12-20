package AST;

public class Type {
    public enum TypeCategory {
        ID, STRING, INT, DOUBLE, BOOLEAN, UNDEFINED
    }

    private String name;
    private TypeCategory category;

    public Type(String name, TypeCategory category) {
        this.name = name;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TypeCategory getCategory() {
        return category;
    }

    public void setCategory(TypeCategory category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Type{" +
                "name='" + name + '\'' +
                ", category=" + category +
                '}';
    }
}
