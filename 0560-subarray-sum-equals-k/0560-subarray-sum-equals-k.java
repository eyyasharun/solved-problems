import java.util.*;

class Solution {
    public int subarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> m = new HashMap<>();

        int sum = 0;
        int maxlen = 0;

        for (int i = 0; i < nums.length; i++) {

            sum += nums[i];

            if (sum == k) {
                maxlen = Math.max(maxlen, i + 1);
            }

            int rem = sum - k;

            if (m.containsKey(rem)) {
                int len = i - m.get(rem);
                maxlen = Math.max(maxlen, len);
            }

            if (!m.containsKey(sum)) {
                m.put(sum, i);
            }
        }

        return maxlen;
    }
}