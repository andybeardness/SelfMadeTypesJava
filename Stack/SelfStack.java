import java.util.Arrays;

class SelfStack<T> implements SelfStackInterface<T> {
    private int size;
    private T[] stack;
    private int current;

    public SelfStack() {
        this.size = 1;
        this.stack = initStack(this.size);
        this.current = 0;
    }

    public SelfStack(int size) {
        this.size = size;
        this.stack = initStack(size);
        this.current = 0;
    }

    @Override
    public String toString() {
        return "SelfStack{" +
                "size=" + size +
                ", stack=" + Arrays.toString(stack) +
                ", current=" + current +
                '}';
    }

    private T[] initStack(int size) {
        return (T[]) new Object[this.size];
    }

    private void resize(int newSize) {
        T[] oldStack = stack;
        size = newSize;
        stack = initStack(size);
        int counter = 0;
        for (T t: oldStack) {
            if (t != null) {
                stack[counter++] = t;
            }
        }
        current = counter;
    }

    @Override
    public void push(T obj) {
        if (current == size - 1) {
            stack[current] = obj;
        }
        else {
            stack[current++] = obj;
        }
    }

    @Override
    public T pop() {
        stack[current]
        return stack[current--];
    }
}