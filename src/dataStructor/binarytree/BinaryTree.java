package dataStructor.binarytree;


public class BinaryTree {
    public AvlNode root=null;
    public BinaryTree(int rootData){
        root=new AvlNode(rootData);
        root.leftChildNode=null;
        root.rightChildNode=null;
    }
    /**
     * Insert node.
     *
     * 插入结点
     * @param rootNode the top node 二叉搜索树的最高结点
     * @param newNodeData the new node 待插入的结点值
     */
    public void insertNode(AvlNode rootNode,int newNodeData){
        if(rootNode.data!=newNodeData){
            //结点值不相同 为不重复元素 可以插入
            if(newNodeData>rootNode.data){
                //如果节点值大于插入节点值，则进入下一轮迭代
                if(rootNode.rightChildNode!=null) {
                    insertNode(rootNode.rightChildNode, newNodeData);
                }
                else {
                    AvlNode newAvlNode=new AvlNode(newNodeData);
                    newAvlNode.parentNode=rootNode;
                    rootNode.rightChildNode = newAvlNode;
                }
            }
            else
                if(newNodeData<rootNode.data){
                    if(rootNode.leftChildNode!=null){
                        insertNode(rootNode.leftChildNode,newNodeData);
                    }
                    else
                    {
                        AvlNode newAvlNode=new AvlNode(newNodeData);
                        newAvlNode.parentNode=rootNode;
                        rootNode.leftChildNode = newAvlNode;
                    }
            }
        }
        else
            System.out.println("二叉搜索树中已存在相同的结点");
    }

    /**
     * Find node boolean.
     *
     * 1,2,4,7,3,5,6,8}
     ,7,2,1,5,3,8,6
     * 二叉搜索树中查找指定节点值
     * @param rootNode    the root 目标二叉搜索树的根节点
     * @param targetValue the target 待查找节点值
     * @return the boolean
     */
    public boolean findNode(AvlNode rootNode,int targetValue){
        if(rootNode.data!=targetValue){
            if(targetValue>rootNode.data){
                if(rootNode.rightChildNode!=null){
                    return findNode(rootNode.rightChildNode,targetValue);
                }
                else
                    return false;
            }
            else if(targetValue<rootNode.data){
                if (rootNode.leftChildNode!=null){
                    return findNode(rootNode.leftChildNode,targetValue);
                }
                else {
                    return false;
                }
            }
            else
                return false;
        }
        else
            return true;
    }

    /**
     * In sort binary tree.
     *
     * 中序遍历二叉搜索树
     * @param rootNode the binary tree   目标二叉搜索树根节点
     */
    public void inOrderBinaryTree(AvlNode rootNode){
       if(rootNode.leftChildNode!=null){
           inOrderBinaryTree(rootNode.leftChildNode);
       }
       System.out.println("“"+rootNode.data+"”");
       if (rootNode.rightChildNode!=null){
           inOrderBinaryTree(rootNode.rightChildNode);
       }
    }

    /**
     * First sort binary tree.
     *
     * 前序遍历
     * @param rootNode the root node
     */
    public void firstOrderBinaryTree(AvlNode rootNode){
        System.out.println("“"+rootNode.data+"”");
        if(rootNode.leftChildNode!=null){
            inOrderBinaryTree(rootNode.leftChildNode);
        }
        if (rootNode.rightChildNode!=null){
            inOrderBinaryTree(rootNode.rightChildNode);
        }
    }

    /**
     * Last sort binary tree.
     *
     * 后序遍历
     * @param rootNode the root node
     */
    public void lastOrderBinaryTree(AvlNode rootNode){
        if(rootNode.leftChildNode!=null){
            inOrderBinaryTree(rootNode.leftChildNode);
        }
        if (rootNode.rightChildNode!=null){
            inOrderBinaryTree(rootNode.rightChildNode);
        }
        System.out.println("“"+rootNode.data+"”");
    }

    /**
     * Get max value in tree.
     *
     * 获取搜索树中的最大值
     * @param rootNode the root node
     */
    public int getMaxValueInTree(AvlNode rootNode){
        if(rootNode.rightChildNode!=null){
            return getMaxValueInTree(rootNode.rightChildNode);
        }
        else
            return rootNode.data;
    }

    /**
     * Get min value in tree int.
     *
     * 返回二叉搜索树中的最小值
     * @param rootNode the root node
     * @return the int
     */
    public int getMinValueInTree(AvlNode rootNode){
        if(rootNode.leftChildNode!=null){
            return getMinValueInTree(rootNode.leftChildNode);
        }
        else
            return rootNode.data;
    }
}
