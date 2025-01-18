package AST;


import java.util.List;

public class ClassDeclaration {
    private String className;
    private String extendsClassName;
    private List<String> implementsList;
    private List<ClassBody> classBody;


    public ClassDeclaration(String className, String extendsClassName, List<String> implementsList, List<ClassBody> classBody) {
        this.className=className;
        this.extendsClassName=extendsClassName;
        this.implementsList= implementsList;
        this.classBody= classBody;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getExtendsClassName() {
        return extendsClassName;
    }

    public void setExtendsClassName(String extendsClassName) {
        this.extendsClassName = extendsClassName;
    }

    public List<String> getImplementsList() {
        return implementsList;
    }

    public void setImplementsList(List<String> implementsList) {
        this.implementsList = implementsList;
    }

    public List<ClassBody> getClassBodyElements() {
        return classBody;
    }

    public void setClassBodyElements(List<ClassBody> classBody) {
        this.classBody = classBody;
    }

    @Override
    public String toString() {
        return "ClassDeclaration{" +
                "className='" + className + '\'' +
                ", extendsClassName='" + extendsClassName + '\'' +
                ", implementsList=" + implementsList +
                ", classBody=" + classBody +
                '}';
    }
}