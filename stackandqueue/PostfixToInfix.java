
import java.util.Stack;

public class PostfixToInfix {
    public static void main(String[] args) {
        String s = "ab*c+ ";
        System.out.print(postfixtoInfix(s)+" ");
    }

    public static String postfixtoInfix(String s){
        Stack<String> st = new Stack<>();

        int n = s.length();

        for(int i =0 ; i<n-1 ; i++){
            char ch = s.charAt(i);

            if(Character.isLetterOrDigit(ch)){
                st.push(String.valueOf(ch));


            }else{
                String a = st.pop();

                String b= st.pop();

                String ans = "(" + b +ch +a + ")";

                st.push(ans);

            }
        }
        return st.pop();

    }
    
}
