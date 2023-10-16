class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int result = 0;
        int n = grid.length;
        
        int max_row[] = new int[n];
        int max_col[] = new int[n];
        
        for(int i =0;i<n;i++){
            for(int j =0;j<n;j++){
                max_row[i] = Math.max(max_row[i],grid[i][j]);
                max_col[j] = Math.max(max_col[j],grid[i][j]);
            }
        }
        
        for(int i = 0;i<n;i++){
            for(int j =0;j<n;j++){
                result += Math.min(max_row[i],max_col[j]) - grid[i][j];
            }
        }
        return result;
    }
}