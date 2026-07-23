package Min;
import com.sun.tools.javac.Main;

import java.util.Scanner;
class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class MinElementsLL {
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

    public int findMin() {
        if (head == null) return Integer.MAX_VALUE;
        int min = Integer.MAX_VALUE;
        Node temp = head;
        while (temp != null) {
            if (temp.data < min) min = temp.data;
            temp = temp.next;
        }
        return min;
    }

    public static void main(String[] args) {
        MinElementsLL list = new MinElementsLL();
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int data = sc.nextInt();
            if (data == -1) break;   // stop when -1 entered
            list.insert(data);
        }
        System.out.println("Minimum element = " + list.findMin());
    }
}
