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
}
