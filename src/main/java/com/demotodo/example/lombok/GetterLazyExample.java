package com.demotodo.example.lombok;

import lombok.Getter;

/**
 * Created by bribin.zheng on 2017/1/3.
 */
public class GetterLazyExample {

    @Getter(lazy = true)
    private final double[] cached = expensiveOperation();

    private double[] expensiveOperation() {
        double[] result = new double[1000000];
        for (int i = 0; i < result.length; i++) {
            result[i] = Math.asin(i);

        }
        return result;
    }

    public static void main(String[] args) {
        GetterLazyExample example = new GetterLazyExample();

        example.getCached();

    }

}
