package net.deechael.useless.function.parameters;

@FunctionalInterface
public interface TriParameter<F, S, T> {

    void apply(F first, S second, T third);

}
