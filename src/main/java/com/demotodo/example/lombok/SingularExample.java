package com.demotodo.example.lombok;

import lombok.Builder;
import lombok.Singular;

import java.util.Collection;
import java.util.Set;
import java.util.SortedMap;

/**
 * Created by bribin.zheng on 2017/1/4.
 */
@Builder
public class SingularExample<T extends Number> {

    @Singular
    private Set<String> occupations;

    // @Singular("axis")
    // private ImmutableList<String> axes;      // guava

    @Singular
    private SortedMap<Integer, T> elves;

    @Singular
    private Collection<?> minutiae;


    public static void main(String[] args) {
        SingularExample example = SingularExample.builder()
            .occupation("o1")
            .occupation("o2")
            .elf(1, 1)
            .elf(2, 2)
            .minutia(new Object())
            .build();
    }

}
