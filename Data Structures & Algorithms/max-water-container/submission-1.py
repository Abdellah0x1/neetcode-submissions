class Solution:
    def maxArea(self, heights: List[int]) -> int:
        i = 0
        j = len(heights) - 1
        max = (j-i) * min(heights[i], heights[j])
        
        while(i< j):
            if  (j-i) * min(heights[i], heights[j]) > max:
                max =  (j-i) * min(heights[i], heights[j])

            elif min(heights[i], heights[j]) == heights[i]:
                i +=1
            elif min(heights[i], heights[j]) == heights[j]:
                j -=1
        return max
            

        