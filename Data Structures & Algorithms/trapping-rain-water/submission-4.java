
class Solution {
    public int trap(int[] height) {
        if (height.length < 3) return 0;

        int water = 0;
        int n = height.length;

        int[] maxLefts = new int[n];
        int[] maxRights = new int[n];

        maxLefts[0] = 0;
        maxLefts[1] = height[0];

        maxRights[n - 1] = 0;
        maxRights[n - 2] = height[n - 1];

        for (int i = 2; i < n; i++) {
            maxLefts[i] = Math.max(
                maxLefts[i - 1],
                height[i - 1]
            );
        }

        for (int j = n - 3; j >= 0; j--) {
            maxRights[j] = Math.max(
                height[j + 1],
                maxRights[j + 1]
            );
        }

        for (int i = 0; i < n; i++) {
            int minHeight = Math.min(maxLefts[i], maxRights[i]);
            water += Math.max(0, minHeight - height[i]);
        }

        return water;
    }
}
