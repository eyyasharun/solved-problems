class Solution {
    public int[] searchRange(int[] nums, int target) {
// Convert array → ArrayList (your logic)
        List<Integer> m = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            m.add(nums[i]);
        }

        int start = 0;
        int end = nums.length - 1;

        // ---------- FIRST OCCURRENCE ----------
        int first = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (m.get(mid) == target) {
                first = mid;
                end = mid - 1;      // move LEFT
            } 
            else if (target < m.get(mid)) {
                end = mid - 1;
            } 
            else {
                start = mid + 1;
            }
        }

        // ---------- LAST OCCURRENCE ----------
        start = 0;
        end = nums.length - 1;
        int last = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (m.get(mid) == target) {
                last = mid;
                start = mid + 1;    // move RIGHT
            } 
            else if (target < m.get(mid)) {
                end = mid - 1;
            } 
            else {
                start = mid + 1;
            }
        }

        return new int[]{first, last};
        
    }
}