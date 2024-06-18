class Solution {
    public boolean isPerfectSquare(int num) {
        long left = 1, right = num;
        while (left <= right) {
            long mid = left + (right - left) / 2;
            System.out.println(left);
            System.out.println(right);
            System.out.println(mid);
            System.out.println();
            long midPow = mid * mid;
            if (midPow == num) {
                return true;
            } else if (midPow < num) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;
    }
}