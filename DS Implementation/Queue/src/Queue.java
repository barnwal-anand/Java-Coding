
public class Queue<T> {
    private int front;
    private int rear;
    private T[] queue;
    private int size;
    private int curSize;

    public Queue(int size) {
        this.size = size;
        queue = (T[]) new Object[size];
        front = -1;
        rear = -1;
        curSize = 0;
    }

    public void enqueue(T item) {
        if(isFull()) {
            System.out.println("Queue is full");
        }
        else {
            rear = (rear + 1) % size;
            queue[rear] = item;
            curSize++;
        }
    }

    public T dequeue() {
        if(isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        }
        else {
            front = (front + 1) % size;
            curSize--;
            return queue[front];
        }
    }

    public boolean isEmpty() {
        return curSize == 0;
    }

    public boolean isFull() {
        return curSize == size;
    }
}
