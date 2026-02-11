class Solution {
    public int findSmallestInteger(int[] nums, int value) {
        var maxMex = 0;
        var minMexMap = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) { 
            // ((a % b) + b) % b
            var remainder = ((nums[i] % value) + value) % value;
            // System.out.println(remainder);
            minMexMap.put(remainder, (minMexMap.getOrDefault(remainder, 0) + 1));
        }

        // System.out.println("length num: " + nums.length);
        // System.out.println("size: " + minMexMap.size());

        while (true) {
            for (int i = 0; i < value; i++) {
                // System.out.println("key: " + i + " val: " + minMexMap.get(i) + " maxMex: " + maxMex);
                if (minMexMap.get(i) == null || minMexMap.get(i) == 0) {
                    return maxMex;
                }
                minMexMap.put(i, (minMexMap.getOrDefault(i, 0) - 1));
                maxMex += 1;
            }
        }
    }
}