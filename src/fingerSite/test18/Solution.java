/*
 *While writing this code, only God and I know what it is.
 *And now only God knows it
 *____________________________________by xuwei
 */
package fingerSite.test18;

//操作给定的二叉树，将其变换为源二叉树的镜像。
public class Solution
{
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }
    public void Mirror(TreeNode root) {
        if(root!=null) {
            if (root.left != null && root.right != null) {
                TreeNode temp = root.right;
                root.right = root.left;
                root.left = temp;
                Mirror(root.left);
                Mirror(root.right);
            } else if (root.left != null && root.right == null) {
                root.right = root.left;
                root.left = null;
                Mirror(root.right);
            } else if (root.left == null && root.right != null) {
                root.left = root.right;
                root.right = null;
                Mirror(root.left);
            }
        }
    }

    public static void main(String[] args){

    }
}
