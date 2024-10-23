class Solution {
    public boolean hasTrailingZeros(int[] nums) {
        var toggle = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                if (toggle == true) {
                    return true;
                } else {
                    toggle = true;
                }
            }
        }

        return false;
    }
}