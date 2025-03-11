
import java.util.Arrays;

// public class patternbdg {
//     public static void main(String[] args) {
//        patt(4, 0);
        
//     }
//     static void patt(int r , int c){
//         if(r==0){
//             return;
//         }
//         if(c<r){
            

//          patt(r, c+1);
//          System.out.print("*");
//         }
//        else{
//         patt(r-1, 0);
    
//         System.out.println();
        
//        }

//     }
    
// }
// 
public class patternbdg  {
    public static void main(String[] args) {
        int arr[] = {7,8,3,4,5,3};
        selectionSort(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int arr[], int len, int index, int min) {
        // Base case: If the entire array is sorted
        if (len == 0) {
            return;
        }

        // If we have reached the end of the unsorted part
        if (index == len) {
            // Swap the found maximum element with the last element of the unsorted part
            int temp = arr[min];
            arr[min] = arr[len -1];
            arr[len - 1] = temp;

            // Recursively call selectionSort for the remaining unsorted part
            selectionSort(arr, len - 1, 0, 0);
        } else {
            // Find the index of the maximum element in the unsorted part
            if (arr[index] > arr[min]) {
                selectionSort(arr, len, index + 1, index);
            } else {
                selectionSort(arr, len, index + 1, min);
            }
        }
    }
}