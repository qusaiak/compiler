package AST;

import java.util.ArrayList;
import java.util.List;

public class Program {
    private List<ImportStatement> importStatements = new ArrayList<>();
    private List<VariableDeclaration> variableDeclarations = new ArrayList<>();
    private List<ClassDeclaration> classDeclarations = new ArrayList<>();
    private List<FunctionDeclaration> functionDeclarations = new ArrayList<>();
    private List<ComponentDeclaration> componentDeclarations = new ArrayList<>();
    private ExportStatement exportStatement;

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
        sb.append("Program{\n");

        if (importStatements != null) {
            sb.append("importStatements=").append(importStatements).append(",\n");
        }
        if (variableDeclarations != null) {
            sb.append("variableDeclarations=").append(variableDeclarations).append(",\n");
        }
        if (classDeclarations != null) {
            sb.append("classDeclarations=").append(classDeclarations).append(",\n");
        }
        if (functionDeclarations != null) {
            sb.append("functionDeclarations=").append(functionDeclarations).append(",\n");
        }
        if (componentDeclarations != null) {
            sb.append("componentDeclarations=").append(componentDeclarations).append(",\n");
        }
        if (exportStatement != null) {
            sb.append("exportStatement=").append(exportStatement).append("\n");
        }

        sb.append('}');
        return sb.toString();
    }
}
