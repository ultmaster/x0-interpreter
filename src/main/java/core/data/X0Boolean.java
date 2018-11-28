package core.data;

public class X0Boolean extends X0Number {
    private Integer val;

    @Override
    protected int getCastPriority() {
        return 0;
    }

    @Override
    public int compareToZero() {
        return val == 0 ? 0 : 1;
    }

    public X0Boolean() {
        this.val = 0;
    }

    public X0Boolean(Number num) {
        this.val = num.intValue() == 0 ? 0 : 1;
        this.freeze();
    }

    public X0Boolean(boolean num) {
        this.val = num ? 1 : 0;
        this.freeze();
    }

    public Integer getVal() {
        return val;
    }

    @Override
    public ElementaryType negative() {
        return new X0Boolean(getVal());
    }

    public void assign(ElementaryType that) {
        super.assign(that);
        this.val = that.compareToZero() == 0 ? 0 : 1;
    }

    protected X0Number _add(X0Number that) {
        return new X0Boolean(this.getVal() + that.getVal().intValue());
    }

    protected X0Number _subtract(X0Number that) {
        return new X0Boolean(this.getVal() - that.getVal().intValue());
    }

    protected X0Number _subtract_reverse(X0Number that) {
        return this._subtract(that);
    }

    protected X0Number _multiply(X0Number that) {
        return new X0Boolean(this.getVal() * that.getVal().intValue());
    }

    protected X0Number _divide(X0Number that) {
        throw new RuntimeException("Divide operation not supported for boolean.");
    }

    protected X0Number _divide_reverse(X0Number that) {
        return that._divide(this);
    }

    protected X0Number _mod(X0Number that) {
        throw new RuntimeException("Mod operation not supported for boolean.");
    }

    protected X0Number _mod_reverse(X0Number that) {
        return that._mod_reverse(this);
    }

    @Override
    public String toString() {
        if (getVal() == 0) return "false";
        return "true";
    }
}
