public class Lin {
    public static void main(String[] args) {
        int arr []  = {5,3,8,9,76,8,976,58};
        int n = arr.length;
        int key =25 ;
        int i;
        boolean flag = false;
        for ( i = 0; i < n; i++) {
            if(arr[i] == key){
                System.err.println("Key is present :" +i);
                flag = true;
                break;

            }
           
            
        }
        if(!flag){
            System.err.println("Key is not present in index ");
        }
       
        
    }
    
    
}
