package com.example.leetcode_practice.Easy.e2_AddTwoNumbers;

/**
 * FileName : Frank_220111
 * CreatTime : 2022/1/11
 * Author : Frank.Chang
 * Description : ListNode 介紹參考 : https://daniel820710.medium.com/leetcode-link-list-%E4%BB%8B%E7%B4%B9-6d6dfe14a53b
 *
 * ListNode 為節點的概念
 * val 為第一個數字
 * next 為下一個節點
 * 也就是說 [2,4,3] => new ListNode(2, new ListNode(4, new ListNode(3,)));
 */
public class Frank_220111 {
    public static void main(String[] args) {
        // case 1
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        // case 2
//        ListNode l1 = new ListNode(9, new ListNode(9, new ListNode(9)));
//        ListNode l2 = new ListNode(9, new ListNode(9));
        // case 3
//        ListNode l1 = new ListNode(0);
//        ListNode l2 = new ListNode(0);
        ListNode result = addTwoNumber(l1, l2);
        System.out.println("=============");
        System.out.println(printListNode(result));
    }

    private static String printListNode(ListNode l) {
        String result = "";
        while (l != null){
            result += l.val;
            l = l.next;
        }
        return result;
    }

    private static ListNode addTwoNumber(ListNode l1, ListNode l2) {
        int teen = 0;
        StringBuilder sb = new StringBuilder();
        while (l1.val != 0 || l2.val != 0 || l1.next != null || l2.next != null || teen !=0){
            int x = l1 == null ? 0 : l1.val;
            int y = l2 == null ? 0 : l2.val;
            sb.append((x + y + teen) % 10);
            l1 = l1.next == null ? new ListNode() : l1.next;
            l2 = l2.next == null ? new ListNode() : l2.next;
            teen = (x + y + teen) / 10;
        }
        System.out.print("sb is : ");
        System.out.println(sb.toString());

        return stringToListNode(sb);
    }

    private static ListNode stringToListNode(StringBuilder sb) {
        if (sb.length() == 0){
            return new ListNode();
        }
        sb.reverse();
        ListNode result = new ListNode();
        result.val = Integer.parseInt(sb.substring(0, 1));
        for (int i = 1; i < sb.length(); i++) {
            result = new ListNode(Integer.parseInt(sb.substring(i, i+1)), result);
        }
        return result;
    }

}
