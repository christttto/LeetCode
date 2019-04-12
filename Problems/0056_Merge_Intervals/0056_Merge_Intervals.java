/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
class Solution {
    private class IntervalComparator implements Comparator<Interval>{
        @Override
        public int compare(Interval a, Interval b){
            return a.start<b.start ? -1 : a.start==b.start ? 0 : 1;
        }
    }
    public List<Interval> merge(List<Interval> intervals) {
        Collections.sort(intervals, new IntervalComparator());
        if(intervals.size()<1)return intervals;
        for(int i=1;i<intervals.size();i++){
            if(intervals.get(i-1).end>=intervals.get(i).start){
                intervals.get(i-1).end=Math.max(intervals.get(i).end,intervals.get(i-1).end);//update the prev
                intervals.remove(i);//remove the current
                i--;
            }
        }
        return intervals;
    }
}
