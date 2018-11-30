package core.data;

import static java.lang.Math.abs;

public class X0Integer extends X0Number {
    private Long val;

    @Override
    protected int getCastPriority() {
        return 1;
    }

    @Override
    public int compareToZero() {
        return val == 0 ? 0 : (val < 0 ? -1 : 1);
    }

    public X0Integer() {
        this.val = 0L;
    }

    public X0Integer(Number num) {
        this.val = num.longValue();
        this.freeze();
    }

    public Long getVal() {
        return val;
    }

    @Override
    public ElementaryType negative() {
        return new X0Integer(-getVal());
    }

    public void assign(ElementaryType that) {
        super.assign(that);
        this.val = ((X0Number) that).getVal().longValue();
    }

    protected X0Number _add(X0Number that) {
        return new X0Integer(this.getVal() + that.getVal().longValue());
    }

    protected X0Number _subtract(X0Number that) {
        return new X0Integer(this.getVal() - that.getVal().longValue());
    }

    protected X0Number _subtract_reverse(X0Number that) {
        return new X0Integer(that.getVal().longValue() - this.getVal());
    }

    protected X0Number _multiply(X0Number that) {
        return new X0Integer(this.getVal() * that.getVal().longValue());
    }

    private Long divide(Long a, Long b) {
        if (b == 0) throw new RuntimeException("Divider cannot be zero!");
        Long ret = abs(a) / abs(b);
        if (a > 0 && b < 0 || a < 0 && b > 0) return -ret;
        return ret;
    }

    protected X0Number _divide(X0Number that) {
        return new X0Integer(divide(this.getVal(), that.getVal().longValue()));
    }

    protected X0Number _divide_reverse(X0Number that) {
        return new X0Integer(divide(that.getVal().longValue(), this.getVal()));
    }

    protected X0Number _mod(X0Number that) {
        return new X0Integer(this.getVal() % that.getVal().longValue());
    }

    protected X0Number _mod_reverse(X0Number that) {
        return new X0Integer(that.getVal().longValue() % this.getVal());
    }

    @Override
    public X0Number xor(X0Number that) {
        if (that instanceof X0Integer) {
            return new X0Integer(getVal() ^ ((X0Integer) that).getVal());
        } else {
            return super.xor(that);
        }
    }

    @Override
    public String verboseInfo() {
        return "[Integer] " + toString();
    }

    @Override
    public X0Integer clone() {
        return new X0Integer(this.getVal());
    }
}
