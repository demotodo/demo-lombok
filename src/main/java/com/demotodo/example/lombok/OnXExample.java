package com.demotodo.example.lombok;

/**
 * Created by bribin.zheng on 2017/1/3.
 */
// @AllArgsConstructor(onConstructor = @__(@Inject))    // no configured dependency, so comment it for now
public class OnXExample {

    // @Getter(onMethod = @__({@Id, @Column(name = "unique-id")}))
    // @Setter(onParam = @__(@Max(10000)))
    private long unid;

}
