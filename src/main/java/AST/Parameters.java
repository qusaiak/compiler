package AST;

import java.util.ArrayList;
import java.util.List;

public class Parameters {
    private List<Parameter> parameterList = new ArrayList<>();
    private List<String> ids = new ArrayList<>();

    public List<Parameter> getParameterList() {
        return parameterList;
    }

    public void setParameterList(List<Parameter> parameterList) {
        this.parameterList = parameterList;
    }

    public List<String> getIds() {
        return ids;
    }

    public void setIds(List<String> ids) {
        this.ids = ids;
    }

    public void addParameter(Parameter parameter) {
        parameterList.add(parameter);
    }

    public void addId(String id) {
        ids.add(id);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Parameters: {\n");
        if (parameterList != null && !parameterList.isEmpty()) {
            sb.append("  parameterList=").append(parameterList).append("\n");
        }
        if (ids != null && !ids.isEmpty()) {
            sb.append("  ids=").append(ids).append("\n");
        }
        sb.append("}");
        return sb.toString();
    }

}
