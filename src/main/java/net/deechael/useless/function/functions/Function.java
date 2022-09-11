package net.deechael.useless.function.functions;

@FunctionalInterface
public interface Function<O, R> {

    R apply(O t);

}
