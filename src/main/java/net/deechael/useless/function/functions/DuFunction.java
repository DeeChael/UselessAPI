package net.deechael.useless.function.functions;

@FunctionalInterface
public interface DuFunction<F, S, R> {

    R apply(F first, S second);

}
