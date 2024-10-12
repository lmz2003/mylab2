import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class L2022211870_7_Test {

    /**
     * 测试用例设计总体原则：
     * 1. 等价类划分：考虑正常输入、边界情况和特殊输入。
     * 2. 边界条件：测试字符串长度为 1、2、最大值等情况。
     * 3. 特殊情况：处理没有可交换对、所有字符相同等情况。
     */

    @Test
    public void testSmallestStringWithSwaps() {
        Solution7 solution = new Solution7();

        // 测试用例 1: 正常情况
        String s1 = "dcab";
        List<List<Integer>> pairs1 = Arrays.asList(Arrays.asList(0, 3), Arrays.asList(1, 2));
        assertEquals("bacd", solution.smallestStringWithSwaps(s1, pairs1));

        // 测试用例 2: 多次交换
        String s2 = "dcab";
        List<List<Integer>> pairs2 = Arrays.asList(Arrays.asList(0, 3), Arrays.asList(1, 2), Arrays.asList(0, 2));
        assertEquals("abcd", solution.smallestStringWithSwaps(s2, pairs2));

        // 测试用例 3: 所有字符相同
        String s3 = "aaaa";
        List<List<Integer>> pairs3 = Arrays.asList(Arrays.asList(0, 1), Arrays.asList(1, 2));
        assertEquals("aaaa", solution.smallestStringWithSwaps(s3, pairs3));

        // 测试用例 4: 没有可交换对
        String s4 = "dcab";
        List<List<Integer>> pairs4 = Arrays.asList();
        assertEquals("dcab", solution.smallestStringWithSwaps(s4, pairs4));

        // 测试用例 5: 边界条件，字符串长度为 1
        String s5 = "a";
        List<List<Integer>> pairs5 = Arrays.asList();
        assertEquals("a", solution.smallestStringWithSwaps(s5, pairs5));

        // 测试用例 6: 边界条件，字符串长度为 2
        String s6 = "ab";
        List<List<Integer>> pairs6 = Arrays.asList(Arrays.asList(0, 1));
        assertEquals("ab", solution.smallestStringWithSwaps(s6, pairs6));
    }
}
