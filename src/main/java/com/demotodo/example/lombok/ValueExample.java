package com.demotodo.example.lombok;

import lombok.AccessLevel;
import lombok.ToString;
import lombok.Value;
import lombok.experimental.NonFinal;
import lombok.experimental.Wither;

/**
 * Created by bribin.zheng on 2017/1/3.
 */
@Value
public class ValueExample {

    String name;
    @Wither(AccessLevel.PACKAGE)
    @NonFinal
    int age;
    double score;
    protected String[] tags;

    @ToString(includeFieldNames = true)
    @Value(staticConstructor = "of")
    public static class Exercise<T> {
        String name;
        T value;
    }

}
