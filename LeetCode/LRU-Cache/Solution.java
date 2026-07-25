1class LRUCache {
2    int cap,sz;
3    CDLL ll ;
4    Map<Integer,CDLLNode> mp=new HashMap<>();
5
6    public LRUCache(int capacity) {
7    this.cap=capacity;
8    this.sz=0;
9    this.ll=new CDLL();
10    }
11    
12    public int get(int key) {
13        if(!mp.containsKey(key)) return -1;
14        CDLLNode node=mp.get(key);
15        ll.moveToFront(node);
16        return node.val;
17    }
18    
19    public void put(int key, int value) {
20        if(mp.containsKey(key)){
21            CDLLNode node=mp.get(key);
22            node.val=value;
23            ll.moveToFront(node);
24        }
25        else{
26            if(sz<cap){
27                CDLLNode node=ll.insertAtBegin(key,value);
28                mp.put(key,node);
29                sz++;
30            }
31            else{
32                int removedKey = ll.removeLast(); 
33                if (removedKey != -1) {
34                    mp.remove(removedKey);
35                    sz--;
36                }
37                CDLLNode node = ll.insertAtBegin(key, value);
38                mp.put(key, node);
39                sz++;
40
41            }
42        }
43    }
44}
45class CDLL{
46    CDLLNode head=null;
47    int removeLast(){
48        if(head==null) return -1;
49        CDLLNode remNode=head.prev;
50        if(remNode == head){
51            int ret=remNode.key;
52            head=null;
53            return ret;
54        }
55        else{
56            int ret=remNode.key;
57            remNode.prev.next=head;
58            head.prev=remNode.prev;
59            return ret;
60        }
61    }
62    CDLLNode insertAtBegin(int key,int val){
63        CDLLNode newNode = new CDLLNode(key, val);
64        if (head == null) {
65            head = newNode;
66            head.next = head;
67            head.prev = head;
68        } else {
69            CDLLNode last = head.prev;
70            last.next = newNode;
71            newNode.prev = last;
72            newNode.next = head;
73            head.prev = newNode;
74            head = newNode;
75        }
76        return newNode;
77    }
78    void moveToFront(CDLLNode node){
79        if (head == null || head == node) return;
80        node.prev.next = node.next;
81        node.next.prev = node.prev;
82
83        CDLLNode last = head.prev;
84        last.next = node;
85        node.prev = last;
86        node.next = head;
87        head.prev = node;
88        head = node;
89    }
90}
91class CDLLNode {
92    int key;
93    int val;
94    CDLLNode prev;
95    CDLLNode next;
96
97    public CDLLNode(int key, int val) {
98        this.key = key;
99        this.val = val;
100        this.prev= this;
101        this.next=this;
102    }
103}
104
105/**
106 * Your LRUCache object will be instantiated and called as such:
107 * LRUCache obj = new LRUCache(capacity);
108 * int param_1 = obj.get(key);
109 * obj.put(key,value);
110 */