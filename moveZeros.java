public class moveZeros {
    public static void main(String[] args) {
        
    }
    static void moveZero(int[] arr){
        if(arr.length == 0){
            return;

        }
        int a=0;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]!=0){
                arr[a++] = arr[i];
            }
            
        }
        for (int i = 0; i < arr.length-1; i++) {
            arr[a++] = 0;
            
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            
        }

    }
}
