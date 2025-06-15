package arrays;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Given an integer array nums and an integer k, return the k most frequent elements within the array.
 * The test cases are generated such that the answer is always unique.
 *
 * You may return the output in any order.
 * Example 1:
 * Input: nums = [1,2,2,3,3,3], k = 2
 * Output: [2,3]
 */
public class TopKFrequentElements {
    public static void main(String[] args) {
        int[] nums = {5,5,5,1,1,1,1,2,3,3,3,4,4};
        int k = 2;

        int[] result = getTopKFrequentElements(nums, k);
        System.out.println(Arrays.toString(result));
        int[] result1 = getTopKFrequentElementsByStreams(nums, k);

        System.out.println(Arrays.toString(result1));
    }

    private static int[] getTopKFrequentElements(int[] nums, int k) {
        //Step1. count the frequency of each element
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for(int i: nums) {
            frequencyMap.put(i, frequencyMap.getOrDefault(i, 0) +1);
        }

        Comparator<Integer> valueComparator = Comparator.comparingInt(frequencyMap::get);
        Comparator<Integer> reversed = valueComparator.reversed();
        //Step 2: Use priority queue to find the top k elements
//        PriorityQueue<Integer> heap = new PriorityQueue<>((n1, n2) -> frequencyMap.get(n1) - frequencyMap.get(n2));
        PriorityQueue<Integer> heap = new PriorityQueue<>(valueComparator);
//        PriorityQueue<Integer> heap = new PriorityQueue<>(valueComparator.reversed());
//        PriorityQueue<Integer> heap = new PriorityQueue<>(Comparator.<Integer>comparingInt(frequencyMap::get).reversed());


        for(int i:frequencyMap.keySet()) {
            heap.add(i);
            if (heap.size() > k) {
                heap.poll(); // Remove the element with the lowest frequency
            }
        }

        //Step 3: collect the results
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = heap.poll();
        }
        return  result;
    }

    private static int[] getTopKFrequentElementsByStreams(int[] nums, int k) {
        return IntStream.of(nums)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .sorted((e1,e2) -> e2.getValue().compareTo(e1.getValue()) )
                .limit(k)
                .mapToInt(Map.Entry::getKey)
                .toArray();
    }
}
