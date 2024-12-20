package AST;

public class DecoratorArgument {
    private String id;
    private Value value;
    private String json;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    public String getJson() {
        return json;
    }

    public void setJson(String json) {
        this.json = json;
    }

    @Override
    public String toString() {
        if (value != null) {
            return "DecoratorArgument{" +
                    "\nid='" + id + '\'' +
                    "\n, value=" + value +
                    "\n}";
        } else if (json != null) {
            return "DecoratorArgument{" +
                    "\njson='" + json + '\'' +
                    "\n}";
        }
        return "DecoratorArgument{}";
    }
}
