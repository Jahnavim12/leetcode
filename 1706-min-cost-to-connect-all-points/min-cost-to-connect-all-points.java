class Solution {
    class Edge {
        int u,v,weight;
        Edge(int u,int v,int weight){
            this.u=u;
            this.v=v;
            this.weight=weight;
        }
    }
    public int minCostConnectPoints(int[][] points) {
        int n=points.length;
        List<Edge> allEdges=new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int dist=Math.abs(points[i][0]-points[j][0])+ 
                           Math.abs(points[i][1]-points[j][1]);
                allEdges.add(new Edge(i, j, dist));
            }
        }
        Collections.sort(allEdges,(a, b)->a.weight-b.weight);
        int[] parent=new int[n];
        for(int i=0;i<n;i++) parent[i]=i;
        int cost = 0;
        int edgesCount = 0;
        for (Edge edge:allEdges) {
            int rootU=find(parent,edge.u);
            int rootV=find(parent,edge.v);
            if (rootU!=rootV) {
                parent[rootU]=rootV;
                cost+=edge.weight;
                edgesCount++;
            }
        }
        return cost;
    }

    private int find(int[] parent, int i) {
        if(parent[i]==i) return i;
        return parent[i]=find(parent, parent[i]);
    }
}