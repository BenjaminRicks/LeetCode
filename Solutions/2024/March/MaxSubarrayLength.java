class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int left = 0;
        int right = 0;
        Integer val = null;
        int largestSubArray = 1;
        Map<Integer, Integer> map = new HashMap<>();

        while(right != nums.length) {
            val = map.get(nums[right]);
            if(val == null) {
                map.put(nums[right], 1);
                largestSubArray = Math.max(largestSubArray, right-left+1);
                
            }
            else{
                map.put(nums[right], val + 1);
                while(map.get(nums[right]) > k){
                    map.put(nums[left], map.get(nums[left]) - 1);
                    left++;
                }
                largestSubArray = Math.max(largestSubArray, right-left+1);

            }
            right++;

        }

        return Math.max(largestSubArray, right-left);
        
    }
}
