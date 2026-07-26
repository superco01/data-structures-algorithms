class Solution {
    public boolean containsDuplicate(int[] nums) {
        var countMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            countMap.put(nums[i], countMap.getOrDefault(nums[i], 0) + 1);
        }

        for (int count : countMap.values()) {
            if (count > 1) {
                return true;
            }
        }

        return false;
    }
}