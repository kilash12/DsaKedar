

public class RBS {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,5,6};
        int target = 6;
        int ans = search(arr, target);
        System.err.println(ans);
        
    }
    static  int search(int nums[], int target){
        int pivot = findPivot(nums);
        if(pivot == -1){
            return binarySearch(nums, target, 0, nums.length-1);
        }
        if(nums[pivot] == target){
            return  pivot;
        }
        if(target >= nums[0]){
            return binarySearch(nums, target, 0, pivot-1);
        }
        return  binarySearch(nums, target, pivot+1, nums.length-1);

    }
    static int binarySearch(int[] arr, int target, int start, int end) {
        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }
        return -1;
    }
    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases over here
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid-1;
            }
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
    static  int findDuplicates(int arr[]){
        int start =0;
         int end = arr.length-1;
        int mid = start + (end-start);
        while(start < end ){
            if(mid<end && arr[mid]<arr[mid+1]){
                return  mid;

            }
            if(start<mid&& arr[mid]<arr[mid-1]){
                return  mid-1;
                
            }
            if(arr[mid] == arr[start] && arr[mid] == arr[end]){
                if(start < end && arr[start] >arr[start+1]){
                    return start;
                }
                start++;
                if( end >start && arr[end] < arr[end-1]){
                    return end-1;
                }
                end--;
            }
            else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[end]>arr[mid])){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }
    
}
