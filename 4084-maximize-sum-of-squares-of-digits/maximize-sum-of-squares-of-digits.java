class Solution {
    public String maxSumOfSquares(int num, int sum) {
        StringBuilder sb = new StringBuilder();
        int score = 0;
        int maxScore = 0;

        int val = 9;
        for (int i = 0; i < num; i++) {
            if (sum < val) {
                val = sum;
            }
            sb.append(val);
            sum -= val;
            score += (val * val);
            if (score > maxScore) {
                maxScore = score;
            }

        }

        int res = 0;
        for (int i = 0; i < sb.length(); i++) {
            res += (sb.charAt(i) - '0');
        }

        if(sum ==0){
            return sb.toString();
        }

        return "";
    }
}