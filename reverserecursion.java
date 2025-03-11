// public class reverserecursion {
    
    





















        // int n= 1;
        // int o=n;
        // int d=0;
        // while(n>0){
        //     int rem = n%10;
        //     d= d*10+rem;
        //     n/=10;
        // }
        // if(o==d){
        //     System.out.println(true);
        // }else{System.out.println(false);}
        

    //    System.out.println(reve(12345));
        
    // }
    // static int reve(int n){
    //     int dig = (int)Math.log10(n)+1;
    //     return helper( n , dig);

    // }
    // private static int helper(int n , int dig){
    //     if(n%10==n){
    //         return n;
    //     }
    //     return (n%10)*(int)(Math.pow(10, dig-1))+helper(n/10, dig-1);
//     public static void main(String[] args) {
//         System.out.println(palin(12321)); // Expected output: true
//         System.out.println(palin(12345));
        
//     }
//     static int rev(int n){
//         int dig = (int)Math.log10(n)+1;
//         return helper(n,dig);

// }
// private  static int helper(int n , int dig){
//     if(n%10==n){
//         return n;
//     }
//     return (n%10)*(int)Math.pow(10, dig-1)+helper(n/10, dig-1); 
// }
// static boolean palin(int n) {
//     return n == rev(n);
    
// }


// public static void main(String[] args) {
//     System.out.println(countzeros(30204));
//     System.out.println(countzeros(30204));
//     System.out.println(countzeros(10040));
//     System.out.println(countzeros(12345)); 
//     System.out.println(countzeros(0));     
// }
           


    
//     int n = 30204;
//     int c =0;
//     while(n>0){
//         if(n%10==0){
//             c++; 
//         }
//         n/=10;
//     }
//     System.out.println(c);
    
 
// //  public class reverserecursion {
//     public static void main(String[] args) {
        // int arr[] = {1,2,3,4,5,6,7};
        // int arr1[] = {2,3,4,1,6,7};
        // System.out.println(sorted(arr, 0));
        // System.out.println(sorted(arr1, 0));
        
   // }
    // static  boolean  sorted(int arr [] ,int  index){
    //     if(index == arr.length-1){
    //         return true;
    //     }
    //     return arr[index]<arr[index+1] && sorted(arr, index+1);

    // }
    
//     }
//  }
// public class reverserecursion {
//     public static void main(String[] args) {
//         int arr[] = {1,2,3,4,7,8};
//         int target = 0;
//         int index = 0;
//         System.out.println(linsechrecurtion(arr, target, index));
        
//     }
//     static boolean  linsechrecurtion(int arr[] , int target ,int index){
//         if(index == arr.length-1){
//             return false;
//         }
//         return arr[index] == target || linsechrecurtion(arr, target, index+1);
//     }

// }
// 
// public class reverserecursion {
//     public static void main(String[] args) {
//         int arr[] = {1,2,3,4,4,7,8};
//         int target = 4;
//         int index = arr.length-1;
//         System.out.println(findindexlast(arr, target, index));
        
//     }
//     static int  findindexlast(int arr[] , int target ,int index){
//         if(index == -1){
//             return -1;
//         }
//         if(arr[index]==target){
//             return index;
//         }
//         return findindexlast(arr, target, index-1);
//     }

// }


// import java.util.ArrayList;

// public class reverserecursion  {
//     static  ArrayList<Integer> list = new ArrayList<>();
//     public static void main(String[] args) {
//         int arr [] = {1,2,3,4,4,5,6,7};
//         int target=4;
//         findindexall(arr, target, 0);
//         System.out.println(list);
        
//     }
//     static void findindexall(int arr[] , int target, int index){
//         if(index == arr.length){
//         return;
//     }
//     if(arr[index]==target){
//         list.add(index);
//     }
//      findindexall(arr, target, index+1);
    
// }
// }
 import java.util.ArrayList;

public class reverserecursion  {
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,4,5,6,7};
        int target = 4;
        ArrayList<Integer> list = new ArrayList<>();
        findAllIndex(arr, target, 0);
        System.out.println(list);
        
    }
    static ArrayList<Integer> findAllIndex(int arr[] , int target , int index){
        ArrayList <Integer> list =new ArrayList<>();
        if(index==arr.length){
            return list ;
        }
        if(arr[index]==target){
            list.add(index);
        }
       ArrayList<Integer> li =   findAllIndex(arr, target, index+1);
       list.addAll(li);
       return list;
    }
    
}

