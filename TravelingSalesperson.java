public class TravelingSalesperson {
    static final int INF = 999999;

    public static int tsp(int[][] graph, int visitedAll, int current, int[][] dp) {
        int n = graph.length;
        if (visitedAll == (1 << n) - 1)
            return graph[current][0]; // Return to the starting point

        if (dp[current][visitedAll] != -1)
            return dp[current][visitedAll];

        int minCost = INF;
        for (int next = 0; next < n; next++) {
            if ((visitedAll & (1 << next)) == 0 && graph[current][next] != 0) {
                int cost = graph[current][next] + tsp(graph, visitedAll | (1 << next), next, dp);
                minCost = Math.min(minCost, cost);
            }
        }

        dp[current][visitedAll] = minCost;
        return minCost;
    }

    public static void main(String[] args) {
        int[][] graph = {
            {0, 10, 15, 20},
            {10, 0, 35, 25},
            {15, 35, 0, 30},
            {20, 25, 30, 0}
        };
        int n = graph.length;
        int[][] dp = new int[n][1 << n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (1 << n); j++) {
                dp[i][j] = -1;
            }
        }
        System.out.println("Minimum cost: " + tsp(graph, 1, 0, dp));
    }
}
