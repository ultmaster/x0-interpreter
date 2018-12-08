import static org.junit.Assert.assertEquals;

import core.data.*;
import org.junit.Test;

public class DataTypeTest {
    private ElementaryType getType(int i, boolean t) {
        if (i == -1) return new X0String(t ? "1" : "Hello");
        if (i == 0) return new X0Boolean(1);
        if (i == 1) return new X0Integer(t ? 1 : 2);
        if (i == 2) return new X0Float(t ? 1.0 : 2.8);
        return null;
    }

    @Test
    public void castDataType() {
        for (boolean t: new Boolean[]{false, true}) {
            for (int i = -1; i <= 2; ++i)
                for (int j = -1; j <= 2; ++j) {
                    ElementaryType a = getType(i, t);
                    ElementaryType b = getType(j, t);

                    if (!t) {
                        ElementaryType add_result = a.add(b);
                        System.out.println(String.format("%s + %s = %s", a.toString(), b.toString(), add_result.toString()));
                        try {
                            ElementaryType subtract_result = a.subtract(b);
                            System.out.println(String.format("%s - %s = %s", a.toString(), b.toString(), subtract_result.toString()));
                        } catch (RuntimeException e) {
                            System.out.println(String.format("%s - %s = %s", a.toString(), b.toString(), e.toString()));
                        }
                        if (a instanceof X0Number && b instanceof X0Number) {
                            ElementaryType mul_result = ((X0Number) a).multiply((X0Number) b);
                            System.out.println(String.format("%s * %s = %s", a.toString(), b.toString(), mul_result.toString()));
                            if (!(a instanceof X0Boolean && b instanceof X0Boolean)) {
                                ElementaryType divide_result = ((X0Number) a).divide((X0Number) b);
                                System.out.println(String.format("%s / %s = %s", a.toString(), b.toString(), divide_result.toString()));
                            }
                        }
                    } else {
                        try {
                            int compareResult = a.compare(b);
                            System.out.println(String.format("%s == %s = %d", a.getClass().toString(), b.getClass().toString(), compareResult));
                        } catch (RuntimeException e) {
                            System.out.println(String.format("%s == %s = failed", a.getClass().toString(), b.getClass().toString()));
                        }
                    }
                }
        }
    }
}