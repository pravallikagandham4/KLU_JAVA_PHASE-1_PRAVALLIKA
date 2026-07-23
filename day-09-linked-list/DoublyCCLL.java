package DCC;
import java.util.Scanner;

class Node {
    Node next;
    Node prev;
    int data;
    public Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class DoublyCCLL {
    Node head;
    public void insert(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            newNode.next = head;
            newNode.prev = head;
        } else {
            Node last = head.prev;
            last.next = newNode;
            newNode.prev = last;
            newNode.next = head;
            head.prev = newNode;
        }
    }
    public void display() {
        if (head == null){
            System.out.println("Linked List is Empty");
            return;
        }
        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoublyCCLL d = new DoublyCCLL();
        int val = sc.nextInt();
        while(val != -1) {
            d.insert(val);
            val = sc.nextInt();
        }
        d.display();
    }
}
