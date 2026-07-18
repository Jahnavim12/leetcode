1class Solution {
2    public boolean validPath(int n, int[][] edges, int source, int destination) {
3        Map<Integer,List<Integer>> g=new HashMap<>();
4        for(int u=0;u<n;u++){
5        g.put(u,new ArrayList<>());
6    }
7    for(int i=0;i<edges.length;i++){
8        int u=edges[i][0],v=edges[i][1];
9        g.get(u).add(v);
10        g.get(v).add(u);
11    }
12    //    if(source==destination) return true;
13        Queue<Integer> queues=new LinkedList<>();
14        Set<Integer> vis=new HashSet<>();
15        queues.add(source);vis.add(source);
16        while(!queues.isEmpty()){
17           int u=queues.remove();
18           if(u==destination) return true;
19            
20           for(int v:g.get(u)){
21            if(!vis.contains(v)){
22             queues.add(v);vis.add(v);
23
24            }
25           }
26        }
27        return false;
28    }
29}