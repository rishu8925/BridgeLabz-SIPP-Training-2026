import java.util.*;

public class KthSmallestBST {


    static class Node{

        int val;
        Node left,right;

        Node(int val){
            this.val=val;
        }
    }


    public static int kthSmallest(Node root,int k){


        Stack<Node> stack = new Stack<>();

        Node current=root;

        int count=0;


        while(current!=null || !stack.isEmpty()){


            while(current!=null){

                stack.push(current);
                current=current.left;
            }


            current=stack.pop();

            count++;


            if(count==k)
                return current.val;


            current=current.right;
        }


        throw new IllegalArgumentException("Invalid k");
    }



    public static void main(String[] args){

        Node root=new Node(50);

        root.left=new Node(30);
        root.right=new Node(70);


        System.out.println(kthSmallest(root,2));
    }
}