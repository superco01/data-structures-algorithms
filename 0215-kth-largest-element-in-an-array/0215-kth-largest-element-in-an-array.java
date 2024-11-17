class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
        int res = 0;

        for (int num : nums) {
            pq.add(num);
        }

        for (int i = 0; i < k - 1; i++) {
            pq.poll();
        }

        res = pq.peek();

        return res;
    }
}