
class StackException extends Exception {
    public StackException(String message) {
        super(message);
    }
}

public class customStack {
    private int[] data;
    private static final int default_size = 10;
    private int ptr = -1;

    public customStack() {
        this(default_size);
    }

    public customStack(int size) {
        this.data = new int[size];
    }

    public boolean push(int item) {
        if (isFull()) {
            System.out.println("Stack is full");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

    public int pop() throws StackException {
        if (isEmpty()) {
            throw new StackException("Stack is empty, you cannot pop");
        }
        int removed = data[ptr];
        ptr--;
        return removed;
    }

    public int peek() throws StackException {
        if (isEmpty()) {
            throw new StackException("Cannot have peek in an empty stack");
        }
        return data[ptr];
    }

    public boolean isFull() {
        return ptr == data.length - 1;
    }

    public boolean isEmpty() {
        return ptr == -1;
    }

    public static void main(String[] args) {
        customStack stack = new customStack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        try {
            System.out.println("Peek: " + stack.peek());
            System.out.println("Pop: " + stack.pop());
            System.out.println("Peek after pop: " + stack.peek());
            System.out.println("Peek: " + stack.peek());
        } catch (StackException e) {
            System.out.println(e.getMessage());
        }
    }
}
