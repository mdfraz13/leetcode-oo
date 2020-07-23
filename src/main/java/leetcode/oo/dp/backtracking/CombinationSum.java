package leetcode.oo.dp.backtracking;

import java.util.ArrayList;
import java.util.List;

final class CombinationSum {

    List<List<Integer>> combinationSum(int[] candidates, int target) {
        final List<List<Integer>> combinations = new ArrayList<>();
        this.combinations(candidates, target, 0, new ArrayList<>(), combinations);
        return combinations;
    }

    private void combinations(final int[] candidates, final int target, final int position, final ArrayList<Integer> sum, final List<List<Integer>> combinations) {
        if (target < 0) {
            return;
        }
        if (target == 0) {
            combinations.add(new ArrayList<>(sum));
            return;
        }
        for (int i = position; i < candidates.length; i++) {
            sum.add(candidates[i]);
            this.combinations(candidates, target - candidates[i], i, sum, combinations);
            sum.remove(sum.size() - 1);
        }
    }
}
