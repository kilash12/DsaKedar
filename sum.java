public class sum {
    public static void main(String[] args) {
        int ans = su(5);
        System.out.println(ans);
        
    }
    static int su(int n){
        if (n<=1){
            return 1;
        }
        return n + su(n-1);
    }
    
}
