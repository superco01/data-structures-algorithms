class Solution {
    public boolean judgeSquareSum(int c) {
        int aBase = 0;
        int bBase = (int) Math.sqrt(Double.valueOf(c)); 
        while (aBase <= bBase) {
            var a = Math.pow(aBase, 2);
            var b = Math.pow(bBase, 2);
            System.out.println(a);
            System.out.println(b);
            System.out.println("----");
            if (a + b == c) {
                return true;
            } 
            else if (a + b > c) {
                bBase--;
            } else {
                aBase++;
            }
        }
        return false;
    }
}