1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    static ListNode reverseFirstN(ListNode head,int n){
13         ListNode curr=head;
14        ListNode prev=null;
15        while(n-->0){
16             ListNode n_n=curr.next;
17            curr.next=prev;
18            prev=curr;
19            curr=n_n;
20
21        }  
22        head.next=curr;
23        return prev;
24        }
25    public ListNode reverseBetween(ListNode head, int left, int right) {
26       if(head==null || left==right){
27        return head;
28    }
29    if(left==1){
30        return reverseFirstN(head,right);
31    }
32    ListNode prev=head;
33    for(int i=1;i<left-1;i++){
34        prev=prev.next;
35    }
36    prev.next=reverseFirstN(prev.next,right-left+1);
37    return head;
38    }
39}