/**
 * BinaryTree
 */
class Node{
    int data;
    Node right;
    Node left;

    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
};

class BinaryTree {
    Node root;

    BinaryTree(int data){
        root = new Node(data);
    }

    BinaryTree(){
        root = null;
    }
    void printPreorder(Node node){
        if (node==null)
            return;

        System.out.print(node.data + " ");
        printPreorder(node.left);
        printPreorder(node.right);
    }
    void printPostorder(Node node){
        if(node==null)
        return;

        printPostorder(node.left);
        printPostorder(node.right);
        System.out.print(node.data + " ");
    }
    void printInorder(Node node){
        if (node == null) {
            return;
        }
        printInorder(node.left);
        System.out.print(node.data + " ");
        printInorder(node.right);
    }

    void printPreorder(){
        printPreorder(root);
    }
    void printPostorder(){
        printPostorder(root);
    }
    void printInorder(){
        printInorder(root);
    }
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);

        tree.root.left = new Node(2);
        tree.root.right = new Node(3);

        tree.root.left.right = new Node(5);
        tree.root.left.left = new Node(4);

        tree.printPreorder();
        System.out.println();
        tree.printPostorder();
        System.out.println();
        tree.printInorder();
        System.out.println();
    }
}