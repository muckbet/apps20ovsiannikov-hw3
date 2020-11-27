package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyPredicate;

import java.util.Arrays;



// Tests every element and removes it if it doesn't satisfy MyPredicate
public class FilterDecorator extends SmartArrayDecorator {
    private  String operation = "FILTER";
    private MyPredicate pred;


    public FilterDecorator(SmartArray smartArray, MyPredicate predicate) {
        super(smartArray);
        pred = predicate;
        filter();
    }

    private void filter() {
        Object[] arr = smartArray.toArray();
        Object[] filteredArray = Arrays.stream(arr).filter(
                s -> pred.test(s)).toArray();
        smartArray = new BaseArray(filteredArray, operation);
    }

    @Override
    public Object[] toArray() {
        return smartArray.toArray();
    }

    @Override
    public String operationDescription() {
        return smartArray.operationDescription();
    }

    @Override
    public int size() {
        return smartArray.size();
    }
}