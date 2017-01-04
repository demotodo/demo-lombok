package com.demotodo.example.lombok;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.ToString;

/**
 * Created by bribin.zheng on 2017/1/3.
 */
@Data
public class DataExample {

    private final String name;

    @Setter(AccessLevel.PACKAGE)
    private int age;

    private double score;

    private String[] tags;


    @ToString(includeFieldNames = true)
    @Data(staticConstructor = "of")
    public static class Exercise<T> {
        private final String name;
        private final T value;
    }


    public static void main(String[] args) {
        DataExample example = new DataExample("name");

        Exercise<DataExample> exercise = Exercise.of("name", example);
    }

}
