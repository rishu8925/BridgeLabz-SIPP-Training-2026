public class DeleteBST {

    static class Node {

        int val;
        Node left,right;

        Node(int val){
            this.val = val;
        }
    }


    public static Node delete(Node root,int value){

        if(root == null)
            return null;


        if(value < root.val)
            root.left = delete(root.left,value);

        else if(value > root.val)
            root.right = delete(root.right,value);


        else {

            // no child
            if(root.left == null && root.right == null)
                return null;


            // one child
            if(root.left == null)
                return root.right;

            if(root.right == null)
                return root.left;



            // two children
            Node successor = root.right;

            while(successor.left != null)
                successor = successor.left;


            root.val = successor.val;

            root.right = delete(root.right, successor.val);
        }


        return root;
    }


    public static void main(String[] args){

        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);
        root.left.left = new Node(20);


        root = delete(root,30);

        System.out.println("Deleted Successfully");
    }
}