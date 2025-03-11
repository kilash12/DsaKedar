import java.util.Scanner;

public class alculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = 0;

        while (true) {
            System.out.println("Enter an operator (+, -, *, /, %) or 'x' to exit:");
            char op = sc.next().trim().charAt(0);
            
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                System.out.println("Enter two numbers:");
                int n1 = sc.nextInt();
                int n2 = sc.nextInt();

                if (op == '+') {
                    ans = n1 + n2;
                } else if (op == '-') {
                    ans = n1 - n2;
                } else if (op == '*') {
                    ans = n1 * n2;
                } else if (op == '/') {
                    if (n2 != 0) {
                        ans = n1 / n2;
                    } else {
                        System.out.println("Cannot divide by zero");
                        continue;
                    }
                } else if (op == '%') {
                    ans = n1 % n2;
                }
                
                System.out.println("The result is: " + ans);
            } else if (op == 'x' || op == 'X') {
                break; // Exit the loop
            } else {
                System.out.println("Invalid operation. Please try again.");
            }
        }
        
        sc.close();
        System.out.println("Calculator closed.");
    }
}
