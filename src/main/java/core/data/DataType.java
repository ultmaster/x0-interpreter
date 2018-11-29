package core.data;

public abstract class DataType {
    private boolean constFlag;

    public void freeze() {
        this.constFlag = true;
    }

    void testConst() {
        if (constFlag) {
            throw new RuntimeException("Literals, temp values, or constants cannot be modified.");
        }
    }

    public String verboseInfo() {
        return "[DataType]";
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
