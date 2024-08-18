
public class Stack<T> {
    private int top;
    private int size;
    private T[] arr;

    @SuppressWarnings("unchecked")
    Stack(int size) {
        this.size = size;
        arr = (T[]) new Object[size];
        this.top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(T value) {
        if(top == size - 1) {
            System.out.println("Stack is full");
        }
        else {
            arr[++top] = value;
        }
    }

    public T pop() {
        if(isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        }

        T temp = arr[top];
        top--;
        return temp;
    }

    public T top() {
        if(isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        }
        return arr[top];
    }
}
