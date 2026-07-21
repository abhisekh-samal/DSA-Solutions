class IsSorted {
    public boolean isSorted(ArrayList<Integer> nums) {

        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i - 1) > nums.get(i)) {
                return false;
            }
        }

        return true;
    }
}