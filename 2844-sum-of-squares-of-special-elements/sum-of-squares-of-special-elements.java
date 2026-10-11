class Solution {
    public int sumOfSquares(int[] nums) {
        int res = 0;

        for(int i=0; i<nums.length; i++){
            int j = i+1;

            if(nums.length % j == 0){
                res+=(nums[j-1] * nums[j-1]);
            }
        }

        return res;
        
    }
}