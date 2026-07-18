class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        int n=edges.length;
        UDFS U=new UDFS(n);
        for(int[] edge:edges){
            if(!U.union(edge[0],edge[1])){
                return edge;
            }
        }
        return new int[0];
    }
    class UDFS{
        int n;
        int[] parent;
        int islands;
        public UDFS(int n){
            this.n=n;
            this.islands=n;
            parent=new int[n+1];
            for(int i=0;i<n;i++){
                parent[i]=i;
            }
        }
    
        int find(int x){
            if(x==parent[x]) return x;
            return find(parent[x]=find(parent[x]));
        }

        boolean union(int x,int y){
            int lx=find(x),ly=find(y);
            if(lx==ly) return false;
            parent[ly]=lx;
            return true;
        }
    }
}