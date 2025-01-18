package AST;

public class angularDirective {
    private String directive;
    private String value;

    public angularDirective(String directive, String value) {
        this.directive = directive;
        this.value = value;
    }

    public String getDirective() {
        return directive;
    }

    public void setDirective(String directive) {
        this.directive = directive;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "AngularDirective{" +
                "directive='" + directive + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
