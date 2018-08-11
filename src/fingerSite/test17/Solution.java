/*
 *While writing this code, only God and I know what it is.
 *And now only God knows it
 *___________________________by xuwei
 */

package fingerSite.test17;
//输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
public class Solution {
    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        //第一种否的情况，root1或root2中有一棵是空树
        if(root1==null||root2==null){
            return false;
        }
        else{
            if(root1.val==root2.val){
                if(root2.left!=null&&root2.right!=null){
                    return HasSubtree(root1.left, root2.left)&&HasSubtree(root1.right,root2.right);
                }
                else if(root2.left==null&&root2.right!=null){
                    return HasSubtree(root1.right, root2.right);
                }
                else if(root2.left!=null&&root2.right==null){
                    return HasSubtree(root1.left,root2.left);
                }
                else
                    return true;
            }
            else if(root1.left!=null){
                HasSubtree(root1.left,root2);
            }
            else if(root1.right!=null){
                HasSubtree(root1.right,root2);
            }
            else
                return false;
        }
        return false;
    }
    //{8,8,7,9,2,#,#,#,#,4,7},{8,9,2}
    public static void main(String[] args){
        Solution solution=new Solution();
        TreeNode node1=new TreeNode(8);
        TreeNode node2=new TreeNode(8);
        TreeNode node3=new TreeNode(7);
        TreeNode node4=new TreeNode(9);
        TreeNode node5=new TreeNode(2);
        TreeNode node6=new TreeNode(4);
        TreeNode node7=new TreeNode(7);

        TreeNode node8=new TreeNode(8);
        node1.left=node2;
        node1.right=node3;
        node2.left=node4;
        node2.right=node5;
        node5.left=node6;
        node5.right=node7;
        node8.left=new TreeNode(9);
        node8.right=new TreeNode(2);
        System.out.print(solution.HasSubtree(node1,node8));
    }
}
