package core.data;

import java.lang.reflect.Array;
import java.util.List;

public class X0Array<T extends ElementaryType> extends DataType {
    private ElementaryType[] data;
    private List<Integer> dimensions;

    @SuppressWarnings("unchecked")
    public X0Array(Class<T> clazz, List<Integer> dimensions) {
        this.dimensions = dimensions;
        int capacity = 1;
        for (int dimension : this.dimensions) capacity *= dimension;
    }

    private int getRealIndex(List<Integer> idx) {
        if (idx.size() != this.dimensions.size()) {
            throw new RuntimeException("Array dimensions is not consistent with index dimensions");
        }
        int ret = 0;
        for (int i = 0; i < this.dimensions.size(); ++i)
            ret = ret * this.dimensions.get(i) + idx.get(i);
        return ret;
    }

    public T get(List<Integer> idx) {
        return (T) data[getRealIndex(idx)];
    }
}
