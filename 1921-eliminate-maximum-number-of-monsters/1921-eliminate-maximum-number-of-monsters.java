class Solution {
    public int eliminateMaximum(int[] dist, int[] speed) {
        final int n = dist.length;
        int[] arrivalTime = new int[n];

        // Calculate the arrival time for each monster
        for (int i = 0; i < n; ++i) {
            arrivalTime[i] = (dist[i] - 1) / speed[i];
            // The formula calculates the time it takes for a monster to reach the city.
            // We subtract 1 from dist[i] because we lose if the monster reaches the city at the exact moment the weapon is charged.
        }

        // Sort the arrival times in ascending order
        Arrays.sort(arrivalTime);

        // Iterate through the sorted arrival times and check if the game can be lost
        for (int i = 0; i < n; ++i) {
            if (i > arrivalTime[i]) {
                // If the current monster arrives later than the minute when it should be eliminated, return the index.
                // This means that you cannot eliminate all monsters before they reach the city.
                return i;
            }
        }

        // If you reach this point, it means that you can eliminate all monsters before they reach the city.
        return n;
    }
}