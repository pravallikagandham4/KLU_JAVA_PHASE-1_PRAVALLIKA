import java.util.*;

class Queue {
    int front, rear;
    int n;
    int arr[];

    Queue(int n) {
        this.n = n;
        arr = new int[n];
        front = 0;
        rear = -1;
    }

    void enqueue(int data) {
        if (rear == n - 1) {
            System.out.println("Queue is full");
            return;
        }
        arr[++rear] = data;
        System.out.println(data + " inserted");
    }

    void dequeue() {
        if (front > rear) {
            System.out.println("Queue is Empty");
            return;
        }
        System.out.println(arr[front++] + " deleted");
    }

    void display() {
        if (front > rear) {
            System.out.println("Queue is Empty");
            return;
        }

        System.out.print("Queue: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        int n = obj.nextInt();
        Queue q = new Queue(n);

        while (true) {
            System.out.println("\n1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = obj.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to enqueue: ");
                    int val = obj.nextInt();
                    q.enqueue(val);
                    break;

                case 2:
                    q.dequeue();
                    break;

                case 3:
                    q.display();
                    break;

                case 4:
                    System.out.println("Exit");
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}