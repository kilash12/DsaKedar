
    import java.util.Arrays;

public class dikays {
    static final int INF = Integer.MAX_VALUE;

    public static void dijkstra(int[][] graph, int src) {
        int n = graph.length;
        int[] dist = new int[n];
        boolean[] visited = new boolean[n];
        Arrays.fill(dist, INF);
        dist[src] = 0;

        for (int count = 0; count < n - 1; count++) {
            int u = findMinDistance(dist, visited);
            visited[u] = true;

            for (int v = 0; v < n; v++) {
                if (!visited[v] && graph[u][v] != 0 && dist[u] != INF && dist[u] + graph[u][v] < dist[v]) {
                    dist[v] = dist[u] + graph[u][v];
                }
            }
        }

        printSolution(dist, src);
    }

    private static int findMinDistance(int[] dist, boolean[] visited) {
        int min = INF, minIndex = -1;

        for (int i = 0; i < dist.length; i++) {
            if (!visited[i] && dist[i] < min) {
                min = dist[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    private static void printSolution(int[] dist, int src) {
        System.out.println("Vertex\tDistance from Source " + src);
        for (int i = 0; i < dist.length; i++) {
            System.out.println(i + "\t" + (dist[i] == INF ? "INF" : dist[i]));
        }
    }

    public static void main(String[] args) {
        int[][] graph = {
            {0, 10, 0, 30, 100},
            {10, 0, 50, 0, 0},
            {0, 50, 0, 20, 10},
            {30, 0, 20, 0, 60},
            {100, 0, 10, 60, 0}
        };
        dijkstra(graph, 0);
    }
}

    

