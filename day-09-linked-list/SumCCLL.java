package SumCC;
import java.util.Scanner;

class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SumCCLL {
    Node head;

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) head = newNode;
        else {
            Node temp = head;
            while (temp.next != null) temp = temp.next;
            temp.next = newNode;
        }
    }

    public int findSum() {
        int sum = 0;
        Node temp = head;
        while (temp != null) {
            sum += temp.data;
            temp = temp.next;
        }
        return sum;
    }

    public static void main(String[] args) {
        SumCCLL list = new SumCCLL();
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int data = sc.nextInt();
            if (data == -1) break;
            list.insert(data);
        }
        System.out.println("Sum = " + list.findSum());
    }
}
