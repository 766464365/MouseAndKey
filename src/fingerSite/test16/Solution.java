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
//    public ListNode MergeByViolence(ListNode list1,ListNode list2) {
//
//        ListNode nullNode=null;
//        if(list1 == null){
//            if(list2==null){
//                return nullNode;
//            }
//            else
//                return list2;
//        }
//        else
//            if(list2==null){
//                if(list1==null)
//                    return nullNode;
//                else
//                    return list1;
//            }
//            else
//            {
//                int length1=1,length2=1;
//                ListNode temp1=list1,temp2=list2;
//                while(temp1.next!=null){
//                    length1++;
//                    temp1=temp1.next;
//                }
//                while (temp2.next!=null){
//                    length2++;
//                    temp2=temp2.next;
//                }
////                System.out.println(length1);
////                System.out.println(length2);
//                ListNode tempNode1=new ListNode(0);
//                ListNode tempNode2=new ListNode(0);
//                ListNode returnNode=new ListNode(0);
//                tempNode1.next=list1;
//                tempNode2.next=list2;
//                ListNode index=null;
//                ListNode bianlide=index;
//                returnNode=bianlide;
//                returnNode=index;
//                while(tempNode1.next!=null&&tempNode2.next!=null){
//                    while(bianlide!=null){
//                        index=bianlide;
//                        bianlide=bianlide.next;
//                    }       //找到了return的最后一个结点
//                    if(tempNode1.next.val>=tempNode2.next.val){
//                        index.next=new ListNode(tempNode2.next.val);
//                        tempNode2=tempNode2.next;
//                    }
//                    else
//                    {
//                        index.next=new ListNode(tempNode1.next.val);
//                        tempNode1=tempNode1.next;
//                    }
//                }
//                if(tempNode1.next!=null&&tempNode2.next==null){
//                    while(tempNode1.next!=null){
//                        index.next=new ListNode(tempNode1.next.val);
//                        tempNode1=tempNode1.next;
//                    }
//                }
//                else
//                {
//                    while(tempNode2.next!=null){
//                        index.next=new ListNode(tempNode2.next.val);
//                        tempNode2=tempNode2.next;
//                    }
//                }
//
//                return returnNode;
//            }
//
//    }
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
//                System.out.println(length1);
//                System.out.println(length2);
            int totalLength=length1+length2;
            int[] array=new int[totalLength];
            ListNode first=new ListNode(0),second=new ListNode(0);
            first.next=list1;
            second.next=list2;
            for(int i=0;i<totalLength;i++){
                if(first.next!=null&&second.next!=null){
                    if(first.next.val>second.next.val){
                        array[i]=second.next.val;
                        second=second.next;
                    }
                    else
                    {
                        array[i]=first.next.val;
                        first=first.next;
                    }
                }
                else if(first.next==null&&second.next!=null){
                    array[i]=second.next.val;
                    second=second.next;
                }
                else {
                    array[i]=first.next.val;
                    first=first.next;
                }
            }
            ListNode result=new ListNode(0);
            ListNode bianlide=result;
            for (int j=0;j<totalLength;j++){
                result.next=new ListNode(array[j]);
                result=result.next;
            }

            return bianlide.next;
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
        System.out.print(solution.Merge(a1,a2).val);
    }
}
