
import java.util.Arrays;
import java.util.Stack;

public class nextGreaterElement {
    public static void main(String[] args) {
        int arr[] = {1,2,1};
        System.out.println(Arrays.toString(nextgreatelement(arr)));
        
    }

    public static int[] nextgreatelement(int arr[]){
        int res []  = new int[arr.length];
        Stack<Integer> st = new Stack<>();

        // Arrays.fill(res , -1);
        // Arrays.setAll(res, i->-1);
        for (int i = 0; i < arr.length; i++) {
            res[i] = -1;
            
        }
        for (int i = 0; i < 2*arr.length; i++) {
            while(!st.isEmpty() && arr[st.peek()] < arr[i%arr.length]){
                res[st.pop()] = arr[i%arr.length];

                

            }
            if(i<arr.length){
                st.push(i);
               
            } 
            
        }
        


        return res;

        
    }
    
}
