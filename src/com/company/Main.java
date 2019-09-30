package com.company;
import java.util.Scanner;

public class Main {

    public static int[] getArr(){
        //Set up for User input//
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter five random numbers to place in array: ");
        String input = sc.nextLine();
        String[] stringArr = input.split(" ");
        int maxSize = 5;
        //final int SIZE = stringArr.length;
        int[] intArr = new int[maxSize];

        //populate array in sequence//
        for (int i = 0; i < maxSize; i++){
            intArr[i] = Integer.parseInt(stringArr[i]);
        }
        sc.close();
        return intArr;
    }

    public static void printArr(int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.println("Element #: " + arr + ") " + arr[i]);
        }

    }

    public static void main(String[] args) {
        int[] myArr = getArr();
        int search;
        int size = 0;
        int choice;
        System.out.println("Choose an operation from the list below and enter the corresponding number to initiate");
        System.out.println("********** List of Operations **********");
        System.out.println("1: Linear Search");
        System.out.println("2: Binary Search");
        System.out.println("3: Bubble Sort");
        System.out.println("4: Selection Sort");
        System.out.println("5: Insertion Sort");
        System.out.println("*****************************************");
        Scanner sc = new Scanner(System.in);
        choice = sc.nextInt();
        sc.close();
        switch(choice){
            case 1:
                System.out.println("What integer value are you searching for?");
                Scanner ls = new Scanner(System.in);
                search = ls.nextInt();
                ls.close();
                Searcher l = new Searcher();
                l.linearSearch(myArr, size, search);
                break;
            case 2:
                System.out.println("What integer value are you searching for?");
                Scanner bis = new Scanner(System.in);
                search = bis.nextInt();
                bis.close();
                Searcher bi = new Searcher();
                bi.binarySearch(myArr, size, search);
                break;
            case 3:
                size = myArr.length;
                System.out.println("What integer value are you searching for?");
                Scanner bs = new Scanner(System.in);
                bs.close();
                Sorter b = new Sorter();
                b.bubbleSort(myArr, size);
                break;
            case 4:
                size = myArr.length;
                System.out.println("What integer value are you searching for?");
                Scanner ss = new Scanner(System.in);
                ss.close();
                Sorter s = new Sorter();
                s.selectionSort(myArr, size);
                break;
            case 5:
                size = myArr.length;
                System.out.println("What integer value are you searching for?");
                Scanner is = new Scanner(System.in);
                is.close();
                Sorter i = new Sorter();
                i.insertionSort(myArr, size);
                break;
            default:
                System.out.println("Sorry, value not identified.");
        }
    }
}
