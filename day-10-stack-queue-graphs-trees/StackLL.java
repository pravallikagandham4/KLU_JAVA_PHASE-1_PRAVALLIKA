package SLL;
import java.util.*;
class Node{
    int data;
    Node next;
    Node(int d){
        this.data = d;
        this.next = null;
    }
}
class Stack{
    private Node top;
    Stack(){
        this.top = null;
    }
    void push(int data){
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        System.out.println(data);
    }
    void pop(){
        if(top == null){
            System.out.println("Stack Underflow");
            return;
        }
        else{
            System.out.println(top.data);
            top = top.next;
        }
    }
    void peek(){
        if(top == null){
            System.out.println("Stack Underflow");
            return;
        }
        System.out.println(top.data);
    }
    void display(){
        if(top == null){
            System.out.println("Stack is empty");
            return;
        }
        Node temp = top;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println();
    }
}
public class StackLL {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        Stack st = new Stack();
        while(true){
            System.out.println("1. Insert/Push ");
            System.out.println("2. Pop ");
            System.out.println("3. Peek ");
            System.out.println("4. Display ");
            System.out.println("5. Exit");
            System.out.println("Enter choice");
            int choice = s.nextInt();
            switch(choice) {
                case 1:
                    System.out.println("Enter the Element to insert");
                    int data = s.nextInt();
                    st.push(data);
                    break;
                case 2:
                    st.pop();
                    break;
                case 3:
                    st.peek();
                    break;
                case 4:
                    st.display();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }

}
