
import java.util.Scanner;

public class fibnoci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a=0;
        int b = 1;
       
        int count =2;
        while(n>=count){
            int temp =b;
            b = b+a;
            a= temp;
            count++;
        }
        System.err.println(b);

    }
    
}
