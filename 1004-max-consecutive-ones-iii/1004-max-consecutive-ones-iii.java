class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0, maxNum = 0, flipped = 0;
        for (int i = 0; i < nums.length; i++) {
            left = i;
            for (int right = i; right < nums.length; right++) {
                 if (nums[right] == 0) {
                    if (flipped < k) {
                        flipped++;
                    } else {
                        // left = right + 1;
                        flipped = 0;
                        break;
                    }
                }
                maxNum = Math.max(maxNum, right - left + 1);
                // System.out.println("flipped:\t" + flipped);
                // System.out.println("left:\t" + left);
                // System.out.println("right:\t" + right);
                // System.out.println("maxNum:\t" + maxNum);
                // System.out.println("------");
            }
        }
        return maxNum;
    }
}