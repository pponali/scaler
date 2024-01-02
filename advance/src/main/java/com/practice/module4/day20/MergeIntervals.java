package com.practice.module4.day20;

import java.util.ArrayList;

/**
 * @Author prakashponali (@pponali)
 * @Date 30/12/23 5:48 am
 * @Description :
 * <p>
 * You have a set of non-overlapping intervals. You are given a new interval [start, end], insert this new interval into the set of intervals (merge if necessary).
 * <p>
 * You may assume that the intervals were initially sorted according to their start times.
 * <p>
 * <p>
 * <p>
 * Problem Constraints
 * 0 <= |intervals| <= 105
 * <p>
 * <p>
 * <p>
 * Input Format
 * First argument is the vector of intervals
 * <p>
 * second argument is the new interval to be merged
 * <p>
 * <p>
 * <p>
 * Output Format
 * Return the vector of intervals after merging
 * <p>
 * <p>
 * <p>
 * Example Input
 * Input 1:
 * <p>
 * Given intervals [1, 3], [6, 9] insert and merge [2, 5] .
 * Input 2:
 * <p>
 * Given intervals [1, 3], [6, 9] insert and merge [2, 6] .
 * <p>
 * <p>
 * Example Output
 * Output 1:
 * <p>
 * [ [1, 5], [6, 9] ]
 * Output 2:
 * <p>
 * [ [1, 9] ]
 * <p>
 * <p>
 * Example Explanation
 * Explanation 1:
 * <p>
 * (2,5) does not completely merge the given intervals
 * Explanation 2:
 * <p>
 * (2,6) completely merges the given intervals
 */
public class MergeIntervals {
    public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
        ArrayList<Interval> finalInterval = new ArrayList<>();

        int current_start, current_end, ns = newInterval.start, ne = newInterval.end;
        if (newInterval.start > newInterval.end) {
            ns = newInterval.end;
            ne = newInterval.start;
        }
        if (intervals.isEmpty() || intervals.get(0).start > ne || intervals.get(intervals.size() - 1).end < ns) {
            intervals.add(new Interval(ns, ne));
            return intervals;
        }
        for (int i = 0; i < intervals.size(); i++) {
            current_start = intervals.get(i).start;
            current_end = intervals.get(i).end;
            if (current_end < ns) {
                finalInterval.add(intervals.get(i));
            } else if (current_start > ne) {
                finalInterval.add(new Interval(ns, ne));
                for (int j = i; j < intervals.size(); j++) {
                    finalInterval.add(intervals.get(j));
                }
                break;
            } else {
                ns = Math.min(current_start, ns);
                ne = Math.max(current_end, ne);
                if (i == intervals.size() - 1) {
                    finalInterval.add(new Interval(ns, ne));
                }
            }
        }
        return finalInterval;
    }


    public static class Interval {
        int start;
        int end;

        Interval() {
            start = 0;
            end = 0;
        }

        Interval(int s, int e) {
            start = s;
            end = e;
        }
    }

}
