import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue <Integer> q = new LinkedList<>();
        q.offer(10);
        q.offer(20);
        
        q.offer(30);
        q.offer(40);
         //return the peek element  = 10
    //     System.out.println(q.peek());

    //     // print the queue all element
    //     System.out.println(q);
    //     //remove the queue first eleent
    //     q.poll();
    //     System.out.println(q.peek());

    //     System.out.println(q);
    //     System.out.println(q.remove());

    //     //return the peek element 
    //     System.out.println(q.element());


    //     System.out.println(q);


    while(!q.isEmpty()){
        System.out.println(q.remove());
    }
     }
    
}
