package net.deechael.useless.function.returns;

import net.deechael.useless.objs.DuObj;

@FunctionalInterface
public interface DuReturn<F, S> {

    DuObj<F, S> apply();

}
