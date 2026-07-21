class SecondLargestElement {
    public int secondLargestElement(int[] nums) {

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        // Find largest
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max1) {
                max1 = nums[i];
            }
        }

        // Find second largest
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max2 && nums[i] != max1) {
                max2 = nums[i];
            }
        }

        return max2;
    }
}