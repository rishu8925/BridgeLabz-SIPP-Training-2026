public class InsertBST {

    static class Node {

        int val;
        Node left, right;

        Node(int val) {
            this.val = val;
        }
    }


    public static Node insert(Node node, int id) {

        if (node == null)
            return new Node(id);


        if (id < node.val)
            node.left = insert(node.left, id);

        else if (id > node.val)
            node.right = insert(node.right, id);


        return node;
    }


    public static void inorder(Node root) {

        if(root == null)
            return;

        inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right);
    }


    public static void main(String[] args) {

        Node root = null;

        int[] ids = {50,30,70,20,40};

        for(int id: ids)
            root = insert(root,id);


        inorder(root);
    }
}