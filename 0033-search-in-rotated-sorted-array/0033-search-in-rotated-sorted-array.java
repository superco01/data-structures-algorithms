class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int result = -1;
        if (nums[left] == target) {
            return left;
        } else if (nums.length == 1) {
            return result;
        }
        while (left <= right) {
            int mid = left + (right - left) / 2;
            System.out.println("mid: " + mid);
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] >= nums[right]) {
                if (nums[left] <= target && target <= nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (nums[mid] <= target && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        return result;
    }
}