
public class Main {
    public static void main(String[] args) {
        System.out.println("Queue Implementation !!");

        Queue<Integer> queue = new Queue<Integer>(5);
        System.out.println("dequeue - " + queue.dequeue());
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(60);

        System.out.println("dequeue - " + queue.dequeue());
        System.out.println("dequeue - " + queue.dequeue());
        System.out.println("dequeue - " + queue.dequeue());
        System.out.println("dequeue - " + queue.dequeue());
        System.out.println("dequeue - " + queue.dequeue());
        System.out.println("dequeue - " + queue.dequeue());

        queue.enqueue(60);
        System.out.println("dequeue - " + queue.dequeue());
    }
}