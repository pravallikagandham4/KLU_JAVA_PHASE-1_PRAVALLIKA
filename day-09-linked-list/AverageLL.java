package Avg;
import java.util.Scanner;

class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class AverageLL {
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

    public double findAverage() {
        if (head == null) return 0.0;
        int sum = 0, count = 0;
        Node temp = head;
        while (temp != null) {
            sum += temp.data;
            count++;
            temp = temp.next;
        }
        return (double) sum / count;
    }

    public static void main(String[] args) {
        AverageLL list = new AverageLL();
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int data = sc.nextInt();
            if (data == -1) break;
            list.insert(data);
        }
        System.out.println("Average = " + list.findAverage());
    }
}
