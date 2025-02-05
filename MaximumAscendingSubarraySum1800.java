
import java.util.ArrayList;

class MaximumAscendingSubarraySum1800 {
    
    public int maxAscendingSum(int[] nums) {
        ArrayList<Integer> max = new ArrayList<>();
        
        int maxSum = 0;
        int sequence = 0;
        
        for(int i = 0; i < nums.length; i++) {
            int current_val = nums[i];

            sequence += current_val;
            
            if(i == nums.length - 1 || current_val >= nums[i + 1]) {
                max.add(sequence);
                sequence = 0; 
            }

        }

        return compare(max);
    }

    public int compare(ArrayList<Integer> maxList){
        
        int maxSum = Integer.MIN_VALUE;

        for (int val : maxList) {
            if (val > maxSum) {
                maxSum = val;
            }
        }

        
        return maxSum;
    }

    public static void testCases() {
        MaximumAscendingSubarraySum1800 solution = new MaximumAscendingSubarraySum1800();

        int[] test0 = {100,10,1};
        int[] test1 = {10, 20, 30, 5, 10, 50};
        int[] test2 = {10, 20, 30, 40, 50};
        int[] test3 = {12, 17, 15, 13, 10, 11, 12};

        System.out.println("Test 0 (Expected 100): " + solution.maxAscendingSum(test0));
        System.out.println("Test 1 (Expected 65): " + solution.maxAscendingSum(test1));
        System.out.println("Test 2 (Expected 150): " + solution.maxAscendingSum(test2));
        System.out.println("Test 3 (Expected 33): " + solution.maxAscendingSum(test3));
    }

    public static void main(String[] args) {
        testCases();
    }
}