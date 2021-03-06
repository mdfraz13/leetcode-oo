package leetcode.oo.dp;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public final class WordBreakTestCase {

    private WordBreak alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new WordBreak();
    }

    @Test
    public void test() {
        Assert.assertTrue(this.alg.wordBreak("cars", Arrays.asList("car","ca","rs")));
        Assert.assertTrue(this.alg.wordBreak("fastracecar", Arrays.asList("astra","fast","race","car")));
        Assert.assertTrue(this.alg.wordBreak("leetcode", Arrays.asList("leet","code")));
        Assert.assertFalse(this.alg.wordBreak("catsandog", Arrays.asList("cats", "dog", "sand", "and", "cat")));
    }
}
