import  java.util.*;
public class Bublesorting {
    public static void main(String [] args){
        int arr[] = {3,1,5,4,2};
        bublesort(arr);
        
        System.err.println(Arrays.toString(arr));

    }
    static  void bublesort(int [] arr){
        for (int j = 0; j < arr.length; j++) {
            
            for(int i=0; i < arr.length-1; i++){
                if(arr[i] > arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp; 
                    
                }
            
        }
       
        }
        

    }
    
}
