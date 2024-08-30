public class DLL {
    private int size;
    private DLLNode head;
    private DLLNode tail;

    public DLL() {
        head = null;
        tail = null;
        size = 0;
    }

    public void insertAtHead(int data) {
        DLLNode newNode = new DLLNode(data);
        newNode.next = head;
        if(!isEmpty()) {
            head.prev = newNode;
        }
        else {
            tail = newNode;
        }

        head = newNode;
        size++;
    }

    public void insertAtTail(int data) {
        if(isEmpty()) {
            insertAtHead(data);
        }
        else {
            DLLNode newNode = new DLLNode(data);
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
            size++;
        }
    }

    public DLLNode getHead() {
        return head;
    }

    public boolean isEmpty() {
        if(head == null && tail == null) {
            return true;
        }

        return false;
    }
}
