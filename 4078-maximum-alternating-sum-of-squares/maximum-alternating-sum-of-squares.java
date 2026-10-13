class Solution {
    public long maxAlternatingSum(int[] nums) {
        long ans=0;
        int n=nums.length;

        long[] squares = new long[n];

        for (int i = 0; i < n; i++) {
            squares[i] = (long) nums[i] * nums[i];
        }

        Arrays.sort(squares);

        for(int i=0; i<n; i++){

            if(i<n/2){
                ans-=squares[i];
            } else{
                ans+=squares[i];
            }
        }

        return ans;
    }
}