package com.company;
import java.util.Scanner;

public class Searcher {

    public int linearSearch(int arr[], int arrSize, int searchVal){
        int i = 0;
        arrSize = arr.length;
        Scanner ls = new Scanner(System.in);
        System.out.println("Enter the value you're searching for: ");
        searchVal = ls.nextInt();
        ls.close();
        while( i < arrSize){
            if(arr[i] == searchVal){
                return arr[i];
            }
            i++;
        }
        return -1;
    }

    public int binarySearch(int arr[], int arrSize, int searchVal) {
        int start, end, mid;
        start = 0;
        end = arrSize - 1;
        while (start <= end) {
            mid = (start + end) / 2;
            if (searchVal == arr[mid]) {
                return mid;
            } else if (searchVal < arr[mid]) {
                end = mid - 1;
            } else if (searchVal > arr[mid]) {
                start = mid + 1;
            }
        }
        return -1;
    }

}
