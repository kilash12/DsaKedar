public class Floornumber{
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,6,8,9,10,26,78};

        int target = 7;
        int ass = findgrestSmallestElement(arr,target);
        System.err.println(ass);

        
    }
    static int findgrestSmallestElement(int arr[] , int target ){
int s = 0;
int end= arr.length-1;
while(s <= end){
    int mid = s+(end-s)/2;
    if(arr[mid] < target){
        s = mid+1;
    }
    else if(arr[mid]>target){
        end = mid-1;
    }
    else{
        return mid;
    }
}
return end;
        
    }
}