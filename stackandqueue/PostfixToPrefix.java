
import java.util.Stack;

public class PostfixToPrefix {
    public static void main(String[] args) {
        String s = "ABC/-AK/L-*";
        System.out.print(posttoprefix(s)+" ");
    }
    public static String posttoprefix(String s){
        Stack<String> st = new Stack<>();

        int n = s.length();

        for(int i = 0 ; i < n; i++){
            char ch = s.charAt(i);

            if(Character.isLetterOrDigit(ch)){
                st.push(String.valueOf(ch));
            }
            else{
                String a = st.pop();

                String b = st.pop();

                String ans = ch + a + b;

                st.push(ans);
            }
        }
        return st.pop();

    }
    
}
