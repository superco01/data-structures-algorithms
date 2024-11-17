class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> intervalList = new ArrayList<>(Arrays.asList(intervals));
        intervalList.add(newInterval);
        Collections.sort(intervalList, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> result = new ArrayList<int[]>();
        int[] prev = intervalList.get(0);
        for (int i = 1; i < intervalList.size(); i++) {
            int[] curr = intervalList.get(i);
            if (prev[1] >= curr[0]) {
                // System.out.println("if");
                prev[1] = Math.max(prev[1], curr[1]);
            } else {
                // System.out.println("else");
                result.add(prev);
                prev = curr;
            }
        }

        result.add(prev);
        return result.toArray(new int[result.size()][]);
    }
}