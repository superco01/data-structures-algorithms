class Solution {
    public int minDeletions(String s) {
        Map<Character, Integer> charFrequencyMap = new HashMap<>();

        for (char c : s.toCharArray()) {
            charFrequencyMap.merge(c, 1, Integer::sum);
        }

        HashSet<Integer> set = new HashSet<>();
        int deletions = 0;
        for (int frequency : charFrequencyMap.values()) {
            while (frequency > 0 && set.contains(frequency)) {
                frequency--;
                deletions++;
            }
            set.add(frequency);
        }

        return deletions;
    }
}