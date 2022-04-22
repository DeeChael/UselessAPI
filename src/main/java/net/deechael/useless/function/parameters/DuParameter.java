package net.deechael.useless.function.parameters;

@FunctionalInterface
public interface DuParameter<F, S> {

    void apply(F first, S second);

}
