package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Subset {
    static List<List<Integer>> arr;

    public static List<List<Integer>> subset(int[] nums) {
        arr = new ArrayList<>();
        helper(nums, 0, new ArrayList<>());
        return arr;
    }

    public static void helper(int[] nums, int i, ArrayList<Integer> ans) {
        if (i == nums.length) {
            arr.add(new ArrayList<>(ans));
            return;
        }
        helper(nums, i + 1, ans);
        ans.add(nums[i]);
        helper(nums, i + 1, ans);
        ans.remove(ans.size() - 1);
    }

    public static void main(String[] args) {
        int nums[] = {1, 2, 3};
        List<List<Integer>> temp = subset(nums);
        System.out.println(temp);
    }
}
