package core.data;

public abstract class ElementaryType extends DataType {
    public void assign(ElementaryType that) {
        testConst();
    }

    abstract public Object getVal();
    abstract public ElementaryType add(ElementaryType that);
    abstract public ElementaryType subtract(ElementaryType that);
    abstract public ElementaryType negative();
    abstract public int compare(ElementaryType that);
    abstract public int compareToZero();

    public X0Boolean and(ElementaryType that) {
        return new X0Boolean(this.compareToZero() != 0 && that.compareToZero() != 0);
    }

    public X0Boolean or(ElementaryType that) {
        return new X0Boolean(this.compareToZero() != 0 || that.compareToZero() != 0);
    }

    public X0Boolean not() {
        return new X0Boolean(this.compareToZero() == 0);
    }

    @Override
    public String verboseInfo() {
        return "[ElementaryType]";
    }
}
