class Solution {
    public int maximumWealth(int[][] accounts) {
        int result = -1;
        int ans = 0;
        for(int i =0;i<accounts.length;i++){
            for(int j =0;j<accounts[0].length;j++){
                ans += accounts[i][j];
            }
            result = Math.max(result,ans);
            ans=0;
        }
        return result;
    }
}