
import java.util.PriorityQueue;
import java.util.Queue;

public class priorityQuequeExample {
    public static void main(String[] args) {
        Queue<String> pq = new PriorityQueue<>();
        pq.offer("kailaash");
        pq.offer("'Chanchu'");
        pq.add("'Abishek'");
        pq.add("'Bhanu'");

        System.out.println(pq);

        System.out.println(pq.poll());
        
    }
    
}
