import java.util.NoSuchElementException;

public class CircularArrayQueue implements MyQueue{

    public int[] queue;
    public boolean empty;
    public int head;
    public int tail;
    public int noItems;

    public CircularArrayQueue(){
        queue = new int[10];
        empty = true;
        head = 0;
        tail = 0;
        noItems = 0;
    }

    public void enqueue(int in){

        queue[tail] = in;
        if (tail == queue.length-1){
            tail = 0;
        }
        else{
            tail++;
        }

        noItems++;
    }

    public int dequeue() throws NoSuchElementException{
        if (isEmpty()){
            throw new NoSuchElementException();
        }
        int headValue = queue[head];
        queue[head] = 0;
        if (head == queue.length-1) {
            head = 0;
        }
        else {
            head++;
        }
        noItems--;
        return headValue;

    }

    public int noItems(){
        return noItems;
    }

    public boolean isEmpty(){
        if (head == tail){
            empty=true;
        }
        else {
            empty=false;
        }

        return empty;
    }

    public int getCapacityLeft(){
        int capacity = queue.length - noItems;
        return capacity;
    }
}
