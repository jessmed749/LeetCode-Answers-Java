
//Why is the name so long?

public class CheckIfOneStringSwapCanMakeStringsEqual1790 {
    public boolean areAlmostEqual(String s1, String s2) {

        if(s1.equals(s2)){
            return true;
        }
        
        if(s1.length() != s2.length()){
            return false;
        }

        char[] arr_str = s1.toCharArray();
        for(int i = 0; i < s1.length(); i++){
            for (int j = i + 1; j < arr_str.length; j++) {

                swap(arr_str, i, j);

                new String(arr_str);
                if(new String(arr_str).equals(s2)){
                    return true;
                }

                swap(arr_str, i, j);
            }   
        }
        
        return false;
    }

    public static void swap(char[] arr, int i, int j){
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        CheckIfOneStringSwapCanMakeStringsEqual1790 solution = new CheckIfOneStringSwapCanMakeStringsEqual1790();

        // Test Cases
        System.out.println(solution.areAlmostEqual("bank", "kanb")); // true
        System.out.println(solution.areAlmostEqual("attack", "defend")); // false
        System.out.println(solution.areAlmostEqual("kelb", "kelb")); // true
        System.out.println(solution.areAlmostEqual("abcd", "dcba")); // true (reversed case)
        System.out.println(solution.areAlmostEqual("abcd", "abdc")); // true (single swap)
        System.out.println(solution.areAlmostEqual("abcd", "acdb")); // false (more than one swap)
        System.out.println(solution.areAlmostEqual("abc", "abcd")); // false (different lengths)
    }

    
}
