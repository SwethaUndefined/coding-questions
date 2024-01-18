class Node{
    int data;
    Node next;
Node(int data){
    this.data=data;
    this.next=null;
}
}
public class linkedListAndOperations {

    static void traversal(Node head){
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
        System.out.println();
    }
     static int size(Node head) {
        int ans=0;
        while(head!=null){
            ans++;
            head = head.next;
        }
        return ans;       
    }

    static boolean search(Node head, int val){
        while(head!=null){
            if(head.data==val){
                return true;
            }
            head=head.next;
        }
        return false;
    }
    static void update(Node head){
        int startingIndex = head.data;
        while(head.next!=null){
            head=head.next;
        }
        head.data= startingIndex-head.data;
    }
    public static void main(String[] args) {
        Node head = new Node(2);
        Node secondNode = new Node(8);
        Node thirdNode = new Node(5);
        Node fourthNode = new Node(7);
        Node fifthNode = new Node(11);
        Node sixthNode = new Node(4);
        Node seventhNode = new Node(3);
        Node eighthNode = new Node(6);
        
        head.next=secondNode;
        secondNode.next=thirdNode;
        thirdNode.next=fourthNode;
        fourthNode.next=fifthNode;
        fifthNode.next=sixthNode;
        sixthNode.next=seventhNode;
        seventhNode.next=eighthNode;
        eighthNode.next=null;
        traversal(head);
        System.out.println("size " +size(head));
        System.out.println(search(head, 5));
        System.out.println(search(head,15));
        update(head);
        traversal(head);
    }
    
}
