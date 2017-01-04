package com.demotodo.example.lombok;

import lombok.extern.java.Log;

/**
 * Created by bribin.zheng on 2017/1/4.
 */
@Log(topic = "logger-name")
public class LogExample {

    public static void main(String... args) {
        LOG.warning("Something's wrong here");
    }

}
