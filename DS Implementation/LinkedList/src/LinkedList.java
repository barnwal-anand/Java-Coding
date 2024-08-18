public class LinkedList<T> {
    LinkedListNode<T> head;

    LinkedList() {
        head = null;
    }

    public void printList()
    {
        LinkedListNode<T> temp = head;

        while (temp != null) {
            System.out.print(temp.data); // print node value
            temp = temp.next;
            if (temp != null) {
                System.out.print(" → ");
            }
        }
        // if this is the last node, print null at the end
        System.out.print(" → null \n");
    }

    public void insertAtHead(T value) {
        LinkedListNode<T> newNode = new LinkedListNode<>(value);

        newNode.next = head;
        head = newNode;
    }

    public void insertAtTail(T value) {
        LinkedListNode<T> newNode = new LinkedListNode<>(value);
        LinkedListNode<T> curNode = head;

        while(curNode.next != null) {
            curNode = curNode.next;
        }
        curNode.next = newNode;
    }

    public boolean deleteByValue(T value) {
        LinkedListNode<T> cur = head;
        LinkedListNode<T> prev = null;

        if(cur.data == value) {
            cur = cur.next;
            head.next = null;
            head = cur;
            return true;
        }

        while(cur != null) {
            if (cur.data == value) {
                prev.next = cur.next;
                cur.next = null;
                return true;
            }

            prev = cur;
            cur = cur.next;
        }

        return false;
    }
}
