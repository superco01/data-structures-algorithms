class Solution {
    public boolean isPalindrome(int x) {
        var str = String.valueOf(x);
        for (int left = 0, right = str.length() - 1; left < right; left++, right--) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
        }
        return true;
    }
}