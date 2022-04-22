package net.deechael.useless.objs;

public class DuObj<F, S> extends Obj<F> {

    private final S second;

    public DuObj(F first, S second) {
        super(first);
        this.second = second;
    }

    public S getSecond() {
        return second;
    }

}
