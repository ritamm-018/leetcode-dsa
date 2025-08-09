class Solution {
    public int[] runningSum(int[] nums) {
        int[] runningSum = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            if(i == 0){
                runningSum[0] = nums[0];
            }
            else{
                runningSum[i] = nums[i] + runningSum[i - 1];
            }


        }
        return runningSum;
    }
}