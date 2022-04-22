package net.deechael.useless.function.returns;

import net.deechael.useless.objs.FiObj;

@FunctionalInterface
public interface FiReturn<FIR, S, T, FO, FIF> {

    FiObj<FIR, S, T, FO, FIF> apply();

}
