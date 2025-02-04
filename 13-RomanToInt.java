

class Solution {
    public int romanToInt(String s) {
        int total = 0;
        int result_current = 0;

        for(int i = s.length() - 1; i >= 0; i--){
            int current = asign_value(s.charAt(i));
            int next_value = (i > 0) ? asign_value(s.charAt(i - 1)) : 0;
            
            if(current > next_value){
                result_current = current - next_value;
                total += result_current;
                i--;
            } else{
                total += current;
            }
        }

        return total;
    }

    public int asign_value(char roman){
        switch (roman){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0; 
        }
    }

    public static void testCases() {
        Solution solution = new Solution();

        // Test cases
        System.out.println("Test MCMXCIV: " + (solution.romanToInt("MCMXCIV") == 1994));
        System.out.println("Test III: " + (solution.romanToInt("III") == 3));
        System.out.println("Test IV: " + (solution.romanToInt("IV") == 4));
        System.out.println("Test IX: " + (solution.romanToInt("IX") == 9));
        System.out.println("Test LVIII: " + (solution.romanToInt("LVIII") == 58));
        System.out.println("Test MMXXIII: " + (solution.romanToInt("MMXXIII") == 2023));
    }

    // Main method to run test cases
    public static void main(String[] args) {
        testCases();
    }
}