package AST;

public class NgSwitchCaseDirective<T> {
    private T caseValue;
    private Runnable content;

    public NgSwitchCaseDirective() {}

    public T getCaseValue() {
        return caseValue;
    }

    public void setCaseValue(T caseValue) {
        this.caseValue = caseValue;
    }

    public Runnable getContent() {
        return content;
    }

    public void setContent(Runnable content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "NgSwitchCaseDirective{" +
                "caseValue=" + caseValue +
                ", content=" + content +
                '}';
    }
}
