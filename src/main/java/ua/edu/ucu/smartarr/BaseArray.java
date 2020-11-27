package ua.edu.ucu.smartarr;

import java.util.Arrays;

// Base array for decorators
public class BaseArray implements SmartArray {
    private  String operation = "Base Array";
    private Object[] array;


    public BaseArray(Object[] arr) {
        array = Arrays.copyOf(arr, arr.length);
    }

    protected BaseArray(Object[] arr, String arrOperation) {
        array = Arrays.copyOf(arr, arr.length);
        operation = arrOperation;
    }

    @Override
    public Object[] toArray() {
        return Arrays.copyOf(array, array.length);
    }

    @Override
    public String operationDescription() {
        return "Base Array";
    }

    @Override
    public int size() {
        return array.length;
    }
}