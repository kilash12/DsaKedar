
import java.util.Stack;

public class PrefixToInfix {

    public static void main(String[] args) {
        String s =  "*-A/BC-/AKL";
        System.out.print(preToInfix(s)+"");
        
    }
    public static String preToInfix(String s){
     Stack<String> stack = new Stack<>();
    int n = s.length();
    for (int i = n-1; i >=0; i--) {
        char ch = s.charAt(i);
        if(Character.isLetterOrDigit(ch)){
            stack.push(String.valueOf(ch));
        }
        else{
            String a = stack.pop();
            String b = stack.pop();

            String news = "(" + a + ch + b + ")";

            stack.push(news);
        }
        
    }
        return stack.pop();

    }
    
}
