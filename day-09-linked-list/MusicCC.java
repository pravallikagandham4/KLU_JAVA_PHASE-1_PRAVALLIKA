package MusicCC;
import java.util.*;
class Node{
    int data;
    Node next;
    Node(int d){
        data = d;
        next = null;
    }
}
public class MusicCC {
    Node head;
    public void insert(int d){
        Node newNode = new Node(d);
        if(head==null){
            head = newNode;
            newNode.next=head;
        }
        else{
            Node temp = head;
            while(temp.next!=head){
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head;
        }
    }
    public void play(int n){
        Node temp = head;
        for(int i=1;i<=n;i++){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MusicCC obj = new MusicCC();
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            obj.insert(sc.nextInt());
        }
        int k = sc.nextInt();
        obj.play(k);
    }
}
