package net.deechael.useless.function.Functions;

@FunctionalInterface
public interface FoFunction<FI, S, T, FO, R> {

    R apply(FI first, S second, T third, FO fourth);

}
