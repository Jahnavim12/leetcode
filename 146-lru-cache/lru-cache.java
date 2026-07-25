class LRUCache {
    int cap,sz;
    CDLL ll ;
    Map<Integer,CDLLNode> mp=new HashMap<>();

    public LRUCache(int capacity) {
    this.cap=capacity;
    this.sz=0;
    this.ll=new CDLL();
    }
    
    public int get(int key) {
        if(!mp.containsKey(key)) return -1;
        CDLLNode node=mp.get(key);
        ll.moveToFront(node);
        return node.val;
    }
    
    public void put(int key, int value) {
        if(mp.containsKey(key)){
            CDLLNode node=mp.get(key);
            node.val=value;
            ll.moveToFront(node);
        }
        else{
            if(sz<cap){
                CDLLNode node=ll.insertAtBegin(key,value);
                mp.put(key,node);
                sz++;
            }
            else{
                int removedKey = ll.removeLast(); 
                if (removedKey != -1) {
                    mp.remove(removedKey);
                    sz--;
                }
                CDLLNode node = ll.insertAtBegin(key, value);
                mp.put(key, node);
                sz++;

            }
        }
    }
}
class CDLL{
    CDLLNode head=null;
    int removeLast(){
        if(head==null) return -1;
        CDLLNode remNode=head.prev;
        if(remNode == head){
            int ret=remNode.key;
            head=null;
            return ret;
        }
        else{
            int ret=remNode.key;
            remNode.prev.next=head;
            head.prev=remNode.prev;
            return ret;
        }
    }
    CDLLNode insertAtBegin(int key,int val){
        CDLLNode newNode = new CDLLNode(key, val);
        if (head == null) {
            head = newNode;
            head.next = head;
            head.prev = head;
        } else {
            CDLLNode last = head.prev;
            last.next = newNode;
            newNode.prev = last;
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        return newNode;
    }
    void moveToFront(CDLLNode node){
        if (head == null || head == node) return;
        node.prev.next = node.next;
        node.next.prev = node.prev;

        CDLLNode last = head.prev;
        last.next = node;
        node.prev = last;
        node.next = head;
        head.prev = node;
        head = node;
    }
}
class CDLLNode {
    int key;
    int val;
    CDLLNode prev;
    CDLLNode next;

    public CDLLNode(int key, int val) {
        this.key = key;
        this.val = val;
        this.prev= this;
        this.next=this;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */