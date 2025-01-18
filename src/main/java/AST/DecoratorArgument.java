package AST;

import java.util.List;

public class DecoratorArgument {
    private ExportStatement exportStatement;
    private FunctionDeclaration functionDeclaration;
    private VariableDeclaration variableDeclaration;
    private ClassDeclaration classDeclaration;
    private List<Statement> statements;
    private String selector;
    private String templateUrl;
    private JsxElement jsxElement;

    public DecoratorArgument(ExportStatement exportStatement) {
        this.exportStatement = exportStatement;
    }

    public DecoratorArgument(FunctionDeclaration functionDeclaration) {
        this.functionDeclaration = functionDeclaration;
    }

    public DecoratorArgument(VariableDeclaration variableDeclaration) {
        this.variableDeclaration = variableDeclaration;
    }

    public DecoratorArgument(ClassDeclaration classDeclaration) {
        this.classDeclaration = classDeclaration;
    }

    public DecoratorArgument(List<Statement> statements) {
        this.statements = statements;
    }

    public DecoratorArgument(String selector, boolean isSelector) {
        this.selector = selector;
    }

    public DecoratorArgument(String templateUrl, boolean isTemplateUrl, JsxElement jsxElement) {
        this.templateUrl = templateUrl;
        this.jsxElement = jsxElement;
    }

    public ExportStatement getExportStatement() {
        return exportStatement;
    }

    public void setExportStatement(ExportStatement exportStatement) {
        this.exportStatement = exportStatement;
    }

    public FunctionDeclaration getFunctionDeclaration() {
        return functionDeclaration;
    }

    public void setFunctionDeclaration(FunctionDeclaration functionDeclaration) {
        this.functionDeclaration = functionDeclaration;
    }

    public VariableDeclaration getVariableDeclaration() {
        return variableDeclaration;
    }

    public void setVariableDeclaration(VariableDeclaration variableDeclaration) {
        this.variableDeclaration = variableDeclaration;
    }

    public ClassDeclaration getClassDeclaration() {
        return classDeclaration;
    }

    public void setClassDeclaration(ClassDeclaration classDeclaration) {
        this.classDeclaration = classDeclaration;
    }

    public List<Statement> getStatements() {
        return statements;
    }

    public void setStatements(List<Statement> statements) {
        this.statements = statements;
    }

    public String getSelector() {
        return selector;
    }

    public void setSelector(String selector) {
        this.selector = selector;
    }

    public String getTemplateUrl() {
        return templateUrl;
    }

    public void setTemplateUrl(String templateUrl) {
        this.templateUrl = templateUrl;
    }

    public JsxElement getJsxElement() {
        return jsxElement;
    }

    public void setJsxElement(JsxElement jsxElement) {
        this.jsxElement = jsxElement;
    }

    @Override
    public String toString() {
        return "DecoratorArgument{" +
                "exportStatement=" + exportStatement +
                ", functionDeclaration=" + functionDeclaration +
                ", variableDeclaration=" + variableDeclaration +
                ", classDeclaration=" + classDeclaration +
                ", statements=" + statements +
                ", selector='" + selector + '\'' +
                ", templateUrl='" + templateUrl + '\'' +
                ", jsxElement=" + jsxElement +
                '}';
    }
}
