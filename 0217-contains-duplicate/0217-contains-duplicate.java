class Solution {
    public boolean containsDuplicate(int[] nums) {
        var countMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            countMap.put(nums[i], countMap.getOrDefault(nums[i], 0) + 1);
            // System.out.println(countMap.get(nums[i]));
        }

        for (int count : countMap.values()) {
            System.out.println(count);
            if (count > 1) {
                return true;
            }
        }

        return false;
    }
}