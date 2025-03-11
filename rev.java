public class rev {
    public static void main(String[] args) {
        int n =1234;
        int r=0;
        while(n>0){
            int rem = n%10;
            r = r*10+rem;
            n = n/10;

        }
        System.err.println(r);
    }
    
}
