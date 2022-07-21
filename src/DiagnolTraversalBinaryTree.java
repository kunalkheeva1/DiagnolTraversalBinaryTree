import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DiagnolTraversalBinaryTree {

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
    static List<Integer> diagonalTraversalBinaryTree(Node root){
        ArrayList<Integer> ans = new ArrayList<>();
        if(root == null) return ans;

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node current = q.remove();
            while(current != null){

                if(current.left != null){
                    q.add(current.left);
                }

                current = current.right;
                ans.add(current.data);
            }
        }return ans;







    }
    public static void main(String[] args) {

    }
}
