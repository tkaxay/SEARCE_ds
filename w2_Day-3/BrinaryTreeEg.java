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

class BinaryTreeEg {
    Node root;

    BinaryTreeEg(int data){
        root = new Node(data);
    }

    BinaryTreeEg(){
        root = null;
    }
    /*void printPreorder(Node node){
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
    }*/
    void printInorder(Node node){
        if (node == null) {
            return;
        }
        printInorder(node.left);
        System.out.print(node.data + " ");
        printInorder(node.right);
    }

    private Node addRecursive(Node node,int data){
        if(node == null)
        return new Node(data);

        if (node.data > data) {
            node.left = addRecursive(node.left, data);            
        }else if (node.data < data) {
            node.right = addRecursive(node.right, data);
        }else{
            return node;
        }
        return node;
    }

    /*void printPreorder(){
        printPreorder(root);
    }
    void printPostorder(){
        printPostorder(root);
    }*/
    void add(int data){
        root = addRecursive(root, data);
    }
    void printInorder(){
        printInorder(root);
    }
    public static void main(String[] args) {
        BinaryTreeEg tree = new BinaryTreeEg();
        /*tree.root = new Node(1);

        tree.root.left = new Node(2);
        tree.root.right = new Node(3);

        tree.root.left.right = new Node(5);
        tree.root.left.left = new Node(4);

        tree.printPreorder();
        System.out.println();
        tree.printPostorder();
        System.out.println();*/
        tree.add(1);
        tree.add(2);
        tree.add(3);
        tree.add(4);
        tree.add(5);
        tree.add(10);
        tree.add(21);
        tree.add(34);
        tree.add(44);
        tree.add(10);

        tree.printInorder();
        System.out.println();
    }
}
