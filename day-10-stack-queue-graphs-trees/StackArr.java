class Stack {
    int n;
    int top;
    int arr[];

    Stack(int n) {
        this.n = n;
        arr = new int[n];
        top = -1;
    }

    public void push(int x) {
        if (top == n - 1) {
            System.out.println("Stack is Overflow");
        }else{
            arr[++top] = x;
            System.out.println(arr[top]);
        }
    }

    public void pop() {
        if (top == -1) {
            System.out.println("Stack is Underflow");
        }else{
            int val = arr[top--];
            System.out.println(val + " is popped");
        }
    }

    public void peek() {
        if (top == -1) {
            System.out.println("Stack is Underflow");
        }
        System.out.println(arr[top]);
    }

    public void display() {
        if (top == -1) {
            System.out.println("Stack is Underflow");
            return;
        }
        for (int i = top; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

public class StackArr {
    public static void main(String[] args) {
        Stack s = new Stack(5);
        s.push(10);
        s.push(20);
        s.push(30);
        s.display();
        s.pop();
        s.display();
        s.peek();
    }
}
