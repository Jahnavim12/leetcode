1class Solution {
2    public int uniquePaths(int m, int n) {
3        int[][] mat=new int[m][n];
4        for(int i=0;i<m;i++){
5            for(int j=0;j<n;j++){
6                if(i==0 || j==0){
7                mat[0][j]=1;
8                mat[i][0]=1;
9                }
10                else{
11                mat[i][j]=mat[i-1][j]+mat[i][j-1];
12                }
13            }
14        }
15        return mat[m-1][n-1];
16    }
17}