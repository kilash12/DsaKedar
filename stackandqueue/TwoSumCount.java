
import java.util.HashMap;

public class TwoSumCount{
    



    public static void main(String[] args) {
        int[] nums = {1, 5, 7, -1, 5};
        int target = 6;
    
        int ans = CountSumTarget(nums , target);
        System.out.println(ans);
        
    }
    
    public  static int CountSumTarget(int arr [] ,int  target){
        HashMap<Integer,Integer> map = new HashMap<>();
        int count =0;
        for (int num : arr) {

            int comm = target - num;
            if(map.containsKey(comm)){
                count += map.get(comm); 
            }
            map.put(num, map.getOrDefault(num, 0)+1);

        }
        return count;
    

    }
    
}
