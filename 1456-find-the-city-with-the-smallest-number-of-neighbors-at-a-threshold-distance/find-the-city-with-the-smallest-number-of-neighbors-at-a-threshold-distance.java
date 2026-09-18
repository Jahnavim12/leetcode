class Solution {
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        int inf = 1_000_000_000;
        int[][] dist = new int[n][n];
        for(int i = 0; i < n; i++){
            Arrays.fill(dist[i], inf);
            dist[i][i]=0;
        }
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            int w = edge[2];
            dist[u][v] = w;
            dist[v][u] = w;
        }
        for(int m = 0 ; m < n ; m++) {
            for(int s = 0 ; s < n ; s++) {
                for(int e = 0 ; e < n ; e++) {
                    if(dist[s][m] == inf || dist[m][e] == inf) 
                        continue;
                    dist[s][e] = Math.min(dist[s][e] , dist[s][m] + dist[m][e]);
                }

            }
        }
        int minCount = inf;
        int ans=-1;
        for (int i = 0; i < n; i++) {
        int count = 0;
        for (int j = 0; j < n; j++) {
            if ( dist[i][j] <= distanceThreshold) {
                count++;
                }
         }
         if (count <= minCount) {
                minCount = count;
                ans=i;
            }
         }
       return ans;
    }
}