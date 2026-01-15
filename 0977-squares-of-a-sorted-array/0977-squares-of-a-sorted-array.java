class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];

        int start = 0;
        int end = nums.length - 1;
        int pos = nums.length - 1;

        while(start <= end){
            int start_sq = nums[start] * nums[start];
            int end_sq = nums[end] * nums[end];

            if(start_sq > end_sq){
                res[pos] = start_sq;
                start++;
            }
            else{
                res[pos] = end_sq;
                end--;
            }
            pos--;
        }
        return res;
    }
}