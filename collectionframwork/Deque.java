
import java.util.ArrayDeque;

public class Deque {
    public static void main(String[] args) {
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        dq.offer(10);
        dq.add(20);
        dq.add(30);
        System.out.println(dq);


        System.out.println(dq.peekLast()+" ");
    }
    
}
