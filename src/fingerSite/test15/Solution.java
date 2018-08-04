/*
 *While writing this code, only God and I know what it is.
 *And now only God knows it
 *____________________________________by xuwei
 */
package fingerSite.test15;
//输入一个链表，反转链表后，输出新链表的表头。
public class Solution {
    public static class ListNode {
        int val;
        ListNode next = null;
        ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode ReverseList(ListNode head) {
        ListNode temp=head;
        ListNode nullNode=null;
        if(head!=null) {
            int length = 1;
            while (temp.next != null) {
                length++;
                temp = temp.next;
            }
            temp = head;      //恢复
            int[] tempArray = new int[length];
            int tempIndex = 0;
            while (temp != null) {
                tempArray[tempIndex] = temp.val;
                tempIndex++;
                temp = temp.next;
            }
                ListNode tempNode = new ListNode(tempArray[length - 1]);
                ListNode test = tempNode;
                for (int i = length - 2; i >= 0; i--) {
                    if (tempNode.next != null) {
                        tempNode = tempNode.next;
                    }
                    ListNode node = new ListNode(tempArray[i]);
                    tempNode.next = node;
                }
                return test;
        }
        else
            return nullNode;
    }

    public static void main(String[] args){
        Solution solution=new Solution();
        ListNode a1=new ListNode(1);
        ListNode a2=new ListNode(2);
        ListNode a3=new ListNode(3);
        ListNode a4=new ListNode(4);
        a1.next=a2;
        a2.next=a3;
        a3.next=a4;

        System.out.println(solution.ReverseList(a1).val);
    }
}
