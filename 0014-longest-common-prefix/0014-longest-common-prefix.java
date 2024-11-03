class Solution {
    public String longestCommonPrefix(String[] strs) {
        var result = "";
        var currentCharIndex = 0;
        var minLength = Integer.MAX_VALUE;
        for (int i = 0; i < strs.length; i++) {
            minLength = Math.min(minLength, strs[i].length());
        }

        while (currentCharIndex < minLength) {
            for (int i = 0; i < strs.length; i++) {
                if (!(strs[0].charAt(currentCharIndex) == strs[i].charAt(currentCharIndex))) {

                    return result;
                }
            }
            result = result + strs[0].charAt(currentCharIndex);
            currentCharIndex++;
        }
        return result;
    }
}