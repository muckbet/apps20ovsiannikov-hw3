package ua.edu.ucu.smartarr;

// Map every element to another object using MyFunction

import ua.edu.ucu.functions.MyFunction;

import java.util.Arrays;


public class MapDecorator extends SmartArrayDecorator {
    private String operation = "MAP";
    private MyFunction func;


    public MapDecorator(SmartArray smartArray, MyFunction function) {
        super(smartArray);
        func = function;
        map();
    }

    private void map() {
        Object[] array = smartArray.toArray();
        Object[] modifiedArr = Arrays.stream(array).map(
                s -> func.apply(s)).toArray();
        smartArray = new BaseArray(modifiedArr, operation);
    }

    @Override
    public Object[] toArray() {
        return Arrays.copyOf(smartArray.toArray(), smartArray.size());
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
