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
        StringBuilder sb = new StringBuilder();
        sb.append("ImportStatement: {\n");
        if (id != null) {
            sb.append("  id='").append(id).append("'\n");
        }
        if (ids != null && !ids.isEmpty()) {
            sb.append("  ids=").append(ids).append("\n");
        }
        if (from != null) {
            sb.append("  from='").append(from).append("'\n");
        }
        if (string != null) {
            sb.append("  string='").append(string).append("'\n");
        }
        sb.append("}");
        return sb.toString();
    }

}
