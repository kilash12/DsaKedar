public class BinarySearch {
    public static int binarySearch(int A[], int f , int l,int key) {
      while(f<=l){
        int m = f+(l-f)/2;
        if(A[m]==key){
            return m;
        }
        else if(A[m]>key){
            m = m+1;
        }else{
            m=m-1;
        }
      }
      return -1;
        
    }
    public static void main(String[] args) {
        int A[] = {2,3,4,5,6,7,8,9,10};
        int n = A.length;
        int key =9;
        int result = binarySearch(A, 0, n-1, key);
        if(result == -1){
            System.err.println("Element no fond");
        }else{
            System.err.println("present" +result);
        }

    }
    
}
