package AST;

import java.util.List;

public class ArgumentContent {
    private ExportStatement exportStatement;
    private FunctionDeclaration functionDeclaration;
    private VariableDeclaration variableDeclaration;
    private ClassDeclaration classDeclaration;
    private List<Statement> statements;
    private String selector;
    private String stringValue;
    private String template;
    private String templateHtmlBefore;
    private JsxElement jsxElement;
    private String templateHtmlAfter;

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

    public ArgumentContent(String selector, String stringValue) {
        this.selector = selector;
        this.stringValue = stringValue;
    }

    public ArgumentContent(String template, String templateHtmlBefore, JsxElement jsxElement, String templateHtmlAfter) {
        this.template = template;
        this.templateHtmlBefore = templateHtmlBefore;
        this.jsxElement = jsxElement;
        this.templateHtmlAfter = templateHtmlAfter;
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

    public String getStringValue() {
        return stringValue;
    }

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public String getTemplateHtmlBefore() {
        return templateHtmlBefore;
    }

    public void setTemplateHtmlBefore(String templateHtmlBefore) {
        this.templateHtmlBefore = templateHtmlBefore;
    }

    public JsxElement getJsxElement() {
        return jsxElement;
    }

    public void setJsxElement(JsxElement jsxElement) {
        this.jsxElement = jsxElement;
    }

    public String getTemplateHtmlAfter() {
        return templateHtmlAfter;
    }

    public void setTemplateHtmlAfter(String templateHtmlAfter) {
        this.templateHtmlAfter = templateHtmlAfter;
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
        if (selector != null) {
            sb.append("  selector='").append(selector).append("'\n");
        }
        if (stringValue != null) {
            sb.append("  stringValue='").append(stringValue).append("'\n");
        }
        if (template != null) {
            sb.append("  template='").append(template).append("'\n");
        }
        if (templateHtmlBefore != null) {
            sb.append("  templateHtmlBefore='").append(templateHtmlBefore).append("'\n");
        }
        if (jsxElement != null) {
            sb.append("  jsxElement=").append(jsxElement).append('\n');
        }
        if (templateHtmlAfter != null) {
            sb.append("  templateHtmlAfter='").append(templateHtmlAfter).append("'\n");
        }
        sb.append("}");
        return sb.toString();
    }
}
