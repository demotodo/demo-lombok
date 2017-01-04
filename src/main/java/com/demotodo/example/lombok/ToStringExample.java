package com.demotodo.example.lombok;

import lombok.ToString;

/**
 * Created by bribin.zheng on 2017/1/3.
 */
@ToString(exclude = "id")
public class ToStringExample {

    private static final int STATIC_VAR = 10;

    private String name;

    private Shape shape = new Square(5, 10);

    private String[] tags;

    private int id;

    public ToStringExample(String[] tags) {
        this.tags = tags;
    }

    static class Shape {
        @Override
        public String toString() {
            return "Shape{}";
        }
    }


    @ToString(callSuper = true, includeFieldNames = true)
    public static class Square extends Shape {
        private final int width, height;

        public Square(int width, int height) {
            this.width = width;
            this.height = height;
        }
    }


    public static void main(String[] args) {
        ToStringExample example = new ToStringExample(new String[]{"a", "b"});

        System.out.println(example);
    }

}
