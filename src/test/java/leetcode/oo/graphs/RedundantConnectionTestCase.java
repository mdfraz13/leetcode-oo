package leetcode.oo.graphs;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class RedundantConnectionTestCase {

    private ReduntantConnection alg;

    /**
     * Init.
     */
    @Before
    public void init(){
        this.alg = new ReduntantConnection();
    }

    @Test
    public void test(){
        Assert.assertArrayEquals(
            new int[]{2,3},
            this.alg.findRedundantConnection(
                new int[][]{
                    {1, 2},
                    {1, 3},
                    {2, 3}
                }
            )
        );
    }
}
