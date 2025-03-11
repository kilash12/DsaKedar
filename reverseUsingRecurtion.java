public class reverseUsingRecurtion {
    public static void main(String[] args) {
        System.out.println(rev(327647312));
    }
    // public static void main(String[] args) {
    //     reverseUsingRecurtion obj = new reverseUsingRecurtion();
    //     int reversedNumber = obj.rev(1234, 0); // Passing initial reverse as 0
    //     System.out.println(reversedNumber);
    // }

    // // Recursive method to reverse the number
    // int rev(int n, int r) {
    //     if (n == 0) {
    //         return r;
    //     }
    //     int rem = n % 10;
    //     r = r * 10 + rem;
    //     return rev(n / 10, r); // Passing updated reverse
    // }
    static  int  rev(int n){
        int d = (int)Math.log10(n)+1;
        return  helper( n , d);
    }
    static  int helper(int n , int d){
        if(n%10 == n){
            return n;
        }
        int rem = n%10;
        return  rem*(int)Math.pow(10, d-1)+helper(n/10, d-1);

    }
}
