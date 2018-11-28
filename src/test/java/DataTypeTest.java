import static org.junit.Assert.assertEquals;

import core.data.*;
import org.junit.Test;

public class DataTypeTest {
    private ElementaryType getType(int i) {
        if (i == -1) return new X0String("Hello");
        if (i == 0) return new X0Integer(2);
        if (i == 1) return new X0Float(2.8);
        return null;
    }

    @Test
    public void castDataType() {
        for (int i = -1; i <= 1; ++i)
            for (int j = -1; j <= 1; ++j) {
                ElementaryType a = getType(i);
                ElementaryType b = getType(j);

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
                    ElementaryType divide_result = ((X0Number) a).divide((X0Number) b);
                    System.out.println(String.format("%s * %s = %s", a.toString(), b.toString(), mul_result.toString()));
                    System.out.println(String.format("%s / %s = %s", a.toString(), b.toString(), divide_result.toString()));
                }
            }
    }
}