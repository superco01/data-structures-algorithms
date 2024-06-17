class Solution {
    public int longestPalindrome(String s) {
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            freqMap.merge(c, 1, Integer::sum);
        }

        System.out.println(freqMap);
        int result = 0;
        boolean hasMidVal = false;
        for (var val : freqMap.values()) {
            result = result + (val / 2) * 2;
            if (!hasMidVal && val % 2 == 1) {
                result++;
                hasMidVal = true;
            }
        }

        return result;
    }
}