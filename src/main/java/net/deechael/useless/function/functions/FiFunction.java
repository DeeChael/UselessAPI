package net.deechael.useless.function.functions;

@FunctionalInterface
public interface FiFunction<FIR, S, T, FO, FIF, R> {

    R apply(FIR first, S second, T third, FO fourth, FIF fifth);

}
