package AST;

import java.util.List;

public class JsxAttributes {
    private List<angularDirective> angularDirectives;
    private List<JsxAttribute> jsxAttributes;
    private List<jsxEvent> jsxEvents;
    private List<JsxBinding> jsxBindings;
    private List<JsxClass> jsxClasses;

    public JsxAttributes(List<angularDirective> angularDirectives,
                         List<JsxAttribute> jsxAttributes,
                         List<jsxEvent> jsxEvents,
                         List<JsxBinding> jsxBindings,
                         List<JsxClass> jsxClasses) {
        this.angularDirectives = angularDirectives;
        this.jsxAttributes = jsxAttributes;
        this.jsxEvents = jsxEvents;
        this.jsxBindings = jsxBindings;
        this.jsxClasses = jsxClasses;
    }

    // Getters and setters
    public List<angularDirective> getAngularDirectives() {
        return angularDirectives;
    }

    public void setAngularDirectives(List<angularDirective> angularDirectives) {
        this.angularDirectives = angularDirectives;
    }

    public List<JsxAttribute> getJsxAttributes() {
        return jsxAttributes;
    }

    public void setJsxAttributes(List<JsxAttribute> jsxAttributes) {
        this.jsxAttributes = jsxAttributes;
    }

    public List<jsxEvent> getJsxEvents() {
        return jsxEvents;
    }

    public void setJsxEvents(List<jsxEvent> jsxEvents) {
        this.jsxEvents = jsxEvents;
    }

    public List<JsxBinding> getJsxBindings() {
        return jsxBindings;
    }

    public void setJsxBindings(List<JsxBinding> jsxBindings) {
        this.jsxBindings = jsxBindings;
    }

    public List<JsxClass> getJsxClasses() {
        return jsxClasses;
    }

    public void setJsxClasses(List<JsxClass> jsxClasses) {
        this.jsxClasses = jsxClasses;
    }

    @Override
    public String toString() {
        return "JsxAttributes{" +
                "angularDirectives=" + angularDirectives +
                ", jsxAttributes=" + jsxAttributes +
                ", jsxEvents=" + jsxEvents +
                ", jsxBindings=" + jsxBindings +
                ", jsxClasses=" + jsxClasses +
                '}';
    }
}
