package com.demotodo.example.lombok;

import lombok.*;

/**
 * Created by bribin.zheng on 2017/1/3.
 */
@RequiredArgsConstructor(staticName = "of")
@AllArgsConstructor(access = AccessLevel.PROTECTED)
public class ConstructorExample<T> {

    private int x, y;

    @NonNull
    private T description;


    @NoArgsConstructor
    public static class NoArgsExample {
        @NonNull
        private String field;
    }

}
