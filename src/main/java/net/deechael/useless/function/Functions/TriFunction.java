package net.deechael.useless.function.Functions;

@FunctionalInterface
public interface TriFunction<F, S, T, R> {

    R apply(F first, S second, T third);

}
