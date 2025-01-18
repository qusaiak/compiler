package AST;

import java.util.List;

public class JsxElement {
    private OpeningTag openingTag;
    private List<JsxContent> jsxContents;
    private ClosingTag closingTag;
    private SelfClosingTag selfClosingTag;

    public JsxElement(OpeningTag openingTag, List<JsxContent> jsxContents, ClosingTag closingTag) {
        this.openingTag = openingTag;
        this.jsxContents = jsxContents;
        this.closingTag = closingTag;
    }

    public JsxElement(SelfClosingTag selfClosingTag) {
        this.selfClosingTag = selfClosingTag;
    }

    public OpeningTag getOpeningTag() {
        return openingTag;
    }

    public void setOpeningTag(OpeningTag openingTag) {
        this.openingTag = openingTag;
    }

    public List<JsxContent> getJsxContents() {
        return jsxContents;
    }

    public void setJsxContents(List<JsxContent> jsxContents) {
        this.jsxContents = jsxContents;
    }

    public ClosingTag getClosingTag() {
        return closingTag;
    }

    public void setClosingTag(ClosingTag closingTag) {
        this.closingTag = closingTag;
    }

    public SelfClosingTag getSelfClosingTag() {
        return selfClosingTag;
    }

    public void setSelfClosingTag(SelfClosingTag selfClosingTag) {
        this.selfClosingTag = selfClosingTag;
    }

    @Override
    public String toString() {
        if (selfClosingTag != null) {
            return "JsxElement{" +
                    "selfClosingTag=" + selfClosingTag +
                    '}';
        } else {
            return "JsxElement{" +
                    "openingTag=" + openingTag +
                    ", jsxContents=" + jsxContents +
                    ", closingTag=" + closingTag +
                    '}';
        }
    }
}
