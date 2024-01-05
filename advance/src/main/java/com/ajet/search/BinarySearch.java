package com.ajet.search;

public class BinarySearch {

    public static void main(String[] args) {

        BinarySearch binarySearch = new BinarySearch();
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 5;
        System.out.println(binarySearch.binarySearchInt(arr, target));
        char[] arr2 = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
        char target2 = 'd';
        System.out.println(binarySearch.binarySearchChar(arr2, target2));
    }

    public int binarySearchChar(char[] arr, char target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    public int binarySearchInt(int[] arr, int target) {

        int left = 0; int right = arr.length - 1;

        while(left <= right) {
            int mid = left + (right - left) /2;
            if(arr[mid] == target) {
                return mid;
            }
            if(arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;

    }

    public int binarySearchInt2(int arry[], int target) {
        int left = 0; int right = arry.length -1;
        while(left <= right) {

            int mid = left + right / 2;
            if(arry[mid] == target) {
                return mid;
            }
            if(arry[mid] < target) {
                left = mid  + 1;
            } else {
                mid = right - 1;
            }

        }
        return  -1;
    }
}




