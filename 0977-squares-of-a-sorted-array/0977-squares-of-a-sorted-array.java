class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];

        int first = 0;
        int last = nums.length - 1;
        int pos = nums.length - 1;

        while(first <= last){
            if(nums[first] * nums[first] > nums[last] * nums[last]){
                result[pos] = nums[first] * nums[first];
                first++;
            }
            else{
                result[pos] = nums[last] * nums[last];
                last--;
            }
            pos--;
        }
        return result;
    }
}