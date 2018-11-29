package core.data;

public class X0String extends ElementaryType {
    String val;

    public X0String() {
        val = "";
    }

    public X0String(String s) {
        val = s;
        this.freeze();
    }

    @Override
    public String toString() {
        return val;
    }

    @Override
    public String getVal() {
        return val;
    }

    public void assign(ElementaryType that) {
        if (!(that instanceof X0String)) {
            throw new RuntimeException("Cannot cast a number into a string.");
        }
        super.assign(that);
        this.val = that.toString();
    }

    @Override
    public ElementaryType add(ElementaryType that) {
        return new X0String(val + that.toString());
    }

    ElementaryType _add_reverse(ElementaryType that) {
        return new X0String(that.toString() + val);
    }

    @Override
    public ElementaryType subtract(ElementaryType that) {
        throw new RuntimeException("String does not support subtraction.");
    }

    public ElementaryType negative() {
        throw new RuntimeException("String does not support negative operation.");
    }

    @Override
    public int compare(ElementaryType that) {
        if (!(that instanceof X0String)) {
            throw new RuntimeException("Cannot compare a string with a non-string.");
        }
        return this.val.compareTo((String) that.getVal());
    }

    @Override
    public int compareToZero() {
        return val.isEmpty() ? 0 : 1;
    }

    @Override
    public String verboseInfo() {
        return "[String] " + toString();
    }

    @Override
    public X0String clone() {
        return new X0String(this.getVal());
    }
}
