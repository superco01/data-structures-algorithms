class Solution {
    public String longestCommonPrefix(String[] strs) {
        var result = "";
        var currentCharIndex = 0;
        var minLength = Integer.MAX_VALUE;
        for (int i = 0; i < strs.length; i++) {
            minLength = Math.min(minLength, strs[i].length());
        }
        System.out.println("ML:" + minLength);
        // if (strs[0].equals("") || strs.length == 1) {
        //     return result;
        // }

        while (currentCharIndex < minLength) {
            System.out.println("CI:" + currentCharIndex);
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