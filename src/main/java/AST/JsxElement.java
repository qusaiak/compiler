package AST;

import java.util.List;

public class JsxElement {
    private final String tagName;
    private final List<JsxAttribute> attributes;
    private final List<Value> children;

    public JsxElement(String tagName, List<JsxAttribute> attributes, List<Value> children) {
        this.tagName = tagName;
        this.attributes = attributes;
        this.children = children;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("<").append(tagName);
        if (attributes != null) {
            for (JsxAttribute attr : attributes) {
                sb.append(" ").append(attr);
            }
        }
        sb.append(">");
        if (children != null) {
            for (Value child : children) {
                sb.append(child);
            }
        }
        sb.append("</").append(tagName).append(">");
        return sb.toString();
    }
}
