package dataStructor.binarytree;

public class AvlTest {
    public static void main(String[]  args){
        BinaryTree firstBinaryTree=new BinaryTree(11);
        firstBinaryTree.insertNode(firstBinaryTree.root,7);
        firstBinaryTree.insertNode(firstBinaryTree.root,13);
        firstBinaryTree.insertNode(firstBinaryTree.root,5);
        firstBinaryTree.insertNode(firstBinaryTree.root,9);
        firstBinaryTree.insertNode(firstBinaryTree.root,12);
        firstBinaryTree.insertNode(firstBinaryTree.root,15);
//        firstBinaryTree.inOrderBinaryTree(firstBinaryTree.root);
//        firstBinaryTree.insertNode(firstBinaryTree.root,8);
//        System.out.println("------------");
//        firstBinaryTree.inOrderBinaryTree(firstBinaryTree.root);
//        System.out.println(firstBinaryTree.findNode(firstBinaryTree.root,11)+"");
        System.out.println(firstBinaryTree.getMaxValueInTree(firstBinaryTree.root)+"");
        System.out.println(firstBinaryTree.getMinValueInTree(firstBinaryTree.root)+"");


    }
}

