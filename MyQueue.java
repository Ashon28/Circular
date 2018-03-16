import java.util.NoSuchElementException;

public interface MyQueue {
    void enqueue(int in);

    int dequeue() throws NoSuchElementException;

    int noItems();

    boolean isEmpty();
}
