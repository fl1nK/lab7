package com.company;

public class DataProcess {
    private final Sorter sorter;
    private final ArrayPrint print;

    public DataProcess(Sorter sorter, ArrayPrint print) {
        this.sorter = sorter;
        this.print = print;
    }

    public void process(double[] array) {
        sorter.sort(array);
        print.print(array);
    }
}
