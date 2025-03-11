public class desendingorder {
    public static void main(String[] args) {
        int temp;
        int a[] = {1,2,3,4,5};
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length-1-i; j++) {
                if(a[j]<a[j+1]){
                    temp = a[j];
                    a[j]= a[j+1];
                    a[j+1]= a[j];
                }
                
            }
        }
        System.out.println();
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
