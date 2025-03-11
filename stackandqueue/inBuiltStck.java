import java.util.Stack;

class inBuiltStack {
    public static void main(String[] args) {
       Stack <Integer> sta = new Stack<>();
       sta.push(1);
       sta.push(2);
       sta.push(3);
       sta.push(4);
       sta.push(5);
       System.out.println(sta.pop());
       System.out.println(sta.pop());
       System.out.println(sta.pop());
       System.out.println(sta.pop());
       System.out.println(sta.pop());

    }
}