package com.company;

public class InsertionSort implements Sorter {
    @Override
    public void sort(double[] arr) {
        System.out.println("Insertion Sort");

        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            double key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] < key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}
