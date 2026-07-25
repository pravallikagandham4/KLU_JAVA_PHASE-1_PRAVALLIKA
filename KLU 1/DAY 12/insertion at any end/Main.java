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
    Node first {
        void insert(int data) {
            Node n = new Node(data);
            if(first == null){
                first = n;
                return;
            }
            Node temp = first;
            while(temp.next != null)
            temp = temp.next;
            temp.next = n;
        }
        void insert(int d, int pos){
            Node n = new Node(d);
            if(pos == 1){
                n.next = first;
                first = n;
                return;
            }
            Node temp = first;
            for(int i = 1; i < pos - 1 && temp != null;i++)
                temp = temp.next;
            if(temp == null) {
                System.out.println("Invalid position");
                return;
            }
            n.next = temp.next;
            temp.next = n;
        }
    }
}
void Main() {
    if(first==null)
    System.out.print("Linked list is Empty");
    Node temp = first;
    while (temp != null) {
        System.out.print(temp.data + " ");
        temp = temp.next;
    }
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Main m = new Main();
    while(d != -1){
        m.insert (d);
        d = obj.nextInt();
        Node first {
            void insert(int d);
            {
                Node n = new Node(d);
                if(first == NULL)
                {
                    first = n;
                }
            }
        }
    }
}