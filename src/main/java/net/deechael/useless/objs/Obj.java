package net.deechael.useless.objs;

import lombok.Getter;
import lombok.Setter;

public class Obj<O> {

    @Getter
    @Setter
    private final O object;

    public Obj(O object) {
        this.object = object;
    }

}
