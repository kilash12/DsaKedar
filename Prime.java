

public class Prime {
public static void main(String[] args) {
    long n  = 234567893;
    boolean f =false;
    if(n<=1){
        System.err.println("Not prime");
        return;
    }
    for(int i = 1 ; i<n; i++){
        if(n%i==0){
            System.err.println("Not prime");
           f = true;
           break;
        }
        
    }
    if(!f){
        System.err.println("prime");
    }
}

    
}
