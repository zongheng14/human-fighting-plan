package com.human.leetcode.top100.addClasses;

/**
 * <>top2的辅助类</>
 *
 * @author shaonan.hu
 * @version V1.0
 * @Time 2020/10/22
 */
public class ListNode {
    int val;
    ListNode next;

    public ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }
}
