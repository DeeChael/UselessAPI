package net.deechael.useless.objs;

public class Obj<O> {

    private final O object;

    public Obj(O object) {
        this.object = object;
    }

    public O getFirst() {
        return this.object;
    }

}
