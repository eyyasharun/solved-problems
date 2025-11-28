class Solution {
    public int numIdenticalPairs(int[] nums) {
        int n=nums.length;
        int cnt=0;
        for(int i=0;i<=n-2;i++){
            for(int j=i+1;j<=n-1;j++){
                if(nums[i]==nums[j]){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}