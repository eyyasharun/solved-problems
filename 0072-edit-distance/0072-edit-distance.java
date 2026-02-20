class Solution {
    public int minDistance(String word1, String word2) {
        int m=word1.length();
        int n=word2.length();
        int[][] dp=new int[m+1][n+1];
     // row0
        for(int j=0;j<=n;j++){
            dp[0][j]=j;

        }
        //col0
        for(int i=0;i<=m;i++){
            dp[i][0]=i;
        }
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(word1.charAt(i-1)==word2.charAt(j-1)){
                    int dia=dp[i-1][j-1];
                    dp[i][j]=dia;
                }else{
                    int left=dp[i][j-1];
                    int top=dp[i-1][j];
                    int dia=dp[i-1][j-1];
                    dp[i][j]=Math.min(Math.min(left,top),dia)+1;
                }
            }
        }
        return dp[m][n];
    }
}