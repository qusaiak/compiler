package AST;

public class JsxClass {
    private String className;

    public JsxClass(String className) {
        this.className = className;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return "JsxClass{" +
                "className='" + className + '\'' +
                '}';
    }
}
