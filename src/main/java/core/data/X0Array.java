package core.data;

import java.lang.reflect.Array;
import java.util.List;

public class X0Array<T extends ElementaryType> extends DataType {
    private T[] data;
    private List<Integer> dimensions;

    @SuppressWarnings("unchecked")
    public X0Array(Class<T> clazz, List<Integer> dimensions) {
        this.dimensions = dimensions;
        int capacity = 1;
        for (int dimension : this.dimensions) capacity *= dimension;
        data = (T[]) Array.newInstance(clazz, capacity);
        for (int i = 0; i < capacity; ++i)
            try {
                data[i] = clazz.newInstance();
            } catch (InstantiationException | IllegalAccessException e) {
                e.printStackTrace();
            }
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
        return data[getRealIndex(idx)];
    }

    @Override
    public String verboseInfo() {
        return "[Array] size = " + dimensions.toString();
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}
