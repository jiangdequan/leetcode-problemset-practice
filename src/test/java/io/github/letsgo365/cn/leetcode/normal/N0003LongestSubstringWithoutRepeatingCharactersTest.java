package io.github.letsgo365.cn.leetcode.normal;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class N0003LongestSubstringWithoutRepeatingCharactersTest {


    private N0003LongestSubstringWithoutRepeatingCharacters n0003LongestSubstringWithoutRepeatingCharacters;

    @BeforeEach
    public void init() {
        this.n0003LongestSubstringWithoutRepeatingCharacters = new N0003LongestSubstringWithoutRepeatingCharacters();
    }

    @Test
    public void case1() {
        int len = n0003LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("abcabcbb");
        Assertions.assertEquals(3, len);
    }

    @Test
    public void case2() {
        int len = n0003LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("bbbbb");
        Assertions.assertEquals(1, len);
    }

    @Test
    public void case3() {
        int len = n0003LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("pwwkew");
        Assertions.assertEquals(3, len);
    }

    @Test
    public void case4() {
        int len = n0003LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(" ");
        Assertions.assertEquals(1, len);
    }

    @Test
    public void case5() {
        int len = n0003LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("au");
        Assertions.assertEquals(2, len);
    }
}
