public class copyarray {
    public static void main(String[] args) {
        int  a[] = {1,2,3,4,5};
        int b[] = new int [a.length];
        System.err.println("Orinal array ");
        for(int i = 0 ; i<a.length;i++){
           
            b[i] = a[i];
        }
        System.err.println("original array ");
        for(int i = 0 ; i<a.length;i++){
           
            b[i] = a[i];
            
            System.err.print(a[i]+" ");
        }
        System.err.println();
        System.err.println("new array ");
        for(int i = 0 ; i<a.length;i++){
           
            b[i] = a[i];
            
            System.err.print(b[i]+" ");
        }
    }
}
