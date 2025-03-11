public class largestArray {
    public static void main(String[] args) {
        int a[] = {25, 11, 7, 75, 56};
        int max = a[0] ;
        for (int i = 0; i < a.length; i++) {
            if(max<a[i]){
                max = a[i];
            }
            
        }
        System.err.println(max);
    } 
}
