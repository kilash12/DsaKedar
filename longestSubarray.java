
import java.util.HashMap;

public class longestSubarray {
    public static void main(String[] args) {
        int arr [] = {0,1,2,3,1,1,2,3,4,5,6,7,7};
        int ans = longestSubarrayWithSumK(arr, 4);
        System.out.println(ans);
        
    }
    public static int longestSubarrayWithSumK(int[] a, long k) {
        HashMap<Long, Integer> prefixSumMap = new HashMap<>(); 
        long sum =0;
        int mc =0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
            if(sum==k){
                mc = i+1;
            }
            if(prefixSumMap.containsKey(sum-k)){
                mc = Math.max(mc, i-prefixSumMap.get(sum-k));
            }
           
              prefixSumMap.putIfAbsent(sum, i);
            
        }
        return mc;

    }
    
}
