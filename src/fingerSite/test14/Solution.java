/*
 *While writing this code, only God and I know what it is.
 *And now only God knows it
 *____________________________________by xuwei
 */
package fingerSite.test14;
//输入一个链表，输出该链表中倒数第k个结点。

//思路应该没什么问题  但是跑起来的时候ac不过  报的测试用例看不懂。
/*
测试用例:
100,{}

对应输出应该为:

{}

你的输出为:

java.lang.NullPointerException
 */
public class Solution {
    public ListNode FindKthToTail(ListNode head,int k) {
        int length=1;
        ListNode indexNode=head;
        while(indexNode.next!=null){
            indexNode=indexNode.next;
            length++;
        }
        ListNode temp=null;
        if(k>length){
            return null;
        }
        else {
            for (int i = 0; i < length - k + 1; i++) {
                temp = head;
                if (head.next != null) {
                    head = head.next;
                }
            }
            return temp;
        }

    }
    public static void main(String[] args){
        ListNode a1=new ListNode(1);
        ListNode a2=new ListNode(2);
        ListNode a3=new ListNode(3);
        ListNode a4=new ListNode(4);
        a1.next=a2;
        a2.next=a3;
        a3.next=a4;
        Solution solution=new Solution();
        System.out.println(solution.FindKthToTail(a1,4).val);
    }


    public static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
}

