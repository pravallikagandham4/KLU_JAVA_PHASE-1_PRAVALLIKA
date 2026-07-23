package Pos;
import java.util.Scanner;

class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class InsertatPositionLL {
    Node head;

    public void insertAtPosition(int data, int position) {
        Node newNode = new Node(data);
        if (position <= 1 || head == null) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node temp = head;
        int count = 1;
        while (temp.next != null && count < position - 1) {
            temp = temp.next;
            count++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        InsertatPositionLL list = new InsertatPositionLL();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // number of elements
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            list.insertAtPosition(val, i + 1); // insert sequentially
        }

        int newVal = sc.nextInt();   // value to insert
        int pos = sc.nextInt();      // position to insert
        list.insertAtPosition(newVal, pos);

        list.display();
    }
}
