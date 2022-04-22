package net.deechael.useless.objs;

public class FoObj<FI, S, T, FO> extends TriObj<FI, S, T> {

    private final FO fourth;

    public FoObj(FI first, S second, T third, FO fourth) {
        super(first, second, third);
        this.fourth = fourth;
    }

    public FO getFourth() {
        return fourth;
    }

}
