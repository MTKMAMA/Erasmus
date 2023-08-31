public class SingleNumber {
    public int singleNumber(int[] nums) {
        int result = 0;
        
        for (int num : nums) {
            result ^= num; // XOR operation
        }
        
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 3, 3}; // Example input
        SingleNumber solution = new SingleNumber();
        int single = solution.singleNumber(nums);
        System.out.println("The single number is: " + single);
    }
}
