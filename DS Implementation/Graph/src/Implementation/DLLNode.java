package Implementation;

public class DLLNode {
    public int data;
    public DLLNode next;
    public DLLNode prev;

    DLLNode(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
