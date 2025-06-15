package trees;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public static void main(String[] args) {
        int[] numbs = {1,2,3};

        List<List<Integer>> subSets = subSets(numbs);
        System.out.println(subSets);
    }

    private static List<List<Integer>> subSets(int[] nums) {
        List<List<Integer>> response = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();

        dfs(nums, 0, response, subset);
        return response;
    }

    private static void dfs(int[] nums, int i, List<List<Integer>> response, List<Integer> subset) {
        System.out.println("i: "+i);
        if(i >= nums.length) {
            response.add(new ArrayList<>(subset));
            System.out.println("Response: "+response);
            return;
        }

        subset.add(nums[i]);
        System.out.println("Subset: AfterAdd : "+subset);
        dfs(nums, i +1, response, subset);

        subset.remove(subset.size() - 1);
        System.out.println("Subset: AfterRemove : "+subset);
        dfs(nums, i + 1, response, subset);
    }
}
