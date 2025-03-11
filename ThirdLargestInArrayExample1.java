import java.util.*;
public class ThirdLargestInArrayExample1 {
    public static int  getThird(int a[] , int n){
       Arrays.sort(a);
       return a[n-3];
              
    }
     public static void main(String[] args) {
        int a[] = {2,3,4,31,21,3,23};
        System.out.println(getThird(a,a.length));
         
     }
}
