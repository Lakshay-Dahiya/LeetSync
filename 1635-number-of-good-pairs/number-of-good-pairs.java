class Solution {
    public int numIdenticalPairs(int[] nums) {
        int sum = 0;
        for (int i = 0 ; i< nums.length ; i++){
            for(int j =0 ; j< nums.length ; j++){ // j=i+1 because i always  < j
                if (i<j && nums[i] == nums[j]){
                    sum++;
                    
                }
            }
        }return sum;
    }
}