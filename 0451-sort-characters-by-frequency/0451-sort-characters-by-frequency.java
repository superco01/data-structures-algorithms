class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> charFreqMap = new HashMap<>();
        Comparator<Map.Entry<Character, Integer>> valueComparator;
        valueComparator = (e1, e2) -> e2.getValue().compareTo(e1.getValue());
        
        PriorityQueue<Map.Entry<Character, Integer>> maxHeap;
        maxHeap = new PriorityQueue<>(valueComparator);

        for (char c : s.toCharArray()) {
            charFreqMap.merge(c, 1, Integer::sum);
        }

        for (Map.Entry<Character, Integer> entry : charFreqMap.entrySet()) {
            maxHeap.add(entry);
        }

        System.out.println(charFreqMap);
        System.out.println(maxHeap);

        StringBuilder sb = new StringBuilder();
        while (!maxHeap.isEmpty()) {
            Map.Entry<Character, Integer> entry = maxHeap.poll();
            var key = entry.getKey();
            var freq = entry.getValue();
            while (freq > 0) {
                sb.append(key);
                freq--;
            }
        }

        return sb.toString();
    }
}