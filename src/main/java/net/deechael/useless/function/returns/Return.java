package net.deechael.useless.function.returns;

import net.deechael.useless.objs.Obj;

@FunctionalInterface
public interface Return<O> {

    Obj<O> apply();

}
