public class sellandbystock {
    public static void main(String[] args) {
        int arr[] = {7, 1, 2, 3, 4, 5, 6, 3};
        System.out.println("Max Profit: " + findMaxProfit(arr));
    }

    static int findMaxProfit(int arr[]) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minPrice) {
                minPrice = arr[i];  // Update minPrice if a lower price is found
            } else if (arr[i] - minPrice > maxProfit) {  // Removed semicolon here
                maxProfit = arr[i] - minPrice;  // Update maxProfit
            }
        }
        return maxProfit;
    }
}
