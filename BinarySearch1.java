public class BinarySearch1 {
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5,6,7,8,9};
        int target = 4;
        int ans = binarysearch(arr,target);
        System.err.println(ans);
        

    }
    static  int binarysearch(int arr[] , int target){
        
        int start = 0;
        int end  = arr.length-1;
        while(start < end){
        int mid = start + (end-start);
        if(target == arr[mid]){
            return mid;
        }
        else if(target > mid){
            start  = mid +1;
        }
        else{
            end = mid-1;
        }

        }
        return -1;

    }
    
}
