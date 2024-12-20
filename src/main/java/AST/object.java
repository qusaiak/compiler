package AST;

import java.util.ArrayList;
import java.util.List;

public class object {
    private List<Value> elementList;

    public object() {
        this.elementList = new ArrayList<>();
    }

    public object(List<Value> elementList) {
        this.elementList = elementList;
    }

    public List<Value> getElementList() {
        return elementList;
    }

    public void setElementList(List<Value> elementList) {
        this.elementList = elementList;
    }

    @Override
    public String toString() {
        return "Object{\nelementList=" + elementList + "\n}";
    }
}
