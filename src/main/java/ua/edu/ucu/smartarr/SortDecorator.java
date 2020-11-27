package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyComparator;
import ua.edu.ucu.functions.MyPredicate;

import java.util.Arrays;

public class SortDecorator extends SmartArrayDecorator {
    MyComparator comporator;

    public SortDecorator(SmartArray smartArray, MyComparator comporator) {
        super(smartArray);
        this.comporator = comporator;
        decorate();
    }

    @Override
    protected void decorate() {
        super.decorate();
        Arrays.sort(this.getArray(), comporator);
    }
}