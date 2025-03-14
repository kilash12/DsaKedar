public class FindcountofRotation {
    public static void main(String[] args) {
        int [] arr = {4,5,6,7,0,1,2};
        int ans = countRotations(arr);
        System.err.println(ans);


        
    }
    private static int countRotations(int[] arr) {
        int pivot = findpivot(arr);
        return pivot + 1;
    }
        static int   findpivot(int arr[]){
            int start =0;
            int end = arr.length -1;
            while(start < end) {
                 int mid = start + (end - start )/2;
                 if (mid > start && arr[mid] < arr[mid-1]){
                    return mid-1;
                 }
                 if(mid < end && arr[mid] < arr[mid+1]){
                    return  mid;
                 }
                 if(arr[mid] < arr[start]){
                    end = mid-1;
                 }else{
                    start = mid+1;
                 }
            }
            return  -1;

        }
        
    
}
