package core.interrupt;

import core.data.DataType;
import core.data.ElementaryType;

public class ReturnInterrupt extends RuntimeException {
    public ElementaryType data;

    public ReturnInterrupt(ElementaryType data) {
        this.data = data;
    }

    public ReturnInterrupt() {
        super();
    }

    public ReturnInterrupt(String message) {
        super(message);
    }

    public ReturnInterrupt(String message, Throwable cause) {
        super(message, cause);
    }

    public ReturnInterrupt(Throwable cause) {
        super(cause);
    }

    protected ReturnInterrupt(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
