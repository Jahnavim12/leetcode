class Solution {
    public int strStr(String h, String n) {
        int l=h.length();
        int m=n.length();
        if(l<m) return -1;
        int s=0;
        while(s<=l-m){
            int i=s,j=0;
            while(i<l && j<m && h.charAt(i)==n.charAt(j)){
                    i++;
                    j++;
                }
                    if(j==m){
                        return s;
                         }
                    s++;
                
        }
        
        return -1;
    }
}
