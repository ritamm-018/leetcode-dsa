class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];

        int start = 0;
        int end = nums.length - 1;
        int pos = nums.length - 1;

        while(start <= end){
            if(nums[start] * nums[start] > nums[end] * nums[end]){
                res[pos] = nums[start] * nums[start];
                start++;
            }
            else{
                res[pos] = nums[end] * nums[end];
                end--;
            }
            pos--;
        }
        return res;
    }
}