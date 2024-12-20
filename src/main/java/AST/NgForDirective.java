package AST;

import java.util.List;

public class NgForDirective<T> {
    private List<T> items;

    public NgForDirective() {}

    public List<T> getItems() {
        return items;
    }

    public void setItems(List<T> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "NgForDirective{" +
                "items=" + items +
                '}';
    }
}
