// Implement two stacks in one array
public class TwoStacks < V > {
    private int arraySize;
    private V[] array;
    private int top1;
    private int top2;

    @SuppressWarnings("unchecked")
    public TwoStacks(int arraySize) {
        this.arraySize = arraySize;
        array = (V[]) new Object[arraySize]; //type casting Object[] to V[]
        top1 = -1;
        top2 = arraySize;
    }

    //insert at top of first stack
    public void push1(V value) {
        if(top1 + 1 < top2) {
            top1++;
            array[top1] = value;
        }
    }

    //insert at top of second stack
    public void push2(V value) {
        if(top2 - 1 > top1) {
            top2--;
            array[top2] = value;
        }
    }

    //remove and return value from top of first stack
    public V pop1() {
        if(top1 > -1) {
            return array[top1--];
        }
        return null;
    }

    //remove and return value from top of second stack
    public V pop2() {
        if(top2 < arraySize) {
            return array[top2++];
        }
        return null;
    }

}