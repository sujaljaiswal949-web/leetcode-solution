class Solution {
    public int removeElement(int[] nums, int val) {
        int nextSpot = 0;

        for (int num : nums) {
            if (num != val) {
                nums[nextSpot] = num;
                nextSpot++;
            }
        }

        return nextSpot;
    }
}