
import java.util.Arrays;

public class secondlargestElement {
    public static void main(String[] args) {
        int arr [] = {4,5,1,2,34};
        System.err.println(fun(arr));

    }
    static int fun(int arr[]){
        int n = arr.length;
        Arrays.sort(arr);
        for (int i = n-2; i >0; i--) {
            if(arr[i]!=arr[i-1]){
                return arr[i];
            }

            
        }
        return -1;
    }
    
}
