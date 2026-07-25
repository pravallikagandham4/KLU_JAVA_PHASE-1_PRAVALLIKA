import java.util.*;
class Node {
    int data;
    Node next;
    Node(int d) {
        this.data = d;
        this.next = null;
    }
}

class Main {
    Node first;
    void insert(int d) {
        Node n = new Node(d);
        if (first == null)
            first = n;
        else {
            Node temp = first;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = n;
        }
    }

    void display() {
        if (first == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = first;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        Main m = new Main();
        
        int d = obj.nextInt();
        while (d != -1) {
            m.insert(d);
            d= obj.nextInt();
        }
        m.display();
    }
}