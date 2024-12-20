package AST;

import java.util.Objects;

public class Content {
    private JsxElement jsxElement;
    private ShortIf shortIf;
    private CallFunction callFunction;
    private String id;

    public Content(JsxElement jsxElement) {
        this.jsxElement = jsxElement;
    }

    public Content(ShortIf shortIf) {
        this.shortIf = shortIf;
    }

    public Content(CallFunction callFunction) {
        this.callFunction = callFunction;
    }

    public Content(String id) {
        this.id = id;
    }

    public JsxElement getJsxElement() {
        return jsxElement;
    }

    public void setJsxElement(JsxElement jsxElement) {
        this.jsxElement = jsxElement;
    }

    public ShortIf getShortIf() {
        return shortIf;
    }

    public void setShortIf(ShortIf shortIf) {
        this.shortIf = shortIf;
    }

    public CallFunction getCallFunction() {
        return callFunction;
    }

    public void setCallFunction(CallFunction callFunction) {
        this.callFunction = callFunction;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        if (jsxElement != null) {
            return jsxElement.toString();
        } else if (shortIf != null) {
            return shortIf.toString();
        } else if (callFunction != null) {
            return callFunction.toString();
        } else return Objects.requireNonNullElse(id, "");
    }
}
