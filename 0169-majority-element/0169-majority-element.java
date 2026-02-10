class Solution {
    public int majorityElement(int[] nums) {
  HashMap<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(m.containsKey(nums[i])){
                int prev=m.get(nums[i]);
                m.put(nums[i],prev+1);

            }
            else{
                m.put(nums[i],1);
            }
        }
        for( int max: m.keySet()){
            if(m.get(max)> nums.length/2){
                return max;
            }

        }
        return -1;
    }
}