package net.deechael.useless.function.returns;

import net.deechael.useless.objs.FoObj;

@FunctionalInterface
public interface FoReturn<FI, S, T, FO> {

    FoObj<FI, S, T, FO> apply();

}
