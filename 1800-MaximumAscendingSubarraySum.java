
class Solution {
    public int maxAscendingSum(int[] nums) {

        int sequence = 0;
        
        for(int i = 0; i < nums.length-1; i++) {
            int current_val = nums[i];
            int next_value = nums[i+1];

            if(current_val < next_value) {
                sequence += current_val;
                
            } else{
                i++;
            }
        }

        return sequence;
    }

    // public int compare(int num){

    // }

    public static void testCases() {
        Solution solution = new Solution();

        int[] test1 = {10, 20, 30, 5, 10, 50};
        int[] test2 = {10, 20, 30, 40, 50};
        int[] test3 = {12, 17, 15, 13, 10, 11, 12};

        System.out.println("Test 1 (Expected 65): " + solution.maxAscendingSum(test1));
        System.out.println("Test 2 (Expected 150): " + solution.maxAscendingSum(test2));
        System.out.println("Test 3 (Expected 33): " + solution.maxAscendingSum(test3));
    }

    // ✅ Main method to run test cases
    public static void main(String[] args) {
        testCases();
    }
}