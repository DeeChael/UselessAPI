package net.deechael.useless.function.Functions;

@FunctionalInterface
public interface DuFunction<F, S, R> {

    R apply(F first, S second);

}
