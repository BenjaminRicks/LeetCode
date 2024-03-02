class Solution {
    public int[] sortedSquares(int[] nums) {

        int front = 0;
        int back = nums.length-1;
        int[] array = new int[nums.length];
        for(int i = 0; i < nums.length; ++i) {

            if(nums[front] * nums[front] >= nums[back] * nums[back]) {
                array[nums.length-i-1] = nums[front] * nums[front];
                front++;
            }
            else{
                array[nums.length-i-1] = nums[back] * nums[back];
                back--;
            }

        }
        return array;

    }
}
