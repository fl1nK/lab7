package com.company;

public class Main {

    public static void main(String[] args) {

        double[] arr = {10.3, 25.8, 18.3, 8, 37.77, 13.37};

        DataProcess dp = new DataProcess(new SelectionSort(), new RowArrayPrinter());
        dp.process(arr);

        DataProcess dp2 = new DataProcess(new BubbleSort(), new RowArrayPrinter());
        dp2.process(arr);

        DataProcess dp3 = new DataProcess(new InsertionSort(), new RowArrayPrinter());
        dp3.process(arr);



    }
}
