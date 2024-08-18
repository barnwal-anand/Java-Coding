public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();

        ll.insertAtHead(10);
        ll.insertAtHead(20);
        ll.insertAtHead(30);
        ll.insertAtHead(40);
        ll.printList();

        ll.insertAtTail(11);
        ll.insertAtTail(21);
        ll.insertAtTail(31);
        ll.printList();

        System.out.println(ll.deleteByValue(10));
        ll.printList();
        System.out.println(ll.deleteByValue(21));
        ll.printList();
        System.out.println(ll.deleteByValue(10));
        ll.printList();
        System.out.println(ll.deleteByValue(40));
        ll.printList();

    }
}