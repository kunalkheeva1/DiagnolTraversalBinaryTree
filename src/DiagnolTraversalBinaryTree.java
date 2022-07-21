import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DiagnolTraversalBinaryTree {

    //node
    class Node{
        int data;
        Node left;
        Node right;
        Node(int data, Node left, Node right){
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }
    //list of the diagonal elements data
    static List<Integer> diagonalTraversalBinaryTree(Node root){
        ArrayList<Integer> ans = new ArrayList<>();
        if(root == null) return ans;

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        // traverse the queue and take off the node
        while(!q.isEmpty()){
            Node current = q.remove();
            // pointer continues until it reaches the end on the right side
            while(current != null){


                // add the left node in the queue(if any) and then repeat the process
                if(current.left != null){
                    q.add(current.left);
                }
                //move your current to right
                current = current.right;
                // add the data of your current in the list to return it
                ans.add(current.data);
            }
        }return ans;







    }
    public static void main(String[] args) {

    }
}
