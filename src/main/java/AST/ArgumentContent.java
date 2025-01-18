package AST;

import java.util.List;

public class ArgumentContent {
    private ExportStatement exportStatement;
    private FunctionDeclaration functionDeclaration;
    private VariableDeclaration variableDeclaration;
    private ClassDeclaration classDeclaration;
    private List<Statement> statements;
    private String id;
    private String stringValue;
    private String htmlStringBefore;
    private JsxElement jsxElement;
    private String htmlStringAfter;

    public ArgumentContent(ExportStatement exportStatement) {
        this.exportStatement = exportStatement;
    }

    public ArgumentContent(FunctionDeclaration functionDeclaration) {
        this.functionDeclaration = functionDeclaration;
    }

    public ArgumentContent(VariableDeclaration variableDeclaration) {
        this.variableDeclaration = variableDeclaration;
    }

    public ArgumentContent(ClassDeclaration classDeclaration) {
        this.classDeclaration = classDeclaration;
    }

    public ArgumentContent(List<Statement> statements) {
        this.statements = statements;
    }

    public ArgumentContent(String id, String stringValue) {
        this.id = id;
        this.stringValue = stringValue;
    }

    public ArgumentContent(String id, String htmlStringBefore, JsxElement jsxElement, String htmlStringAfter) {
        this.id = id;
        this.htmlStringBefore = htmlStringBefore;
        this.jsxElement = jsxElement;
        this.htmlStringAfter = htmlStringAfter;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStringValue() {
        return stringValue;
    }

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }

    public String getHtmlStringBefore() {
        return htmlStringBefore;
    }

    public void setHtmlStringBefore(String htmlStringBefore) {
        this.htmlStringBefore = htmlStringBefore;
    }

    public JsxElement getJsxElement() {
        return jsxElement;
    }

    public void setJsxElement(JsxElement jsxElement) {
        this.jsxElement = jsxElement;
    }

    public String getHtmlStringAfter() {
        return htmlStringAfter;
    }

    public void setHtmlStringAfter(String htmlStringAfter) {
        this.htmlStringAfter = htmlStringAfter;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ArgumentContent: {\n");
        if (exportStatement != null) {
            sb.append("  exportStatement=").append(exportStatement).append('\n');
        }
        if (functionDeclaration != null) {
            sb.append("  functionDeclaration=").append(functionDeclaration).append('\n');
        }
        if (variableDeclaration != null) {
            sb.append("  variableDeclaration=").append(variableDeclaration).append('\n');
        }
        if (classDeclaration != null) {
            sb.append("  classDeclaration=").append(classDeclaration).append('\n');
        }
        if (statements != null && !statements.isEmpty()) {
            sb.append("  statements=").append(statements).append('\n');
        }
        if (id != null) {
            sb.append("  id='").append(id).append("'\n");
        }
        if (stringValue != null) {
            sb.append("  stringValue='").append(stringValue).append("'\n");
        }
        if (htmlStringBefore != null) {
            sb.append("  htmlStringBefore='").append(htmlStringBefore).append("'\n");
        }
        if (jsxElement != null) {
            sb.append("  jsxElement=").append(jsxElement).append('\n');
        }
        if (htmlStringAfter != null) {
            sb.append("  htmlStringAfter='").append(htmlStringAfter).append("'\n");
        }
        sb.append("}");
        return sb.toString();
    }

}
