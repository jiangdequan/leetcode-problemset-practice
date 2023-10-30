package io.github.letsgo365.cn.leetcode.normal;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class N0002AddTwoNumbersTest {


    private N0002AddTwoNumbers n0002AddTwoNumbers;

    @BeforeEach
    public void init() {
        this.n0002AddTwoNumbers = new N0002AddTwoNumbers();
    }

    /**
     * 示例 1：
     * 输入：l1 = [2,4,3], l2 = [5,6,4]
     * 输出：[7,0,8]
     * 解释：342 + 465 = 807.
     */
    @Test
    public void case1() {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode listNode = n0002AddTwoNumbers.addTwoNumbers(l1, l2);

        Assertions.assertEquals(7, listNode.val);
        Assertions.assertEquals(0, listNode.next.val);
        Assertions.assertEquals(8, listNode.next.next.val);
    }

    /**
     * 示例 2：
     * 输入：l1 = [0], l2 = [0]
     * 输出：[0]
     */
    @Test
    public void case2() {
        ListNode l1 = new ListNode(0);

        ListNode l2 = new ListNode(0);

        ListNode listNode = n0002AddTwoNumbers.addTwoNumbers(l1, l2);

        Assertions.assertEquals(0, listNode.val);
    }

    /**
     * 示例 3：
     * 输入：l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
     * 输出：[8,9,9,9,0,0,0,1]
     */
    @Test
    public void case3() {
        ListNode l1 = new ListNode(9);
        l1.next = new ListNode(9);
        l1.next.next = new ListNode(9);
        l1.next.next.next = new ListNode(9);
        l1.next.next.next.next = new ListNode(9);
        l1.next.next.next.next.next = new ListNode(9);
        l1.next.next.next.next.next.next = new ListNode(9);

        ListNode l2 = new ListNode(9);
        l2.next = new ListNode(9);
        l2.next.next = new ListNode(9);
        l2.next.next.next = new ListNode(9);

        ListNode listNode = n0002AddTwoNumbers.addTwoNumbers(l1, l2);

        Assertions.assertEquals(8, listNode.val);
        Assertions.assertEquals(9, listNode.next.val);
        Assertions.assertEquals(9, listNode.next.next.val);
        Assertions.assertEquals(9, listNode.next.next.next.val);
        Assertions.assertEquals(0, listNode.next.next.next.next.val);
        Assertions.assertEquals(0, listNode.next.next.next.next.next.val);
        Assertions.assertEquals(0, listNode.next.next.next.next.next.next.val);
        Assertions.assertEquals(1, listNode.next.next.next.next.next.next.next.val);
    }
}
