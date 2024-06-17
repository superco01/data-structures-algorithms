class Solution {
    public boolean judgeSquareSum(int c) {
        int aBase = 0;
        int bBase = (int) Math.sqrt(Double.valueOf(c)); 
        while (aBase <= bBase) {
            if (Math.pow(aBase, 2) + Math.pow(bBase, 2) == c) {
                return true;
            } 
            else if (Math.pow(aBase, 2) + Math.pow(bBase, 2) > c) {
                bBase--;
            } else {
                aBase++;
            }
        }
        return false;
    }
}