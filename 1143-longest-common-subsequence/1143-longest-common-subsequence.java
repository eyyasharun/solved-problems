class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int mc=text1.length();
        int nr=text2.length();
        int[][] dp=new int[mc+1][nr+1];
        for(int i=1;i<=mc;i++){
            for(int j=1;j<=nr;j++){
                if(text1.charAt(i-1) == text2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                }
                else{
                    int left=dp[i][j-1];
                    int top=dp[i-1][j];
                    dp[i][j]=Math.max(left,top);
                }
                
            }
        }
        return dp[mc][nr];
        
    }
}