package com.demotodo.example.lombok;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * Created by bribin.zheng on 2017/1/3.
 */
@Getter
@Setter
@Accessors(fluent = true)
public class AccessorsExample {

    private String firstName;
    private String lastName;

    public static void main(String[] args) {
        AccessorsExample example = new AccessorsExample();

        example.firstName("first")
            .lastName("last");


        AnotherAccessorsExample example2 = new AnotherAccessorsExample();

        example2.setGivenName("first")
            .setFamilyName("last");
    }

    @Getter
    @Setter
    @Accessors(chain = true)
    static class AnotherAccessorsExample {
        private String givenName;
        private String familyName;
    }

}
