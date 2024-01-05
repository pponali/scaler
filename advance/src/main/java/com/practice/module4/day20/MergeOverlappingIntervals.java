package com.practice.module4.day20;

import java.util.*;
import java.util.stream.IntStream;

/**
 * @Author prakashponali (@pponali)
 * @Date 30/12/23 5:48 am
 * @Description :
 * Given a collection of intervals, merge all overlapping intervals.
 *<p></p>
 *
 *
 * Problem Constraints
 * 1 <= Total number of intervals <= 100000.
 *<p></p>
 *
 *
 * Input Format
 * First argument is a list of intervals.
 *<p></p>
 *
 *
 * Output Format
 * Return the sorted list of intervals after merging all the overlapping intervals.
 *<p></p>
 *
 *
 * Example Input
 * Input 1:
 *<p></p>
 * [1,3],[2,6],[8,10],[15,18]
 *<p></p>
 *
 * Example Output
 * Output 1:
 *<p></p>
 * [1,6],[8,10],[15,18]
 *<p></p>
 *
 * Example Explanation
 * Explanation 1:
 *<p></p>
 * Merge intervals [1,3] and [2,6] -> [1,6].
 * so, the required answer after merging is [1,6],[8,10],[15,18].
 * No more overlapping intervals present.
 */

public class MergeOverlappingIntervals {


    public static ArrayList<Interval> mergeList(ArrayList<Interval> intervals) {
        ArrayList<Interval> finalList = new ArrayList<>();
        intervals.sort((i1, i2) -> i1.start - i2.start == 0 ? i1.end - i2.end : i1.start - i2.start);


        int current_start = intervals.get(0).start, current_end = intervals.get(0).end;
        for(int i = 1; i < intervals.size(); i++){
            if(current_end >= intervals.get(i).start || current_start <= intervals.get(i).end){
                current_start = Math.min(current_start, intervals.get(i).start);
                current_end = Math.max(current_end, intervals.get(i).end);
            } else {
                finalList.add(new Interval(current_start, current_end));
                current_start = intervals.get(i).start;
                current_end = intervals.get(i).end;
            }
        }
        finalList.add(new Interval(current_start, current_end));
        return finalList;
    }




    public static class Interval{
        public final int start;
        public final int end;
        public Interval(int start, int end){
            this.start = start;
            this.end = end;
        }

        @Override
        public String toString() {
            return "Account{" +
                    "start='" + start + '\'' +
                    ", end='" + end + '\'' +
                    '}';
        }
    }
}


