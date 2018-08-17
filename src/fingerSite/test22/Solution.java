/*
 *While writing this code, only God and I know what it is.
 *And now only God knows it
 *___________________________by xuwei
 */

package fingerSite.test22;

import java.io.PrintStream;
import java.util.ArrayList;

//从上往下打印出二叉树的每个节点，同层节点从左至右打印。
public class Solution {
    ArrayList<Integer> newList=new ArrayList<>();
    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {

        if(root!=null){
            newList.add(root.val);
        }
        if(root.left!=null&&root.right!=null){
            PrintFromTopToBottom(root.left);
            PrintFromTopToBottom(root.right);
        }
        else if(root.left!=null&&root.right==null){
            PrintFromTopToBottom(root.left);
        }
        else if(root.left==null&&root.right!=null){

            PrintFromTopToBottom(root.right);
        }
        return newList;
    }
    public static void main(String[] args){
        TreeNode t1=new TreeNode(1);
        t1.left=new TreeNode(2);
        t1.right=new TreeNode(3);
        Solution solution=new Solution();
        ArrayList<Integer> a=solution.PrintFromTopToBottom(t1);
        int a11=1;
    }
}
