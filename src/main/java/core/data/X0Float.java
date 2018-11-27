package core.data;

public class X0Float extends X0Number {
    private Double val;

    protected int getCastPriority() {
        return 2;
    }

    @Override
    public int compareToZero() {
        return val == 0 ? 0 : (val < 0 ? -1 : 1);
    }

    public X0Float() {
        this.val = 0.0;
    }

    public X0Float(Number num) {
        this.val = num.doubleValue();
        this.freeze();
    }

    public Double getVal() {
        return val;
    }

    @Override
    public ElementaryType negative() {
        return new X0Float(-getVal());
    }

    public void assign(ElementaryType that) {
        super.assign(that);
        this.val = ((X0Number) that).getVal().doubleValue();
    }

    protected X0Number _add(X0Number that) {
        return new X0Float(this.getVal() + that.getVal().doubleValue());
    }

    protected X0Number _subtract(X0Number that) {
        return new X0Float(this.getVal() - that.getVal().doubleValue());
    }

    protected X0Number _subtract_reverse(X0Number that) {
        return new X0Float(that.getVal().doubleValue() - this.getVal());
    }

    protected X0Number _multiply(X0Number that) {
        return new X0Float(this.getVal() * that.getVal().doubleValue());
    }

    protected X0Number _divide(X0Number that) {
        return new X0Float(this.getVal() / that.getVal().doubleValue());
    }

    protected X0Number _divide_reverse(X0Number that) {
        return new X0Float(that.getVal().doubleValue() / this.getVal());
    }

}
