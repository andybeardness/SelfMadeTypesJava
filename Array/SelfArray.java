import java.util.Arrays;

public class SelfArray<T> implements SelfArrayInterface<T>{
    int size;
    T[] array;
    int current;

    public SelfArray() {
        this.size = 0;
        this.array = initArray(this.size);
        this.current = 0;
    }

    public SelfArray(int size) {
        this.size = size;
        this.array = initArray(size);
        this.current = 0;
    }

    @Override
    public String toString() {
        return "SelfArray{" +
                "size=" + size +
                ", array=" + Arrays.toString(array) +
                ", current=" + current +
                '}';
    }

    private T[] initArray(int size) {
        return (T[]) new Object[size];
    }

    @Override
    public T get(int id) {
        return array[id];
    }

    @Override
    public T pop(int id) {
        return null;
    }

    @Override
    public void push(T obj) {
        if (current < size) {
            array[current++] = obj;
        }
        else {
            resize();
        }
    }

    @Override
    public void remove(int id) {

    }

    private void resize() {
        size *= 2;
        T[] oldArray = array;
        array = initArray(size);
        for (int i = 0; i < oldArray.length; i++) {
            array[i] = oldArray[i];
        }
    }
}
