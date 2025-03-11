

public class BinarysearchRecusion {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,90};
        int target  = 6;
       int ans =  bi(arr, target, 0, arr.length-1);
        System.out.println(ans);
        
    }
    static int bi(int arr[], int target , int s, int e){
        if(s>e){
            return -1;
        }
        int m= s+(e-s)/2;
        if(arr[m] == target){
            return m;
        }
        if(arr[m]<target){
           return  bi(arr, target, m+1, e);
        }
        return bi(arr, target, s, m-1);

    }
    
}
