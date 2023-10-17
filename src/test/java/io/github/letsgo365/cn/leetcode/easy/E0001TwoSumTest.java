package io.github.letsgo365.cn.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * <a href="https://leetcode.cn/problems/two-sum/">题目链接：https://leetcode.cn/problems/two-sum/</a>
 *
 * <p>给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
 * <p>你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 * <p>你可以按任意顺序返回答案。
 *
 * <p>
 * 示例 1：
 * <p>
 * 输入：nums = [2,7,11,15], target = 9
 * 输出：[0,1]
 * 解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
 * <p>
 * 示例 2：
 * <p>
 * 输入：nums = [3,2,4], target = 6
 * 输出：[1,2]
 * <p>
 * 示例 3：
 * <p>
 * 输入：nums = [3,3], target = 6
 * 输出：[0,1]
 */
public class E0001TwoSumTest {

    private E0001TwoSum e0001TwoSum;

    @BeforeEach
    public void init() {
        this.e0001TwoSum = new E0001TwoSum();
    }

    @Test
    public void case1() {
        int[] ints = e0001TwoSum.twoSum(new int[]{2, 7, 11, 15}, 9);
        Assertions.assertEquals(0, ints[0]);
        Assertions.assertEquals(1, ints[1]);
    }

    @Test
    public void case2() {
        int[] ints = e0001TwoSum.twoSum(new int[]{3, 2, 4}, 6);
        Assertions.assertEquals(1, ints[0]);
        Assertions.assertEquals(2, ints[1]);
    }

    @Test
    public void case3() {
        int[] ints = e0001TwoSum.twoSum(new int[]{3, 3}, 6);
        Assertions.assertEquals(0, ints[0]);
        Assertions.assertEquals(1, ints[1]);
    }
}
