package com.demotodo.example.lombok;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

/**
 * Created by bribin.zheng on 2017/1/3.
 */
public class NonNullExample extends Something {

    @NonNull
    @Getter
    @Setter
    private String name;

    private Person person;
    private String dept;

    public NonNullExample(@NonNull Person person) {
        super("Hello");
        this.name = person.getName();
        this.person = person;
    }

    public NonNullExample(String name) {
        super("World");
        this.name = name;
    }

    @NonNull
    public void setDept(String dept) {
        this.dept = dept;
    }

    public void print() {
        @NonNull
        String result = name + dept;
        // String result = dept;

        System.out.println(result);
    }

}
