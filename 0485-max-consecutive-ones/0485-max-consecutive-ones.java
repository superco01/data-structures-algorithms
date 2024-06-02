class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int l = 0, maxNum = 0;
        for (int r = l; r < nums.length; r++) {
            if (nums[r] == 0) {
                l = r + 1;
            }
            maxNum = Math.max(maxNum, (r - l + 1));
        }

        return maxNum;
    }
}