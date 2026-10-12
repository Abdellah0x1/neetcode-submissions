class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> values = new HashSet<>();

        for (int num: nums){
            values.add(num);;
        }

        int longest = 0;

        for (int num: values){
            if(!values.contains(num-1)){
                int current = num;
                int length = 1;
                while(values.contains(current +1)){
                    current++;
                    length++;
                }
                longest= Math.max(longest, length);
            }
        }
        return longest;
    }
}