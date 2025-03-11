public class MainStackQUeue {
    public static void main(String[] args) {
        StackLinkedList stack = new StackLinkedList();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.display();  // Stack: 30 -> 20 -> 10 -> null

        System.out.println("Top element is: " + stack.peek()); // 30

        System.out.println("Popped element: " + stack.pop()); // 30
        stack.display(); // Stack: 20 -> 10 -> null

        System.out.println("Stack empty? " + stack.isEmpty()); // false
    }
}
