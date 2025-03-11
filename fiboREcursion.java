public class fiboREcursion {
    public static void main(String[] args) {
        int n = 3;
        System.err.println(f(n));
        
    }
    static  int f(int n){
        if(n<2){
            return  n;
        }
        return  f(n-1) + f(n-2);
    }
    
}
