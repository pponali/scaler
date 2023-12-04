package com.practice.day20;

import java.util.*;
import java.util.stream.IntStream;

public class MergeOverlappingIntervals {

    public static void main(String[] args) {

        List<Interval> intervalList = IntStream.rangeClosed(1,10)
                .mapToObj(value -> new Interval(new Random().nextInt(10), new Random().nextInt(10) + 11)).toList();

        //intervalList.forEach(System.out::println);
        ArrayList<Interval> newList = new ArrayList<>(intervalList);
        newList.add(5, new Interval(4, 4));
        //newList.forEach(System.out::println);
        System.out.println("-=========");
        mergeList(newList).stream().toArray();

        /*ArrayList<Interval> intervalList = new ArrayList<>();
        intervalList.add(new Interval(4,4));
        intervalList.add(new Interval(5,6));
        intervalList.add(new Interval(6,7));
        intervalList.add(new Interval(7,8));
        intervalList.add(new Interval(5,10));
        mergeList(intervalList).forEach(System.out::println);*/


    }

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


