package net.deechael.useless.function.parameters;

@FunctionalInterface
public interface Parameter<O> {

    void apply(O object);

}
