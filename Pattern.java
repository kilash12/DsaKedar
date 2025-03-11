public class Pattern {
    public static void main(String[] args) {
        Pattern6(5);   
        
    }
    static void Pattern6(int n){
        for (int row = 1; row <=n; row++) {
            for (int col = n-row; col >0; col--){
                System.err.print(" ");
                
            }
            for (int col = 1; col <=row; col++) {
                System.err.print("*");
                
            }
            System.err.println();
            
        }
        for (int row = 1; row <=n-1; row++) {
            for (int col = 1; col <=row; col++) {
                System.err.print(" ");
                
            } 
            for (int col = n-row; col >0; col--){
                System.err.print("*");
                
            }
          
            System.err.println();
            
        }
    // static void Pattern5(int n){
    //     for (int row = 1; row <=n; row++) {
    //         for (int col = n-row; col >0; col--){
    //             System.err.print(" ");
                
    //         }
    //         for (int col = 1; col <=row; col++) {
    //             System.err.print("*");
                
    //         }
    //         System.err.println();
            
    //     }
        
    // static void Pattern4(int n){
    //     for (int row = 1; row <= n; row++) {
    //         for (int col = 1; col <= row; col++) {
    //             System.out.print("*");
                
    //         }
    //         System.out.println();
            
    //     }
    //     for (int row = 1; row <= n-1; row++) {
        //     for (int col = 1; col <= n-row; col++) {
        //         System.out.print("*");
                
        //     }
        //     System.out.println();
            
        // }
        // *
// **
// ***
// ****
// *****
// ****
// ***
// **
// *
    // static void Pattern3(int n){
    //     for (int row = 1; row <= n; row++) {
    //         for (int col = 1; col <= n-row+1; col++) {
    //             System.out.print("*");
                
    //         }
    //         System.out.println();
            
    //     }
    // static void Pattern2(int n){
    //     for (int row = 1; row <= n; row++) {
    //         for (int col = 1; col <= n; col++) {
    //             System.out.print("*");
                
    //         }
    //         System.out.println();
            
    //     }
    // static void Pattern1(int n){
    //     for (int row = 1; row <= n; row++) {
    //         for (int col = 1; col <= row; col++) {
    //             System.out.print("*");
                
    //         }
    //         System.out.println();
            
    //     }
        
    }
    
}
