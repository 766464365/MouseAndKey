/*
 *While writing this code, only God and I know what it is.
 *And now only God knows it
 *____________________________________by xuwei
 */
package fingerSite.test16;

import java.util.List;

//输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
public class Solution {
    public static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode Merge(ListNode list1,ListNode list2) {
        ListNode nullNode=null;
        if(list1 == null){
            if(list2==null){
                return nullNode;
            }
            else
                return list2;
        }
        else
            if(list2==null){
                if(list1==null)
                    return nullNode;
                else
                    return list1;
            }
            else
            {
                int length1=1,length2=1;
                ListNode temp1=list1,temp2=list2;
                while(temp1.next!=null){
                    length1++;
                    temp1=temp1.next;
                }
                while (temp2.next!=null){
                    length2++;
                    temp2=temp2.next;
                }
                System.out.println(length1);
                System.out.println(length2);
                ListNode tempNode1=new ListNode(0);
                ListNode tempNode2=new ListNode(0);
                tempNode1.next=list1;
                tempNode2.next=list2;
                while(tempNode1.next!=null&&tempNode2.next!=null){
                    if(tempNode1.next.val>tempNode2.next.val){
                        ListNode tidaide=tempNode2.next;
                        tempNode2.next=tempNode2.next.next;
                        tidaide.next=tempNode1.next;
                        tempNode1.next=tidaide;
                    }
                }

                return list1;
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
        solution.Merge(a1,a2);
    }
}
