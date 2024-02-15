class Solution {
    public long largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        long sum=0;
        for(int i=0; i<nums.length ; i++){
            sum=sum+nums[i];
        }
        long ans = -1;
        for(int i=nums.length-1 ; i>=0 ; i--){
            if(sum-nums[i] > nums[i]){
                ans=nums[i];
                return sum;
            }
            
            sum=sum-nums[i];
        }
    return -1;
    }
}