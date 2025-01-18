package AST;

import java.util.List;

public class ImportStatement {
    private String id;
    private List<String> ids;
    private String from;
    private String string;

    public ImportStatement(String id, String from, String string) {
        this.id = id;
        this.from = from;
        this.string = string;
    }

    public ImportStatement(List<String> ids, String from, String string) {
        this.ids = ids;
        this.from = from;
        this.string = string;
    }

    public ImportStatement() {

    }

    // Getters and setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<String> getIds() {
        return ids;
    }

    public void setIds(List<String> ids) {
        this.ids = ids;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    @Override
    public String toString() {
        return "ImportStatement{" +
                "id='" + id + '\'' +
                ", ids=" + ids +
                ", from='" + from + '\'' +
                ", string='" + string + '\'' +
                '}';
    }
}
