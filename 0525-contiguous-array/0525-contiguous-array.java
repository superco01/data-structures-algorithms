class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int maxLength = 0, balance = 0;
        map.put(0, -1);

        for (int i = 0; i < nums.length; i++) {
            balance += nums[i] == 1 ? 1 : -1;
            if (map.containsKey(balance)) {
                maxLength = Math.max(maxLength, i - map.get(balance));
            } else {
                map.put(balance, i);
            }
        }

        return maxLength;
    }
}