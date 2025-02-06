import java.util.Arrays;

class TupleWithSameProduct1726{
    public int tupleSameProduct(int[] nums) {

        int tuple = 0;
        
        for(int  i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){

                int[] firstFour = Arrays.copyOf(nums, 4);
                int firstMult = firstFour[0] * firstFour[1];
                int secondMult = firstFour[2] * firstFour[3];
                
                if(firstMult == secondMult){
                    tuple++;
                } else{ 
                    swap(nums, i, j);
                }
            }
            
        }
        return tuple; 
    }

    public static void swap(int [] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        TupleWithSameProduct1726 solution = new TupleWithSameProduct1726();

        // Example 1
        int[] nums1 = {2, 3, 4, 6};
        System.out.println("Output for nums1: " + solution.tupleSameProduct(nums1)); // Expected: 8

        // Example 2
        int[] nums2 = {1, 2, 4, 5, 10};
        System.out.println("Output for nums2: " + solution.tupleSameProduct(nums2)); // Expected: 16
    }
}