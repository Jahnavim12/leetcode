1class Solution {
2    public boolean validPath(int n, int[][] edges, int source, int destination) {
3        Map<Integer,List<Integer>> g=new HashMap<>();
4
5        for(int u=0;u<n;u++){
6        g.put(u,new ArrayList<>());
7      }
8
9    for(int i=0;i<edges.length;i++){
10        int u=edges[i][0],v=edges[i][1];
11        g.get(u).add(v);
12        g.get(v).add(u);
13    }
14
15        Queue<Integer> queues=new LinkedList<>();
16        Set<Integer> vis=new HashSet<>();
17        queues.add(source);vis.add(source);
18
19        while(!queues.isEmpty()){
20
21           int u=queues.remove();
22
23           if(u==destination) return true;
24
25           for(int v:g.get(u)){
26            if(!vis.contains(v)){
27             queues.add(v);vis.add(v);
28            }
29
30           }
31           
32        }
33        return false;
34    }
35}