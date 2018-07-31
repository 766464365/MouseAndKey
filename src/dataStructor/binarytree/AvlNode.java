package dataStructor.binarytree;

public class AvlNode {
    public int data;
    public int depth;
    public int balance;
    public AvlNode parentNode;
    public AvlNode leftChildNode;
    public AvlNode rightChildNode;

    /**
     * Instantiates a new Avl node.
     *
     * 构造函数
     * @param data the data
     */
    public AvlNode(int data){
        this.data=data;
        this.depth=0;
        this.balance=0;
        this.parentNode=null;
        this.leftChildNode=null;
        this.rightChildNode=null;
    }









}
