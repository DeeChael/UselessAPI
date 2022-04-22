package net.deechael.useless.function.returns;

import net.deechael.useless.objs.TriObj;

@FunctionalInterface
public interface TriReturn<F, S, T> {

    TriObj<F, S, T> apply();

}
