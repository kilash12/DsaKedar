public class CountNumber {
    public static void main(String[] args) {
        int n = 324564432;
        int c=0;
        while(n>0){
            int rem = n%10;
            if(rem==1){
                c++;
            }
            n = n/10;
        }
        System.out.println(c);
    }
    
}
