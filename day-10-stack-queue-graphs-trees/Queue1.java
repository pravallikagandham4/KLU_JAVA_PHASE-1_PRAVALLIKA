import java.util.*;
class Queue{
    int rear,front;
    int arr[];
    int size;
    Queue(int size){
        this.size=size;
        arr=new int[size];
        this.rear=-1;
        this.front=0;
    }
    void enqueue(int x){
        if(rear==size-1){
            System.out.println("Queue is full");
            return;
        }else{
            arr[++rear]=x;
            System.out.println(arr[rear]);
        }
    }
    void dequeue(){
        if(front>rear){
            System.out.println("Queue is empty");
            return;
        }
        System.out.println(arr[front++]);
    }
    void display(){
        if(front>rear){
            System.out.println("Queue is empty");
            return;
        }
        for(int i=front;i<=rear;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
}
public class Queue1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of Queue");
        int size=sc.nextInt();
        Queue q=new Queue(size);
        while(true){
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.println("Enter Choice");
            int choice=sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter element to be enqueued");
                    q.enqueue(sc.nextInt());
                    break;
                case 2:
                    q.dequeue();
                    break;
                case 3:
                    q.display();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Invalid Choice");
                    break;
            }
        }
    }
}
