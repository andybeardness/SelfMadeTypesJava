import java.util.Arrays;

/**
 * Self-made Stack class for educations
 *
 * private vars :
 *      - size    -- size of Stack
 *      - stack   -- array Stack
 *      - current -- index of last item
 *
 * methonds :
 *      public :
 *          - push -- push item in Stack
 *          - pop -- pop item out of Stack
 *          - toString -- string value of object
 *
 *      private :
 *          - initStack -- init Stack array
 *
 * @author Beardness Andy
 * @param <T> any linked type of data
 */
class SelfStack<T> implements SelfStackInterface<T> {
    private int size;
    private T[] stack;
    private int current = 0;

    public SelfStack() {
        this.size = 1;
        this.stack = initStack(this.size);
    }

    public SelfStack(int size) {
        this.size = size;
        this.stack = initStack(size);
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

    @Override
    public void push(T obj) {
        if (current == size) current -= 1;
        stack[current++] = obj;
    }

    @Override
    public T pop() {
        if (current == 0) return null;
        T result = stack[--current];
        stack[current] = null;
        return result;
    }
}