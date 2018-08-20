/*
 *While writing this code, only God and I know what it is.
 *And now only God knows it
 *___________________________by xuwei
 */

package fingerSite.test22;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

//从上往下打印出二叉树的每个节点，同层节点从左至右打印。
public class Solution {
    ArrayList<Integer> newList=new ArrayList<>();
    Queue<TreeNode> queue=new ArrayDeque<>();
    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        if(root!=null) {
            queue.add(root);
        }
        while(!queue.isEmpty()){
            if(queue.peek().left!=null){
                queue.add(queue.peek().left);
            }
            if (queue.peek().right!=null){
                queue.add(queue.peek().right);
            }
            newList.add(queue.remove().val);
        }
        return newList;
    }
    public static void main(String[] args){
        TreeNode t1=new TreeNode(1);
        t1.left=new TreeNode(2);
        t1.right=new TreeNode(3);
        t1.left.left=new TreeNode(4);
        t1.left.right=new TreeNode(5);
        t1.right.left=new TreeNode(6);
        t1.right.right=new TreeNode(7);
        Solution solution=new Solution();
        ArrayList<Integer> a=solution.PrintFromTopToBottom(t1);
        int a11=1;
    }
}
