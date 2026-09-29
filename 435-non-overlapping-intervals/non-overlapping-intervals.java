class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        if(intervals.length <= 0){
            return 0;
        }
        Arrays.sort(intervals, Comparator.comparingDouble(o -> o[1])); 

        int maxActivites = 1;
        int lastEnd = intervals[0][1];
        
        for (int i = 1; i < intervals.length; i++) {
            if (lastEnd <= intervals[i][0]) {
                maxActivites++;
                lastEnd = intervals[i][1];
            }
        }

        return intervals.length - maxActivites;
    }
}