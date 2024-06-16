class Solution {
    public int maximalNetworkRank(int n, int[][] roads) {
        int[] directConnectionToCity = new int[n];
        boolean[][] isBothCitiesConnected = new boolean[n][n];
        PriorityQueue<Map<Integer, Integer>> pqMax = 
        new PriorityQueue<Map<Integer, Integer>>(Collections.reverseOrder());

        for (int[] road : roads) {
            int cityA = road[0];
            int cityB = road[1];
            directConnectionToCity[cityA]++;
            directConnectionToCity[cityB]++;
            isBothCitiesConnected[cityA][cityB] = true;
            isBothCitiesConnected[cityB][cityA] = true;
        }

        int maxNetworkRank = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int currentRank = directConnectionToCity[i] + directConnectionToCity[j];
                if (isBothCitiesConnected[i][j]) {
                    currentRank--;
                }
                maxNetworkRank = Math.max(maxNetworkRank, currentRank);
            }
        }

        return maxNetworkRank;
    }
}