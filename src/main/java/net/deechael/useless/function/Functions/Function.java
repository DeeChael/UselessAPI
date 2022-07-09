package net.deechael.useless.function.Functions;

@FunctionalInterface
public interface Function<O, R> {

    R apply(O t);

}
