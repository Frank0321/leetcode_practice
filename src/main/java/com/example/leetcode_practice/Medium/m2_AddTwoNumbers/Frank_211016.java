package com.example.leetcode_practice.Medium.m2_AddTwoNumbers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Frank_211016 {
    public static void main(String[] args) {
        //不是很確定說 l1 的資料場怎樣
        ListNode l1 = new ListNode(3,
                new ListNode(4,
                        new ListNode(2)));
        ListNode l2 = new ListNode(4,
                new ListNode(6,
                        new ListNode(5)));

        addTwoNumbers(l1, l2);

    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2){

        return new ListNode();
    }

    public static int getListNodeVal(ListNode listNode){
        if (listNode == null){
            return 0;
        }else {
            return listNode.val;
        }
    }

    public static ListNode getNextListNode(ListNode listNode){
        if (listNode.next == null){
            return new ListNode();
        }else {
            return listNode.next;
        }
    }






    public static long listNodeToInt(ListNode l){
        long result = l.val;
        long degree = 10;
        while (l.next != null){
            l = l.next;
            result = l.val * degree + result;
            degree = degree * 10;
        }
        return result;
    }

    public static ListNode intToListNode(long num){
        List<Long> list = new ArrayList<>();
        list.add(num%10);
        while (num/10 > 0){
            num = num/10;
            list.add(num%10);
        }
        ListNode result = new ListNode(list.get(list.size()-1).intValue());
        for (int i = list.size()-2; i >=0; i--){
            result = new ListNode(list.get(i).intValue(), result);
        }
        return result;
    }

    //取第一個字
    public static int firstNum(int num){
        while (num/10 >0){
            num /= 10;
        }
        return num;
    }
}


