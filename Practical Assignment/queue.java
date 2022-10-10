import java.util.*;
public class queue { // last-in first-out
    static int j = 0;
    int size;
    int a[] = null;

    queue() {
        size = 8;
        a = new int[size];
    }

    queue(int size) {
        this.size = size;
        a = new int[size];
    }

    public void enqueue(int v) {
        a[j++] = v;
    }

    public void dequeue() {
        a = null;
    }

    public boolean empty() {
        if (a == null)
            return true;
        else
            return false;
    }

    public int getSize() {
        return size;
    }

    public void print() {
        System.out.println(Arrays.toString(a));

    }

}
