
public class maxin2dArray {
    public static void main(String[] args) {
        int num [][] = {
            {2,3,4,5},
            {4,5,7,4},
            {10,22,33,44},
            {22,11,10,12}

        };
        
        int ans = max(num);
        System.err.println(ans);
        
    }

    static int max(int arr[][]){
        int ma = Integer.MIN_VALUE;
        for (int r = 0; r <arr.length; r++) {
            for (int i = 0; i < arr[r].length; i++) {
                if(ma < arr[r][i]){
                    ma = arr[r][i];

                }

                
            }
            
        }
        return ma;

    }
    
}
