class Solution {
    public int[] twoSum(int[] nums, int target) {
        return hashMap(nums, target);
    }

    private int[] hashMap(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        int reqNum = 0;
        for(int i = 0; i < nums.length; i++) {
            reqNum = target - nums[i];
            if(map.get(reqNum) != null) {
                result[0] = i;
                result[1] = map.get(reqNum);
                return result;
            }
            map.put(nums[i], i);
        }
        return result;
    }
}