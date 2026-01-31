class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            int key=nums[i];
            if(hm.containsKey(key)){
                int prev=hm.get(key);
                hm.put(key,prev+1);
            }else{
                hm.put(key,1);
            }
        }
        int maxfreq=0;
        int maxkey=0;
        for(int j=0;j<n;j++){
            int s=nums[j];
            if(hm.get(s)>maxfreq){
                maxfreq=hm.get(s);
                maxkey=s;
            }
        }
        return maxkey;
    }
}