class Solution {
    public int search(int[] nums, int target) {
        int lb=0,ub=nums.length-1;
        int index=0;
        while(lb<=ub)
        {
            int mid=lb+(ub-lb)/2;
            if(nums[lb]<=nums[mid]) // that means left half is sorted
            {
            if(target<nums[mid] && nums[lb]<=target )
            {
                ub=mid-1;
            }
            else
            lb=mid+1;
            }
            else
            {
            if(target>nums[mid] && target<=nums[ub])
            {
                lb=mid+1;
            }
            else
            ub=mid-1;
            }
            if(target==nums[mid])
            {
           return mid;
            }

        }
        return -1;
    }
}
