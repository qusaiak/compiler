package AST;

import java.util.ArrayList;
import java.util.List;

public class ReturnStatement {
    private List<JsxElement> jsxElementList = new ArrayList<>();

    public List<JsxElement> getJsxElementList() {
        return jsxElementList;
    }

    public void setJsxElementList(List<JsxElement> jsxElementList) {
        this.jsxElementList = jsxElementList;
    }

    @Override
    public String toString() {
        return "ReturnStatement{" +
                "\n jsxElementList=" + jsxElementList +
                "\n}";
    }
}
