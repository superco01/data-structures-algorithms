class Solution {
    public int maxPower(String s) {
        int maxLength = 0, left = 0;
        char prevChar = 0;
        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);
            if (prevChar != currentChar) {
                prevChar = currentChar;
                left = right;
            }
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}