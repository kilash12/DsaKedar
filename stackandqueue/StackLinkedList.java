

class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }

}

public class StackLinkedList {
    private Node top;
    public StackLinkedList(){
        this.top = null;
    }

    public void push(int x){
        Node newNode = new Node(x);
        newNode.next = top;
        top = newNode;
        System.out.println(x+" ");
    }
    public int pop(){
        if(isEmpty()){
            throw  new RuntimeException("Stack underflow");

        }
        int popped = top.data;
        top= top.next;
        return popped;
    }
    public int peek(){
        if(isEmpty()){
            throw new RuntimeException("Stack is Empty");
        }
        return top.data;
    }
    public boolean  isEmpty(){
        return  top == null;
    }
    public void display(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return;
        }
        Node temp = top;
        System.out.println("Stack: ");
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");

    }

    
}
