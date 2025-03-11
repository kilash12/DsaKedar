

public class LinearSearch1 {
    // public static void main(String[] args) {
    //    int arr[] =  {2,3,4,5,4,2,4,5,5};

    //     int ans = LinearSearch(arr,4); 
    //     System.err.println(ans);  
        
    // }
    // static int LinearSearch(int num [] , int key){
    //     if(num.length == 0){
    //         return -1;
    //     }
    //     for (int i = 0; i < num.length; i++) {
    //         if(num[i] == key){
    //             return i;
    //         }

    //     }
    //     return -1;
    // }
    public static void main(String[] args) {
        String str = "kailash";
        char key  = 'h';
        System.err.println(LinearSearch2(str,key));;

        
    }
    static boolean LinearSearch2(String str1, char key){
        if(str1.length() == 0){
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if(str1.charAt(i) == key){
                return true;
            }
            
        }
        return false;

    }
    
}
