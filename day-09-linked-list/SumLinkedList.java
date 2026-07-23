package sumlist;
import java.util.Scanner;
class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SumLinkedList {
    Node head;

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void sum() {
        if (head == null) {
            System.out.println("Linked list is empty");
            return;
        }
        int sum = 0;
        Node temp = head;
        while (temp != null) {
            sum += temp.data;
            temp = temp.next;
        }
        System.out.println("Sum = " + sum);
    }

    public static void main(String[] args) {
        SumLinkedList list = new SumLinkedList();
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        while (data != -1) {   // stop when -1 entered
            list.insert(data);
            data = sc.nextInt();
        }
        list.sum();
    }
}
