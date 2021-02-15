public interface SelfArrayInterface<T> {
    // BASIC METHODS
    T get(int id); // get element
    T pop(int id); // get element and remove
    void push(T obj); // add element to end of array
    void remove(int id); // remove element by id

    // ADDITIONAL METHODS
    // ...
}
