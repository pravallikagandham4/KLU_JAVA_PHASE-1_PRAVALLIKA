class Node {
    int data;
    Node prev, next;

    Node(int data) {
        this.data = data;
        prev = next = null;
    }
}

class CircularDoublyLinkedList {
    Node head = null;
    Node tail = null;

    // Insert at the end
    void insertEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            head.next = head;
            head.prev = head;
        } else {
            newNode.prev = tail;
            newNode.next = head;
            tail.next = newNode;
            head.prev = newNode;
            tail = newNode;
        }
    }

    // Insert at the beginning
    void insertBeginning(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            head.next = head;
            head.prev = head;
        } else {
            newNode.next = head;
            newNode.prev = tail;
            head.prev = newNode;
            tail.next = newNode;
            head = newNode;
        }
    }

    // Delete a node by value
    void delete(int key) {
        if (head == null) {
            return;
        }

        Node current = head;

        do {
            if (current.data == key) {

                // Only one node
                if (head == tail) {
                    head = tail = null;
                }
                // Delete head
                else if (current == head) {
                    head = head.next;
                    head.prev = tail;
                    tail.next = head;
                }
                // Delete tail
                else if (current == tail) {
                    tail = tail.prev;
                    tail.next = head;
                    head.prev = tail;
                }
                // Delete middle node
                else {
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                }
                return;
            }

            current = current.next;
        } while (current != head);
    }

    // Display the list
    void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node temp = head;

        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);

        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        CircularDoublyLinkedList list = new CircularDoublyLinkedList();

        list.insertEnd(10);
        list.insertEnd(20);
        list.insertEnd(30);

        list.insertBeginning(5);

        list.display();

        list.delete(20);

        list.display();
    }
}