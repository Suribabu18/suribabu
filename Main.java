public class Main{
    public static void main (String [] args){
        int[]nums={10,20,30,40};
        Node head=new Node(10);
        Node node_1=new Node(20);
        Node node_2=new Node(30);
        Node node_3=new Node(40);
        head.next=node_1;
        node_1.next=node_2;
        node_2.next=node_3;
        Node temp=head;
        while(temp!=null){
        System.out.print(temp.data+"  ");
        temp=temp.next;
                 
 }
 }
}
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
    }
    class linkedlist{
        Node head;
        linkedlist(){
            this.head=null;
        }
    
        void insertBeg(int data){
            Node newNode=new Node(data);
            newNode.next=head;
            head=newNode;
        }
        void insertEnd(int data){
            Node newNode=new Node(data);
            if(head==null){
                head=newNode;
                return;
            }
        }
    }
