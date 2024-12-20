package AST;

import java.util.ArrayList;
import java.util.List;

public class FunctionBody {
    private List<FunctionStatement> FunctionStatementList = new ArrayList<>();
    private ReturnStatement returnStatement;

    public List<FunctionStatement> getFunctionStatementList() {
        return FunctionStatementList;
    }

    public void setFunctionStatementList(List<FunctionStatement> FunctionStatementList) {
        this.FunctionStatementList = FunctionStatementList;
    }

    public ReturnStatement getReturnStatement() {
        return returnStatement;
    }

    public void setReturnStatement(ReturnStatement returnStatement) {
        this.returnStatement = returnStatement;
    }

    @Override
    public String toString() {
        if (returnStatement != null) {
            return "FunctionBody{" +
                    "\n FunctionStatementList=" + FunctionStatementList +
                    "\n returnStatement=" + returnStatement +
                    "\n }";
        }
        return "FunctionBody{" +
                "\n FunctionStatementList=" + FunctionStatementList +
                "\n }";
    }
}
