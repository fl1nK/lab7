package com.company;

public class RowArrayPrinter  implements ArrayPrint{
    @Override
    public void print(double[] arr) {

        for(double num: arr)
        {
            System.out.print(num+ " ");
        }
        System.out.println();
    }
}
