public class reverseLL {
    // Define Node as a static inner class
    static class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    Node head;

    // Insert a node at the end of the list
    void insert(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Display the linked list
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val);
            if (temp.next != null) {
                System.out.print("->");
            }
            temp = temp.next;
        }
        System.out.println("->end");
    }

    // Reverse the linked list
    void reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;
        
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

    public static void main(String[] args) {
        reverseLL o = new reverseLL();
        o.insert(2);
        o.insert(3);
        o.insert(4);
        o.insert(5);
        o.insert(6);
        o.insert(7);
        o.insert(8);
        
        System.out.print("Original List: ");
        o.display();
        
        o.reverse();
        
        System.out.print("Reversed List: ");
        o.display();
    }
}
