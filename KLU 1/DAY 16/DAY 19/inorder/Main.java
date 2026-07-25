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
    static void inorder(Node node)
    {
        if(node != null)
        {
            inorder(node.left);
            System.out.print(node.data + " ");
            inorder(node.right);
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
        System.out.println("Inorder Traversal");
        inorder(root);

    }
}