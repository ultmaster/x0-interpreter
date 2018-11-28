package core.data;

public abstract class X0Number extends ElementaryType {

    abstract public Number getVal();

    abstract protected int getCastPriority();
    abstract protected X0Number _add(X0Number that);
    abstract protected X0Number _subtract(X0Number that);
    abstract protected X0Number _subtract_reverse(X0Number that);
    abstract protected X0Number _multiply(X0Number that);
    abstract protected X0Number _divide(X0Number that);
    abstract protected X0Number _divide_reverse(X0Number that);
    abstract protected X0Number _mod(X0Number that);
    abstract protected X0Number _mod_reverse(X0Number that);

    @Override
    public void assign(ElementaryType that) {
        if (!(that instanceof X0Number)) {
            throw new RuntimeException("Cannot cast a string into a number.");
        }
        super.assign(that);
    }

    @Override
    public int compare(ElementaryType that) {
        if (!(that instanceof X0Number)) {
            throw new RuntimeException("Cannot compare a number with a non-number.");
        }
        X0Number sub = this.subtract((X0Number) that);
        return sub.compareToZero();
    }

    public ElementaryType add(ElementaryType that) {
        if (that instanceof X0String) {
            return ((X0String) that)._add_reverse(this);
        } else {
            return this.add((X0Number) that);
        }
    }

    public ElementaryType subtract(ElementaryType that) {
        if (that instanceof X0Number) {
            return this.subtract((X0Number) that);
        } else {
            throw new RuntimeException("Subtraction between non-numbers is not allowed.");
        }
    }

    private X0Number add(X0Number that) {
        if (this.getCastPriority() >= that.getCastPriority()) {
            return this._add(that);
        } else {
            return that._add(this);
        }
    }

    private X0Number subtract(X0Number that) {
        if (this.getCastPriority() >= that.getCastPriority()) {
            return this._subtract(that);
        } else {
            return that._subtract_reverse(this);
        }
    }

    public X0Number multiply(X0Number that) {
        if (this.getCastPriority() >= that.getCastPriority()) {
            return this._multiply(that);
        } else {
            return that._multiply(this);
        }
    }

    public X0Number divide(X0Number that) {
        if (this.getCastPriority() >= that.getCastPriority()) {
            return this._divide(that);
        } else {
            return that._divide_reverse(this);
        }
    }

    public X0Number mod(X0Number that) {
        if (this.getCastPriority() >= that.getCastPriority()) {
            return this._mod(that);
        } else {
            return that._mod_reverse(this);
        }
    }

    @Override
    public String toString() {
        return String.valueOf(this.getVal());
    }
}
