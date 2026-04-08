/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
        for (int i = 0; i < intervals.size(); i++) {
            for (int j = i + 1; j < intervals.size(); j++) {
                Interval i1 = intervals.get(i);
                Interval i2 = intervals.get(j);

                if (i1.start < i2.end && i2.start < i1.end) {
                    return false;
                }
            }
        }
        return true;
    }
}
