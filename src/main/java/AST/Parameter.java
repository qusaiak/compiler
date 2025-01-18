package AST;

public class Parameter {
    private String accessModifier;
    private String id;
    private Type type;
    private Object value;

    public Parameter(String accessModifier, String id, Type type, Object value) {
        this.accessModifier = accessModifier;
        this.id = id;
        this.type = type;
        this.value = value;
    }

    public String getAccessModifier() {
        return accessModifier;
    }

    public void setAccessModifier(String accessModifier) {
        this.accessModifier = accessModifier;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Parameter: {\n");
        sb.append("  accessModifier='").append(accessModifier).append("'\n");
        sb.append("  id='").append(id).append("'\n");
        if (type != null) {
            sb.append("  type=").append(type).append("\n");
        }
        if (value != null) {
            sb.append("  value=").append(value).append("\n");
        }
        sb.append("}");
        return sb.toString();
    }


}
