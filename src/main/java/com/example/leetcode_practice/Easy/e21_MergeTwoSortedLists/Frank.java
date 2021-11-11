package com.example.leetcode_practice.Easy.e21_MergeTwoSortedLists;

/**
 * FileName : Frank
 * CreatTime : 2021/11/1
 * Author : Frank.Chang
 * Description :
 */
public class Frank {
    public static void main(String[] args) {
        // [1,2,4] 放法為正確的
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4)));

        mergeTwoLists(l1, l2);
    }

    /**
     * 位置越左邊，表示越先放入
     */
    private static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode result = null;
        while (l1 != null && l2 != null){
            //需要反過來放置
            if (l2.val > l1.val){
                result = new ListNode(l1.val, result);
                l1 = l1.next;
            }else if (l2.val < l1.val){
                result = new ListNode(l2.val, result);
                l2 = l2.next;
            }else {
                result = new ListNode(l1.val, result);
                result = new ListNode(l2.val, result);
                l1 = l1.next;
                l2 = l2.next;
            }
//            if (l1.val == l2.val){
//                result = new ListNode(l1.val, result);
//                result = new ListNode(l2.val, result);
//                l1 = l1.next;
//                l2 = l2.next;
//            }else if (l2.val > l1.val){
//                result = new ListNode(l1.val, result);
//                l1 = l1.next;
//            }else {
//                result = new ListNode(l2.val, result);
//                l2 = l2.next;
//            }
        }

        return result;
    }
}
