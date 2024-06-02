class Solution {
    public int minimumChairs(String s) {
        int chair = 0, maxChair = 0;
        for (char person : s.toCharArray()) {
            if (person == 'E') {
                chair++;
            } else {
                chair--;
            }
            maxChair = Math.max(maxChair, chair);
        }
        return maxChair;
    }
}