class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int start = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                start = i;
            } else if (i - start == 3) {
                return true;
            }
        }
        return false;
    }
}