public class leftRoatedAreay {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        leftzzzRoated(arr,3);
        
    }
    static void leftzzzRoated(int arr [] , int d){
        if(arr.length == 0){
            return;
        }
        for (int i = 0; i < d; i++) {
            int j , last;
            last = arr[arr.length-1];
            for ( j=arr.length-1 ;  j>0;  j--) {
                arr[j]=arr[j-1]; 
            }
            arr[0]=last;
            
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
            
        }

    }
    
}
