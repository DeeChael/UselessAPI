package net.deechael.useless.objs;

public class FiObj<FIR, S, T, FO, FIF> extends FoObj<FIR, S, T, FO> {

    private final FIF fifth;

    public FiObj(FIR first, S second, T third, FO fourth, FIF fifth) {
        super(first, second, third, fourth);
        this.fifth = fifth;
    }

    public FIF getFifth() {
        return fifth;
    }

}
