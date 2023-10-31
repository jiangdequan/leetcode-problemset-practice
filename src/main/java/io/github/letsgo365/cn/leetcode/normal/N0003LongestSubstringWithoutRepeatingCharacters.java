package io.github.letsgo365.cn.leetcode.normal;

import java.util.HashSet;
import java.util.Set;

/**
 * 给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。
 * <p>
 * <p>
 * <p>
 * 示例 1:
 * <p>
 * 输入: s = "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 * 示例 2:
 * <p>
 * 输入: s = "bbbbb"
 * 输出: 1
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 * 示例 3:
 * <p>
 * 输入: s = "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 * 请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 * <p>
 * <p>
 * 提示：
 * <p>
 * 0 <= s.length <= 5 * 104
 * s 由英文字母、数字、符号和空格组成
 */
public class N0003LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int len = 0;
        char[] chars = s.toCharArray();
        if (chars.length == 1) {
            return 1;
        }
        int index = 0;
        Set<Character> characterSet = new HashSet<>();
        while (len < (chars.length - index)) {
            for (int i = index; i < chars.length; i++) {
                if (characterSet.contains(chars[i])) {
                    len = Math.max(len, (i - index));
                    characterSet.clear();
                    index++;
                    break;
                }
                characterSet.add(chars[i]);
                if (i == chars.length -1) {
                    index++;
                    len = characterSet.size();
                }
            }
        }
        return len;
    }
}
