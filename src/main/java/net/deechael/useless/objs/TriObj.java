package net.deechael.useless.objs;

public class TriObj<F, S, T> extends DuObj<F, S> {

    private final T third;

    public TriObj(F first, S second, T third) {
        super(first, second);
        this.third = third;
    }

    public T getThird() {
        return third;
    }

}
