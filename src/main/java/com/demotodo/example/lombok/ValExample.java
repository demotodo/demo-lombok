package com.demotodo.example.lombok;

import lombok.val;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by bribin.zheng on 2017/1/3.
 */
public class ValExample {

    public String example() {
        val example = new ArrayList<String>();
        example.add("Hello, World!");
        val foo = example.get(0);
        return foo.toLowerCase();

    }

    public void example2() {
        val map = new HashMap<Integer, String>();
        map.put(0, "zero");
        map.put(5, "five");
        for (val entry : map.entrySet()) {
            System.out.printf("%d: %s\n", entry.getKey(), entry.getValue());
        }
    }

}
