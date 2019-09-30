package com.company;
public class Sorter {

    public void bubbleSort(int arr[], int arrSize){
        int i, temp, c2, swap;
        swap = 1;
        i = 0;
        while( i < arrSize && swap == 1){
            swap = 0;
            c2 = arrSize - 1;
            while(c2 > i){
                if(arr[c2] < arr[c2 - 1]){
                    temp = arr[c2 - 1];
                    arr[c2 - 1] = arr[c2];
                    arr[c2] = temp;
                    swap = 1;
                }
                c2--;
            }
            i++;
        }
    }

    public void selectionSort(int arr[], int arrSize){
        int i, indexSmall, temp, c2;
        i = 0;
        while(i < arrSize){
            indexSmall = i;
            c2 = i + 1;
            while(c2 < arrSize){
                if(arr[c2] < arr[indexSmall]){
                    indexSmall = c2;
                }
                c2++;
            }
            temp = arr[i];
            arr[i] = arr[indexSmall];
            arr[indexSmall] = temp;
            i++;
        }
    }

    public void insertionSort(int arr[], int arrSize){
        int i, c2, temp;
        i = 0;
        while(i < arrSize){
            temp = arr[i];
            c2 = i;
            while(c2 >= 0 && temp <= arr[c2 -1]){
                arr[c2] = arr[c2 -1];
                c2--;
            }
            arr[c2] = temp;
            i++;
        }
    }


}
