class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
    

        Arrays.sort(nums);
        List<List<Integer>> results = new ArrayList<>();
        for(int i = 0 ; i < nums.length; i++){
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int j = i+1;
            int k = nums.length -1;
            while( j <k ){
                if(nums[j] + nums[k] == -nums[i]){
                    results.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    k--;
                    j++;

                     while (j < k && nums[j] == nums[j - 1]) {
                        j++;
                    }

                    while (j < k && nums[k] == nums[k + 1]) {
                        k--;
                    }

                }
                else if(nums[j] + nums[k] > -nums[i]){
                    k--;
                }else {
                    j++;
                }
            }
        }

        return results;
    }
}
