class Solution {
    public int arraySign(int[] nums) {
        int numNegatives = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                return 0;
            } else if (nums[i] < 0) {
                numNegatives++;
            }
        }
        return (numNegatives % 2 == 0) ? 1 : -1;
    }
}
