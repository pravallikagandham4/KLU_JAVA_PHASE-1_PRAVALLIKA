import java.util.*;
class Stack 
{
    int top;
    int arr[];
    int size;
    Stack(int n)
    {
        this.top = -1;
        this.size=n;
        arr=new int[n];
    }
    void push(int d)
    {
        if(top==size-1)
        {
            System.out.print("stack overflow");
        }
        else
        {
            arr[++top]=d;
            System.out.print(arr[top]);
        }
    }
    void pop()
    {
        if(top==-1)
        System.out.print("stack underflow");
        else
        System.out.print(arr[top--]);
            
        }
    }
    void peek()
    {
        if(top==-1)
        System.out.print("stack underflow");
        else
        System.out.print(arr[top]);
    }
    void display()
    {
        if(top==-1)
        System.out.print("stack underflow");
        for(i=0;i>=0;i--)
        System.out.print(arr[i]+"");
    }
class Main{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        Stack s = new Stack(n);
        while(true)
        {
            System.out.print("1.push");
            System.out.print("2.pop");
            System.out.print("3.peek");
            System.out.print("4.display");
            System.out.print("5.Exit");
            System.out.print("Enter your choice: ");
            int choice = obj.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.print("Enter value to push: ");
                    int d = obj.nextInt();
                    s.push(d);
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
                    return;
                default:
                    System.out.println("Invalid choice");
            }
            
        }
    }
}