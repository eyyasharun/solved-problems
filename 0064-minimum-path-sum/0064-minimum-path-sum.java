class Solution {
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int [][] dp=new int [m][n];
        dp[0][0]=grid[0][0];

        // row0
        for(int j=1;j<n;j++){
            int left=dp[0][j-1];
            dp[0][j]=left+grid[0][j];
        }
        //col0
        for(int i=1;i<m;i++){
            int top=dp[i-1][0];
            dp[i][0]=top+grid[i][0];
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                int left=dp[i][j-1];
                int top=dp[i-1][j];
                dp[i][j]=Math.min(left,top)+grid[i][j];
            }
        }
        return dp[m-1][n-1];

        
    }
}