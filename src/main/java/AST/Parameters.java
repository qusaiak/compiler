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
            return "Parameters{" +
                    "\nparameterList=" + parameterList +
                    "\nids=" + ids +
                    "\n}";
        }
    }
