package com.demotodo.example.lombok;

import lombok.Cleanup;

import java.io.*;

/**
 * Created by bribin.zheng on 2017/1/3.
 */
public class CleanupExample {

    public static void main(String[] args) throws IOException {
        @Cleanup InputStream in = new FileInputStream(args[0]);
        @Cleanup OutputStream out = new FileOutputStream(args[1]);
        byte[] b = new byte[10000];
        while (true) {
            int r = in.read(b);
            if (r == -1) break;
            out.write(b, 0, r);
        }

        //TODO why 'Cleanup' generate 'if(Collections.singletonList(out).get(0) != null)' ??
    }

}
