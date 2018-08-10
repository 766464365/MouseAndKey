/*
 *While writing this code, only God and I know what it is.
 *And now only God knows it
 *____________________________________by xuwei
 */
package fingerSite.commontest;

import java.util.List;

//链表反转
public class ListReversal {
    public static class ListNode {
        int val;
        ListNode next = null;
        ListNode(int val) {
            this.val = val;
        }
    }

    public static ListNode listReversal(ListNode listNode){
        ListNode listOrigin=new ListNode(0);
        listOrigin.next=listNode;
        ListNode newList=new ListNode(0);
        while(listOrigin.next!=null){
            ListNode tempNode=listOrigin.next.next;
            newList.next=tempNode;
            listOrigin.next.next=null;
            listOrigin=tempNode;
        }
        return newList.next;
    }


    public static void main(String[] args){
        ListNode listNode1=new ListNode(1);
        ListNode listNode2=new ListNode(2);
        ListNode listNode3=new ListNode(3);
        ListNode listNode4=new ListNode(4);
        ListNode listNode5=new ListNode(5);
        listNode1.next=listNode2;
        listNode2.next=listNode3;
        listNode3.next=listNode4;
        listNode4.next=listNode5;
        System.out.println(listReversal(listNode1).val);
    }
}
