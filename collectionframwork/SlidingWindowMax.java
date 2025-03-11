
import java.util.ArrayDeque;

public class SlidingWindowMax {
    public static void main(String[] args) {
        int arr[] = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;

        int res[] = maxSlidingWindow(arr, k);

        for (int num : res) {
            System.out.print(num + " ");
        }
    }

    public static int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        if (n == 0) {
            return new int[0];
        }

        int res[] = new int[n - k + 1];
        ArrayDeque<Integer> dq = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            // Remove out-of-window elements
            if (!dq.isEmpty() && dq.peek() < i - k + 1) {
                dq.poll();
            }

            // Remove smaller elements in the deque
            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[i]) {
                dq.pollLast();
            }

            // Add the current index
            dq.offer(i);

            // Store result once window is of size k
            if (i >= k - 1) {
                res[i - k + 1] = nums[dq.peek()];
            }
        }

        return res;
    }
}
