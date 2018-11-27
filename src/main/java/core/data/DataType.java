package core.data;

public abstract class DataType {
    private String ident;
    private boolean constFlag;

    public String getIdent() {
        return ident;
    }

    public void setIdent(String ident) {
        this.ident = ident;
    }

    public void freeze() {
        this.constFlag = true;
    }

    void testConst() {
        if (constFlag) {
            if (ident == null) {
                throw new RuntimeException("Literals or temp values cannot be modified.");
            } else {
                throw new RuntimeException("Data with name '" + ident + "' is a constant and cannot be modified.");
            }
        }
    }
}
