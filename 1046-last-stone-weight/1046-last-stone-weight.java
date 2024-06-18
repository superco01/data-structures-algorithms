class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int stone : stones) {
            pq.add(stone);
        }

        System.out.println(pq);

        int result = 0;
        while (!pq.isEmpty()) {
            int firstStone = pq.poll();
            if (pq.size() == 0) {
                return firstStone;
            }
            int secondStone = pq.poll();
            result = firstStone - secondStone;
            pq.add(result);
        }

        return result;
    }
}