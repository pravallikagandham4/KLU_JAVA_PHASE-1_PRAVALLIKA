import java.util.*;
class Node
{
    int data;
    Node left, right;

    Node(int data)
    {
        this.data = data;
        left = right = null;
    }
}
class Main
{
    static void postorder(Node node)
    {
        if(node != null)
        {
            postorderorder(node.left);
            postorder(node.right);
            System.out.print(node.data + " ");
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 Values");
        Node root = new Node(sc.nextInt());
        root.left = new Node(sc.nextInt());
        root.right = new Node(sc.nextInt());
        root.left.left = new Node(sc.nextInt());
        root.left.right = new Node(sc.nextInt());
        System.out.println("Postorder Traversal");
        postorder(root);

        sc.close();
    }
}