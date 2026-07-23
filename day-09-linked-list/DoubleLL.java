package DDLL;
import java.util.Scanner;

class Node{
    Node next;
    Node prev;
    int data;
    Node(int data){
        this.prev = prev;
        this.next = next;
        this.data = data;
    }
}
public class DoubleLL {
    Node head;
    void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }else{
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
        }
    }
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        DoubleLL dll = new DoubleLL();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            dll.insert(sc.nextInt());
        }
        dll.display();
    }
}
