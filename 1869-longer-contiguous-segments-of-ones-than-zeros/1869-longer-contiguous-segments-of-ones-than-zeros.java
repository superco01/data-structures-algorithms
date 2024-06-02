class Solution {
    public boolean checkZeroOnes(String s) {
        int maxLength1 = 0, maxLength0 = 0;
        int length1 = 0, length0 = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                length1++;
                maxLength1 = Math.max(maxLength1, length1);
                length0 = 0;
            } else {
                length0++;
                maxLength0 = Math.max(maxLength0, length0);
                length1 = 0;
            }
        }
        return maxLength1 > maxLength0;
    }
}