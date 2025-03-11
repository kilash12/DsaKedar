
import java.util.Stack;

public class PrefixToPostFix {
    public static void main(String[] args) {
        String s = "*-A/BC-/AKL";
        System.out.print(prefixtopostfix(s)+"");
        
    }
    public static String prefixtopostfix(String s){
        Stack<String> st = new Stack<>();
        int n = s.length();
        for(int i = n-1; i>=0 ; i--){
            char ch = s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                st.push(String.valueOf(ch));
            }
            else{
                String a = st.pop();
                String b = st.pop();

                String ans = a + b + ch;

                st.push(ans);

            }
        }
        return st.pop();
    }
    
}
