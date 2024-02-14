class Solution {
    public int[] rearrangeArray(int[] nums) {
        int []newarr = new int[nums.length];
        int evenind=0;
        int oddind=1;
        for(int i=0 ; i<nums.length ; i++){
            if(nums[i]>0){
                newarr[evenind]=nums[i];
                evenind=evenind+2;
            }
            else{
                newarr[oddind]=nums[i];
                oddind=oddind+2;
            }
        }
        return newarr;
    }
}