package AST;

import java.util.List;

public class ClassDeclaration {
    private String className;
    private String superClass;
    private List<String> interfaces;
    private ClassBody classBody;

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getSuperClass() {
        return superClass;
    }

    public void setSuperClass(String superClass) {
        this.superClass = superClass;
    }

    public List<String> getInterfaces() {
        return interfaces;
    }

    public void setInterfaces(List<String> interfaces) {
        this.interfaces = interfaces;
    }

    public ClassBody getClassBody() {
        return classBody;
    }

    public void setClassBody(ClassBody classBody) {
        this.classBody = classBody;
    }

    @Override
    public String toString() {
        return "ClassDeclaration{" +
                "\nclassName='" + className + '\'' +
                "\n, superClass='" + superClass + '\'' +
                "\n, interfaces=" + interfaces +
                "\n, classBody=" + classBody +
                "\n}";
    }
}
