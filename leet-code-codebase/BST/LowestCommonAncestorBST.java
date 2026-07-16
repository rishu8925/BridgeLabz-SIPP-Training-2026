public class LowestCommonAncestorBST {


    static class Node{

        int val;
        Node left,right;

        Node(int val){
            this.val=val;
        }
    }



    public static Node lowestCommonAncestor(
            Node root,int p,int q){


        Node current=root;


        while(current!=null){


            if(p < current.val && q < current.val){

                current=current.left;
            }


            else if(p > current.val && q > current.val){

                current=current.right;
            }


            else{

                return current;
            }
        }


        return null;
    }



    public static void main(String[] args){

        Node root=new Node(50);

        root.left=new Node(30);
        root.right=new Node(70);

        Node ans=lowestCommonAncestor(root,30,70);


        System.out.println("LCA : "+ans.val);
    }
}