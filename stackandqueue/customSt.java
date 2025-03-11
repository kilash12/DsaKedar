public class customSt {  // Fixed class name
    private int[] arr;
    private int top;
    private int cap;

    public customSt(int size) {
        this.cap = size;
        this.arr = new int[size];
        this.top = -1;
    }

    public void push(int x) {
        if (top == cap - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = x;  // Simplified push logic
    }

    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack Underflow");
        }
        return arr[top--];
    }

    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return arr[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }
}
