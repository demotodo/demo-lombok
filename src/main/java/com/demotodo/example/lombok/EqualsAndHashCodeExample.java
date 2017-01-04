package com.demotodo.example.lombok;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by bribin.zheng on 2017/1/3.
 */
@EqualsAndHashCode(exclude = {"id", "shape"})
public class EqualsAndHashCodeExample {

    private transient int transientVar = 10;
    private String name;
    private double score;
    private Shape shape = new Square(5, 10);
    private String[] tags;
    private int id;

    public String getName() {
        return this.name;
    }

    @Getter
    @Setter
    @EqualsAndHashCode
    static class Shape {
        private String name;
    }

    @EqualsAndHashCode(callSuper = true)
    public static class Square extends Shape {
        private final int width, height;

        public Square(int width, int height) {
            this.width = width;
            this.height = height;
        }
    }

}
