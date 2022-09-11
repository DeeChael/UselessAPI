package net.deechael.useless.objs;

import lombok.Getter;
import lombok.Setter;

public class TriObj<F, S, T> extends DuObj<F, S> {

    @Getter
    @Setter
    private final T third;

    public TriObj(F first, S second, T third) {
        super(first, second);
        this.third = third;
    }

}
