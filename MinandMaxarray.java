public  class MinandMaxarray{

    public static void main(String[] args) {
        int A[] = {1,2,46,3,5,23,4556,54};
        int min = A[0];
        for(int i =0 ; i<A.length; i++){
            if(min>A[i]){
                min = A[i];
            }

            
        }
        System.err.println("min"+min);
        for(int i =0 ; i<A.length; i++){
            if(min>A[i]){
                min = A[i];
            }

            
        }
        System.err.println("min"+min);
         
    }
}