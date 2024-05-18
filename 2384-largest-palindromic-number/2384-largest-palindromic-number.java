class Solution {
    public String largestPalindromic(String num) {
        Map<Integer, Integer> map = new HashMap<>();
        for (char c : num.toCharArray()) {
            map.merge(c - '0', 1, Integer::sum);
        }
        AtomicReference<Integer> middleNum = new AtomicReference<>(0);
        StringBuilder right = new StringBuilder();
        map.forEach((key, value) -> {
            if (value % 2 == 1) {
                middleNum.set(Math.max(middleNum.get(), key));
            }
            for (int i = 0; i < value / 2; i++) {
                right.append(key);
            }
        });
        String finalMiddleNum = String.valueOf(middleNum.get());
        var left = new StringBuilder(right).reverse();
        if (right.isEmpty() || right.charAt(right.length() - 1) == '0') {
            return finalMiddleNum;
        }
        if (right.length() * 2 == num.length()) {
            return left.append(right).toString();
        }
        return left.append(finalMiddleNum).append(right).toString();
    }
}