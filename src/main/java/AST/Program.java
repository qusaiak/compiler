package AST;

import java.util.List;

public class Program {
    private List<ImportStatement> importStatements;
    private List<VariableDeclaration> variableDeclarations;
    private List<ClassDeclaration> classDeclarations;
    private List<FunctionDeclaration> functionDeclarations;
    private List<ComponentDeclaration> componentDeclarations;
    private ExportStatement exportStatement;

    public Program(List<ImportStatement> importStatements,
                   List<VariableDeclaration> variableDeclarations,
                   List<ClassDeclaration> classDeclarations,
                   List<FunctionDeclaration> functionDeclarations,
                   List<ComponentDeclaration> componentDeclarations,
                   ExportStatement exportStatement) {
        this.importStatements = importStatements;
        this.variableDeclarations = variableDeclarations;
        this.classDeclarations = classDeclarations;
        this.functionDeclarations = functionDeclarations;
        this.componentDeclarations = componentDeclarations;
        this.exportStatement = exportStatement;
    }

    public List<ImportStatement> getImportStatements() {
        return importStatements;
    }

    public void setImportStatements(List<ImportStatement> importStatements) {
        this.importStatements = importStatements;
    }

    public List<VariableDeclaration> getVariableDeclarations() {
        return variableDeclarations;
    }

    public void setVariableDeclarations(List<VariableDeclaration> variableDeclarations) {
        this.variableDeclarations = variableDeclarations;
    }

    public List<ClassDeclaration> getClassDeclarations() {
        return classDeclarations;
    }

    public void setClassDeclarations(List<ClassDeclaration> classDeclarations) {
        this.classDeclarations = classDeclarations;
    }

    public List<FunctionDeclaration> getFunctionDeclarations() {
        return functionDeclarations;
    }

    public void setFunctionDeclarations(List<FunctionDeclaration> functionDeclarations) {
        this.functionDeclarations = functionDeclarations;
    }

    public List<ComponentDeclaration> getComponentDeclarations() {
        return componentDeclarations;
    }

    public void setComponentDeclarations(List<ComponentDeclaration> componentDeclarations) {
        this.componentDeclarations = componentDeclarations;
    }

    public ExportStatement getExportStatement() {
        return exportStatement;
    }

    public void setExportStatement(ExportStatement exportStatement) {
        this.exportStatement = exportStatement;
    }

    @Override
    public String toString() {
        return "Program{" +
                "importStatements=" + importStatements +
                ", variableDeclarations=" + variableDeclarations +
                ", classDeclarations=" + classDeclarations +
                ", functionDeclarations=" + functionDeclarations +
                ", componentDeclarations=" + componentDeclarations +
                ", exportStatement=" + exportStatement +
                '}';
    }
}
