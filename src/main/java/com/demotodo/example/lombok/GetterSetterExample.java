package com.demotodo.example.lombok;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import javax.jws.WebMethod;

/**
 * Created by bribin.zheng on 2017/1/3.
 */
public class GetterSetterExample {

    /**
     * Age of the person. Water is wet.
     *
     * @param age New value for this person's age. Sky is blue.
     * @return The current value of this person's age. Circles are round.
     */
    @Getter
    @Setter
    private int age = 10;

    /**
     * Name of the person.
     * -- SETTER --
     * Changes the name of this person.
     *
     * @param name The new value.
     */
    @Setter(AccessLevel.PROTECTED)
    private String name;

    @Setter(AccessLevel.PRIVATE)
    private String privateName;

    @Setter(AccessLevel.MODULE)     // same as PACKAGE
    private String moduleName;
    @Setter(AccessLevel.PACKAGE)
    private String packageName;

    @Setter(AccessLevel.NONE)       // no setter generated
    private String noneName;

    @Getter(onMethod = @__(@WebMethod))
    @Setter(onMethod = @__(@NonNull), onParam = @__(@NonNull))
    private String desc;

    @Override
    public String toString() {
        return String.format("%s (age: %d)", name, age);
    }

    public static void main(String[] args) {
        GetterSetterExample example = new GetterSetterExample();

        example.setAge(10);     // check generated javadoc
        example.getAge();       // check generated javadoc

        example.setName("abc"); // check generated javadoc, NOTICE: 'SETTER' section is not handled by IDEA now
        // example.getName();   // no this one

    }

}
