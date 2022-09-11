package net.deechael.useless.function.functions;

@FunctionalInterface
public interface FoFunction<FI, S, T, FO, R> {

    R apply(FI first, S second, T third, FO fourth);

}
