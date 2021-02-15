import java.util.Arrays;

public class SelfArray<T> implements SelfArrayInterface<T>{
    int size;
    T[] array;
    int current;
    ResizeMethodInterface rs;

    public SelfArray() {
        this.size = 0;
        this.array = initArray(this.size);
        this.current = 0;
        this.rs = initDefaultResizer(this.size);
    }

    public SelfArray(ResizeMethodInterface rs) {
        this.size = 0;
        this.array = initArray(this.size);
        this.current = 0;
        this.rs = rs;
    }

    public SelfArray(int size) {
        this.size = size;
        this.array = initArray(size);
        this.current = 0;
        this.rs = initDefaultResizer(this.size);
    }

    public SelfArray(int size, ResizeMethodInterface rs) {
        this.size = size;
        this.array = initArray(size);
        this.current = 0;
        this.rs = rs;
    }

    @Override
    public String toString() {
        return "SelfArray{" +
                "size=" + size +
                ", array=" + Arrays.toString(array) +
                '}';
    }

    private T[] initArray(int size) {
        return (T[]) new Object[size];
    }

    private ResizeMethodInterface initDefaultResizer(int size) {
        return new ResizeMethodInterface() {
            @Override
            public int getNewSize(int size) {
                return size += 10;
            }
        };
    }

    @Override
    public T get(int id) {
        return array[id];
    }

    @Override
    public void add(T obj) {
        if (current < size) {
            array[current++] = obj;
        }
        else {
            resize();
            array[current++] = obj;
        }
    }

    @Override
    public void remove(int id) {
        T[] oldArray = array;
        oldArray[id] = null;
        array = initArray(size);
        int counter = 0;
        for (T t : oldArray) {
            if (t != null) {
                array[counter++] = t;
            }
        }
        size = array.length;
    }

    private void resize() {
        T[] oldArray = array;
        size = rs.getNewSize(size);
        array = initArray(size);
        System.arraycopy(oldArray, 0, array, 0, oldArray.length);
    }
}
