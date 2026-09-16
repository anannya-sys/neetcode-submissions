class Solution {
    public int findMin(int[] nums) {
        int sm=nums[0];;
        for(int i=0;i<nums.length;i++) {
            if(sm>nums[i])
            {
            sm=nums[i];
            }

        } 
    return sm;
}
}
