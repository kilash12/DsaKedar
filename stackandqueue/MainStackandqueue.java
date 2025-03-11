public class MainStackandqueue {
    public static void main(String[] args) {
        CustomQue o  = new CustomQue(10); // Fix: use a valid size > 0

        o.push(1);
        o.push(2);
        o.push(3);

        System.out.println(o.peek());  // Output: 1 (Front of the queue)
        System.out.println(o.pop());   // Output: 1 (Removes front element)
        System.out.println(o.empty()); // Output: false (Queue is not empty)
    }
}
