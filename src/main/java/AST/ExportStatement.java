package AST;

import java.util.List;

public class ExportStatement {
    private boolean isDefault;
    private ClassDeclaration classDeclaration;
    private VariableDeclaration variableDeclaration;
    private FunctionDeclaration functionDeclaration;
    private ComponentDeclaration componentDeclaration;
    private Object object;
    private List<String> ids;

    public ExportStatement(boolean isDefault, ClassDeclaration classDeclaration) {
        this.isDefault = isDefault;
        this.classDeclaration = classDeclaration;
    }

    public ExportStatement(ClassDeclaration classDeclaration, VariableDeclaration variableDeclaration, FunctionDeclaration functionDeclaration, ComponentDeclaration componentDeclaration, Object object) {
        this.classDeclaration = classDeclaration;
        this.variableDeclaration = variableDeclaration;
        this.functionDeclaration = functionDeclaration;
        this.componentDeclaration = componentDeclaration;
        this.object = object;
    }

    public ExportStatement(List<String> ids) {
        this.ids = ids;
    }

    public boolean isDefault() {
        return isDefault;
    }

    public void setDefault(boolean isDefault) {
        this.isDefault = isDefault;
    }

    public ClassDeclaration getClassDeclaration() {
        return classDeclaration;
    }

    public void setClassDeclaration(ClassDeclaration classDeclaration) {
        this.classDeclaration = classDeclaration;
    }

    public VariableDeclaration getVariableDeclaration() {
        return variableDeclaration;
    }

    public void setVariableDeclaration(VariableDeclaration variableDeclaration) {
        this.variableDeclaration = variableDeclaration;
    }

    public FunctionDeclaration getFunctionDeclaration() {
        return functionDeclaration;
    }

    public void setFunctionDeclaration(FunctionDeclaration functionDeclaration) {
        this.functionDeclaration = functionDeclaration;
    }

    public ComponentDeclaration getComponentDeclaration() {
        return componentDeclaration;
    }

    public void setComponentDeclaration(ComponentDeclaration componentDeclaration) {
        this.componentDeclaration = componentDeclaration;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public List<String> getIds() {
        return ids;
    }

    public void setIds(List<String> ids) {
        this.ids = ids;
    }

    @Override
    public String toString() {
        return "ExportStatement{" +
                "isDefault=" + isDefault +
                ", classDeclaration=" + classDeclaration +
                ", variableDeclaration=" + variableDeclaration +
                ", functionDeclaration=" + functionDeclaration +
                ", componentDeclaration=" + componentDeclaration +
                ", object=" + object +
                ", ids=" + ids +
                '}';
    }
}
