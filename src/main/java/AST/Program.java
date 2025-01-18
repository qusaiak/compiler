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
        StringBuilder sb = new StringBuilder();
        sb.append("Program:\n");

        if (importStatements != null && !importStatements.isEmpty()) {
            sb.append("\nImport Statements:\n");
            for (ImportStatement importStatement : importStatements) {
                sb.append("  ").append(importStatement).append("\n");
            }
        }

        if (variableDeclarations != null && !variableDeclarations.isEmpty()) {
            sb.append("\nVariable Declarations:\n");
            for (VariableDeclaration variableDeclaration : variableDeclarations) {
                sb.append("  ").append(variableDeclaration).append("\n");
            }
        }

        if (classDeclarations != null && !classDeclarations.isEmpty()) {
            sb.append("\nClass Declarations:\n");
            for (ClassDeclaration classDeclaration : classDeclarations) {
                sb.append("  ").append(classDeclaration).append("\n");
            }
        }

        if (functionDeclarations != null && !functionDeclarations.isEmpty()) {
            sb.append("\nFunction Declarations:\n");
            for (FunctionDeclaration functionDeclaration : functionDeclarations) {
                sb.append("  ").append(functionDeclaration).append("\n");
            }
        }

        if (componentDeclarations != null && !componentDeclarations.isEmpty()) {
            sb.append("\nComponent Declarations:\n");
            for (ComponentDeclaration componentDeclaration : componentDeclarations) {
                sb.append("  ").append(componentDeclaration).append("\n");
            }
        }

        if (exportStatement != null) {
            sb.append("\nExport Statement:\n  ").append(exportStatement).append("\n");
        }

        return sb.toString();
    }

}
