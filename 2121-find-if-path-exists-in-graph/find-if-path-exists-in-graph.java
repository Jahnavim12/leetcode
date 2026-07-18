class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        Map<Integer,List<Integer>> g=new HashMap<>();
        for(int u=0;u<n;u++){
        g.put(u,new ArrayList<>());
    }
    for(int i=0;i<edges.length;i++){
        int u=edges[i][0],v=edges[i][1];
        g.get(u).add(v);
        g.get(v).add(u);
    }
    //    if(source==destination) return true;
        Queue<Integer> queues=new LinkedList<>();
        Set<Integer> vis=new HashSet<>();
        queues.add(source);vis.add(source);
        while(!queues.isEmpty()){
           int u=queues.remove();
           if(u==destination) return true;
            
           for(int v:g.get(u)){
            if(!vis.contains(v)){
             queues.add(v);vis.add(v);

            }
           }
        }
        return false;
    }
}