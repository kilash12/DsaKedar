class Node{
    int value;
    Node next;

    public Node(int value) {
        this.value = value;
        this.next = null;
    }
    
}





public class LLinsert {
    Node head;


    void insert(int value){
        Node newnode = new Node(value);
        if(head == null){
            head = newnode;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newnode;    
    }
    void display() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.value);
            if(temp.next != null) {
                System.out.print("->");
            }
            temp = temp.next;
        }
        System.out.println("->end");
    }
    
    public static void main(String[] args) {
        LLinsert o = new LLinsert();
        o.insert(2);
        o.insert(3);
        o.insert(4);
        o.insert(5);
        o.insert(6);
        o.insert(7);
        o.display();
        
    }
    
}
