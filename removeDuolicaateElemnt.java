public class removeDuolicaateElemnt {
    public static int duplicate(int a[],int n){
        int tm[] = new int[n];
        int j=0;
        if(n==0||n==1){
            return n;
        }
        for (int i = 0; i < n-1; i++) {
           
                if(a[i]!=a[i+1]){
                tm[j++]=a[i];

                
                
            }
            
        }
        tm[j++]=a[n-1];
        for (int i = 0; i < j; i++) {
            a[i]=tm[i];
        }
        return  j;
    }
    public static void main(String[] args) {
        int tm[];
        int a[]= {10,20,30,30,40,50,50};
        int newlen = duplicate(a,a.length);
        System.out.println(duplicate(a,a.length));
        for (int i = 0; i < newlen; i++) {
            System.out.print(a[i]+" ");
        }
        
    }
}
