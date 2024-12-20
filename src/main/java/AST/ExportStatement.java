package AST;

public class ExportStatement {
    private boolean defaultExport;
    private String className;

    public boolean isDefaultExport() {
        return defaultExport;
    }

    public void setDefaultExport(boolean defaultExport) {
        this.defaultExport = defaultExport;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return "ExportStatement{" +
                "defaultExport=" + defaultExport +
                ", className='" + className + '\'' +
                '}';
    }
}
