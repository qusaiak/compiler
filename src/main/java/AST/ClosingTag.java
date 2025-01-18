package AST;

public class ClosingTag {
    private String id;

    public ClosingTag(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ClosingTag{" +
                "id='" + id + '\'' +
                '}';
    }
}
