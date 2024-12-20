package AST;

public class Directives {
    private NgIfDirective ngIf;
    private NgSwitchDirective ngSwitch;
    private NgSwitchCaseDirective ngSwitchCase;
    private NgSwitchDefaultDirective ngSwitchDefault;
    private NgForDirective<?> ngFor;
    private NgStyleDirective ngStyle;
    private NgClassDirective ngClass;

    public NgIfDirective getNgIf() {
        return ngIf;
    }

    public void setNgIf(NgIfDirective ngIf) {
        this.ngIf = ngIf;
    }

    public NgSwitchDirective getNgSwitch() {
        return ngSwitch;
    }

    public void setNgSwitch(NgSwitchDirective ngSwitch) {
        this.ngSwitch = ngSwitch;
    }

    public NgSwitchCaseDirective getNgSwitchCase() {
        return ngSwitchCase;
    }

    public void setNgSwitchCase(NgSwitchCaseDirective ngSwitchCase) {
        this.ngSwitchCase = ngSwitchCase;
    }

    public NgSwitchDefaultDirective getNgSwitchDefault() {
        return ngSwitchDefault;
    }

    public void setNgSwitchDefault(NgSwitchDefaultDirective ngSwitchDefault) {
        this.ngSwitchDefault = ngSwitchDefault;
    }

    public NgForDirective<?> getNgFor() {
        return ngFor;
    }

    public void setNgFor(NgForDirective<?> ngFor) {
        this.ngFor = ngFor;
    }

    public NgStyleDirective getNgStyle() {
        return ngStyle;
    }

    public void setNgStyle(NgStyleDirective ngStyle) {
        this.ngStyle = ngStyle;
    }

    public NgClassDirective getNgClass() {
        return ngClass;
    }

    public void setNgClass(NgClassDirective ngClass) {
        this.ngClass = ngClass;
    }

    @Override
    public String toString() {
        return "Directives{" +
                "ngIf=" + ngIf +
                ", ngSwitch=" + ngSwitch +
                ", ngSwitchCase=" + ngSwitchCase +
                ", ngSwitchDefault=" + ngSwitchDefault +
                ", ngFor=" + ngFor +
                ", ngStyle=" + ngStyle +
                ", ngClass=" + ngClass +
                '}';
    }
}
