class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] arr = new int[101];
        int count = 0;
        int maxCount = 0;

        for(int num: nums) arr[num]++;

        for(int i = 0; i < arr.length; ++i) {
            if(arr[i] > maxCount) {
                maxCount = arr[i];
                count = 0;
            } 
            if(arr[i] == maxCount) {
                count += arr[i];
            }

        }
        return count;
    }
}
