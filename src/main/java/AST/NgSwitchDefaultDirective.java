package AST;

public class NgSwitchDefaultDirective<T> {
    private Runnable content;

    public NgSwitchDefaultDirective() {}

    public Runnable getContent() {
        return content;
    }

    public void setContent(Runnable content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "NgSwitchDefaultDirective{" +
                "content=" + content +
                '}';
    }
}
