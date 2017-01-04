package com.demotodo.example.lombok;

import lombok.Builder;
import lombok.Singular;
import lombok.ToString;

import java.util.Set;

/**
 * Created by bribin.zheng on 2017/1/4.
 */
@Builder(toBuilder = true)
@ToString
public class BuilderExample {

    private String name;
    private int age;

    @Singular
    private Set<String> occupations;


    public static void main(String[] args) {
        BuilderExample example = BuilderExample.builder()
            .name("name")
            .age(20)
            .occupation("1")
            .occupation("2")
            .build();

        BuilderExampleBuilder builderExampleBuilder = example.toBuilder();

        BuilderExample example2 = builderExampleBuilder.build();

        System.out.println(example);
        System.out.println(example2);
    }

}
