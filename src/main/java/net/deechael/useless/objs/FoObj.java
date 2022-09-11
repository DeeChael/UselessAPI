package net.deechael.useless.objs;

import lombok.Getter;
import lombok.Setter;

public class FoObj<FI, S, T, FO> extends TriObj<FI, S, T> {

    @Getter
    @Setter
    private final FO fourth;

    public FoObj(FI first, S second, T third, FO fourth) {
        super(first, second, third);
        this.fourth = fourth;
    }

}
