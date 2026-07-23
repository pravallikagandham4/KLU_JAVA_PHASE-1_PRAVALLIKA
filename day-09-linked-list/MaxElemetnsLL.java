package Maxlist;
import java.util.*;

class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
    }
}

class LinkedList {
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

    public int findMax() {
        int max = Integer.MIN_VALUE;
        Node temp = head;
        while (temp != null) {
            if (temp.data > max) max = temp.data;
            temp = temp.next;
        }
        return max;
    }
}

class MaxElementsLL {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        while (data != -1) {   // stop when 0 is entered
            list.insert(data);
            data = sc.nextInt();
        }
        System.out.println("Maximum element: " + list.findMax());
    }
}
