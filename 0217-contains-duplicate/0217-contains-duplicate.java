class Solution {
    public boolean containsDuplicate(int[] nums) {
        var countMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            var count = countMap.get(nums[i]);
            if (count != null) {
                return true;
            }
            countMap.put(nums[i], 1);
        }

        return false;
    }
}