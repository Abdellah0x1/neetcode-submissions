class Solution {
    public int maxArea(int[] heights) {

        int i = 0;
        int j = heights.length -1;
        
        int max = (j - i) * Math.min(heights[j], heights[i]);
        while (i < j){
            if((j - i) * Math.min(heights[j], heights[i]) > max){
                max =  (j - i) * Math.min(heights[j], heights[i]);

            }else {
                if(Math.min(heights[j], heights[i]) == heights[i]){
                    i++;
                }else {
                    j--;
                }
            }
        }
        return max;
    }
}
