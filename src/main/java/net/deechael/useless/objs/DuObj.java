package net.deechael.useless.objs;

import lombok.Getter;
import lombok.Setter;

public class DuObj<F, S> extends Obj<F> {

    @Getter
    @Setter
    private S second;

    public DuObj(F first, S second) {
        super(first);
        this.second = second;
    }

}
