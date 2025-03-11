

class Node {
    int value;
    Node next;

    public Node(int value) {
        this.value = value;
        this.next = null;
    }
}

public class LLfirst {
    Node head;

    // Insert at the end
    void insert(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            return;  // Fix: Return to prevent further execution
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Insert at the beginning
    void insertFirst(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    void addLast(int value){
        Node newNode= new Node(value);
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;

    }

    // Display the linked list
    void display() {
        Node temp = head;
        while (temp != null) {  // Fix: Change condition to temp != null
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("end");
    }

    public static void main(String[] args) {
        LLfirst o = new LLfirst();
        o.insert(2);
        o.insert(4);
        o.insert(5);
        o.insert(6);
        o.display();  // Output: 2 -> 4 -> 5 -> 6 -> end

        o.insertFirst(0);
        o.insertFirst(1);
        o.display();  // Output: 1 -> 0 -> 2 -> 4 -> 5 -> 6 -> end

        o.addLast(25);
        o.display();
    }
}
