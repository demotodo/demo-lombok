package com.demotodo.example.lombok;

import lombok.SneakyThrows;

import java.io.UnsupportedEncodingException;

/**
 * Created by bribin.zheng on 2017/1/4.
 */
public class SneakyThrowsExample implements Runnable {

    @SneakyThrows(UnsupportedEncodingException.class)
    public String utf8ToString(byte[] bytes) {
        return new String(bytes, "UTF-8");
    }

    @SneakyThrows
    public void run() {
        throw new Throwable();
    }

}
