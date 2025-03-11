
public class SlidingWindow  {
    public static void main(String[] args) {
        int arr[] = {1, 3, -1, -3, 5, 3, 6, 7}; // Input array
        int k = 3; // Window size
        int res[] = maxSlidingWindow(arr, k); // Call the function

        // Print the result array
        for (int num : res) {
            System.out.print(num + " ");
        }
    }

    public static int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length == 0) return new int[0]; // Edge case: Empty arra
        
         int n = nums.length;
         int  ans[] = new int[n - k + 1]; // Corrected array size
        
         

        for (int i = 0; i <= n - k; i++) { // Iterate till the last valid window
            int ms = nums[i]; // Assume first element is the max
            for (int j = i; j < i + k; j++) { // Check for max in window
                ms = Math.max(ms, nums[j]);   
            }
            ans[i] = ms; // Store the max in ans[]
        }
        return ans;
    }
}
