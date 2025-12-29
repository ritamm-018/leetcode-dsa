class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for(int i = 0; i < nums.length - 2; i++){
            if( i > 0 && nums[i] == nums[i - 1]){
                continue;
            }
            int x = i + 1;
            int y = nums.length - 1;

            

            while(x < y){
                int sum = nums[i] + nums[x] + nums[y];
                if(sum == 0){
                    
                    result.add(Arrays.asList(nums[i], nums[x], nums[y]));

                    
                    
                    while(x < y && nums[x] == nums[x + 1]){
                        x++;
                    }
                    while(x < y && nums[y] == nums[y - 1]){
                        y--;
                    }
                    x++;
                    y--;
                }

                else if(sum < 0){
                    x++;

                }

                else{
                    y--;
                }
                
            }
        }
        return result;
    }
}