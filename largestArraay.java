
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class largestArraay {
    // public static int Element(int a[], int n) {
    //     int temp;
    //     for (int i = 0; i <n; i++) {
    //         for (int j = i+1; j < n; j++) {
    //             if(a[i]>a[j]){
    //                 temp =a[i];
    //                 a[i]= a[j];
    //                 a[j]= temp;
    //             }
                
    //         }
            
    //     }
    //     return a[n-1];
        
    // }
    // public static int element(int a[], int n){
    //     Arrays.sort(a);
    //     return a[n-1];
        
    // }
    public static int CollectionsArray(Integer a[], Integer n){
        List <Integer> list = Arrays.asList(a);
        Collections.sort(list);

        return list.get(n-1);
    } 
    
        
    
    
}
