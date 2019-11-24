class Node {
    public int value;
    public Node left, right;

    public Node(int value, Node left, Node right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }
}

public class BinaryTree {
    public static boolean contains(Node root, int value) {
        throw new UnsupportedOperationException("Waiting to be implemented.");
    }
    
    public static void main(String[] args) {

        Node n1 = new Node(1, null, null);
        Node n4 = new Node(4, null, null);
        Node n7 = new  Node(7, null, null);
        Node n13 =new  Node(13,  null, null);
        Node n14 =new  Node(14, n13, null);
        Node n6 = new Node(6, n4, n7);
        Node n3 =new  Node(3, n1, n6);
        Node n10 =new  Node(10,  null, n14);
        Node n8 =new  Node(8, n3, n10);
        
        System.out.println(contains(n8, 3));
    }
}
