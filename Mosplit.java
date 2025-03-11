public class Mosplit {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90,
            100, 130, 140, 160, 170};
    int target = 10;
    System.out.println(search(arr,target)); 
        
    }
   static  int search(int arr[] , int target){
        int start = 0;
        int end = 1;
        while(target > arr[end]){
            int temp = end+1;
            end  = start+(end-start)*2;
            start = temp;

        }
        return BinarySearch(arr,target,start,end);
    }
    static int BinarySearch(int arr[], int target, int start, int end){
        while(start < end){
            int mid = start + (end-start);

            if(arr[mid]<target){
                start = mid+1;
            }
            else if(arr[mid] > target){
                end = mid-1;
            }
            else{
                return  mid;
            }
        }
        return - 1;
    }
    
}
