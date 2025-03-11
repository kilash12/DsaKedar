public class minElement {
    public static void main(String[] args) {
        int num[] = {2,3,5,7,9,-3,5,6,7,9};
        System.out.println(min(num));
    }
    static int min(int arr[]){
        int mi = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(mi  > arr[i]){
                mi = arr[i];

            }
            
            
        }
        return mi;

    }
}
