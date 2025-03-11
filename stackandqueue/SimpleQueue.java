public class SimpleQueue {
    private int queue[];
    private int f, r, size;

    public SimpleQueue(int cap) {
        this.queue = new int[cap];
        this.f = 0;
        this.r = -1;
        this.size = 0;
    }

    public void add(int data) {
        if (size == queue.length) {
            System.err.println("Queue full");
            return;
        }
        r++;
        queue[r] = data;
        size++;
        System.out.println(data);
    }

    public int remove() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int removed = queue[f];
        f++; // Just move front pointer instead of shifting elements
        size--;

        // Reset indices when the queue is empty
        if (size == 0) {
            f = 0;
            r = -1;
        }

        return removed;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return queue[f];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }
        System.out.print("Queue elements: ");
        for (int i = f; i <= r; i++) {  // Fixed syntax error
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }
}
