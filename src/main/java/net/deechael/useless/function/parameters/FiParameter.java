package net.deechael.useless.function.parameters;

@FunctionalInterface
public interface FiParameter<FIR, S, T, FO, FIF> {

    void apply(FIR first, S second, T third, FO fourth, FIF fifth);

}
