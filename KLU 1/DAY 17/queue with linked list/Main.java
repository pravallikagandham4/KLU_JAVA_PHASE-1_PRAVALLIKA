import java.util.*;

class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Queue {
    private Node front;
    private Node rear;

    Queue() {
        front = null;
        rear = null;
    }

    public void enqueue(int data) {
        Node n = new Node(data);

        if (rear == null) {
            front = rear = n;
        } else {
            rear.next = n;
            rear = n;
        }

        System.out.println(data);
    }

    public void dequeue() {
        if (front == null) {
            System.out.println("Queue Underflow");
            return;
        }

        int value = front.data;
        front = front.next;

        if (front == null) {
            rear = null;
        }

        System.out.println(value);
    }

    public void peek() {
        if (front == null) {
            System.out.println("Queue is Empty");
            return;
        }

        System.out.println(front.data);
    }

    public void display() {
        if (front == null) {
            System.out.println("Queue is Empty");
            return;
        }

        System.out.print("Queue elements: ");

        Node temp = front;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }
}

class Main {
    public static void main(String[] args) {
        Queue q = new Queue();
        Scanner obj = new Scanner(System.in);

        int choice, value;

        while (true) {
            System.out.println("\n1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = obj.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to insert: ");
                    value = obj.nextInt();
                    q.enqueue(value);
                    break;

                case 2:
                    q.dequeue();
                    break;

                case 3:
                    q.peek();
                    break;

                case 4:
                    q.display();
                    break;

                case 5:
                    System.out.println("Exiting Program");
                    obj.close();
                    return;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}