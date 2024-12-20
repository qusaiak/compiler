package AST;

public class ImportStatement {
    private String importId;
    private String from;

    public String getImportId() {
        return importId;
    }

    public void setImportId(String importId) {
        this.importId = importId;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    @Override
    public String toString() {
        return "ImportStatement{" +
                "importId='" + importId + '\'' +
                ", from='" + from + '\'' +
                '}';
    }
}
