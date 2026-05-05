class Solution {
    public int pivotIndex(int[] nums) {
        int rSum = 0;

        for(int ele : nums){
            rSum += ele;
        }

        int lSum = 0;
        for(int i=0;i<nums.length;i++){
            rSum -= nums[i];

            if(rSum == lSum){
                return i;
            }
            lSum += nums[i];
        }

        return -1;
    }
}