public class binarySearching {
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,8,9,1,2,3};
        int target=6;
        int ans = search(arr, target, 0, arr.length-1);
        System.out.println(ans);
        
    }
    static int search(int arr[] , int target, int s , int e){
        if(s>e){
            return -1;
        }
        int m = s+(e-s)/2;
        if(arr[m] == target){
            return m;
        }
        if(arr[m] > arr[s]){
            if(target >= arr[s] && target <= arr[m]){
               return  search(arr, target, s, m-1);
            }else{
                return search(arr, target, m+1, e);
            }
        }
        else{
            if(target <= arr[e] && target >= arr[m]){
                return search(arr, target, m+1, e);

            }
            else{
               return  search(arr, target, s, m-1);
            }
        }
        
    }
    
}
