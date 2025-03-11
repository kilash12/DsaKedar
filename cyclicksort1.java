
import java.util.Arrays;

public class cyclicksort1 {
    public static void main(String[] args) {
        int arr[] = {1,3,4,2,5};
        sort(arr);
        System.out.println(Arrays.toString(arr));
        
    }
         static  void sort(int arr[]){
            int i = 0 ; 
            while(i<arr.length){
                int core = arr[i]-1;
                if(arr[i] != arr[core]){
                    swap(arr,i,core);
                }
                else{
                    i++;
                }
            }

         }
         static  void swap(int arr[] , int first,int second){
            int temp = arr[first];
            arr[first] = arr[second];
            arr[second] = temp;

         }
    
}
