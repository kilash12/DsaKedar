public class interactiveproblem {
    public static void main(String[] args) {
        
    }
    public int findInMountainArray(int target, int mountainArr []) {
        int start =0;
        int end = mountainArr.length-1;
        while(start < end ){
            int mid = start + (end -start)/2;
            if(target > mountainArr[mid])
            {
                start = mid+1;
            }
            else if(target < mountainArr[mid])
            {
                end = mid-1;
            }
            else{
                return mid;
            }
        }
        
              return -1;
        
    }
    
}
