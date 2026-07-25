import java.util.*;
class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class Stack {
    private Node top;
    Stack() {
        top = null;
}
public void push(int data)
{
        Node n = new Node(data);
        n.next = top;
        top = n;
        System.out.println(data);
    }

    public void pop() {
        if (top == null) {
            System.out.println("Stack Underflow");
            return;
        }

        int value = top.data;
        top = top.next;
        System.out.println(value);
    }

    public void peek() {
        if (top == null) {
            System.out.println("Stack is Empty");
            return;
        }

        System.out.println(top.data);
    }

    public void display() {
        if (top == null) {
            System.out.println("Stack is Empty");
            return;
        }
        Node temp = top;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

class Main {
    public static void main(String[] args) {
        Stack s = new Stack();
        Scanner obj = new Scanner(System.in);

        int choice, value;

        while (true) {
            System.out.println("\n1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = obj.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter value to push: ");
                    value = obj.nextInt();
                    s.push(value);
                    break;

                case 2:
                    s.pop();
                    break;

                case 3:
                    s.peek();
                    break;

                case 4:
                    s.display();
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