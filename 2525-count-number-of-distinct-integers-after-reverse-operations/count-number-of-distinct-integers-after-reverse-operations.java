class Solution {
    public int reverse(int num){
            int ans=0;
            while(num>0){
            int temp= num%10;
            ans=ans*10 + temp;
            num=num/10;
            }
            return ans;

        }
    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        
        
       for(int i=0; i<nums.length; i++){
           set.add(nums[i]);
           set.add(reverse(nums[i]));
       }return set.size();
    }
}