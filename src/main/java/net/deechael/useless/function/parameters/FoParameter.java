package net.deechael.useless.function.parameters;

@FunctionalInterface
public interface FoParameter<FI, S, T, FO> {

    void apply(FI first, S second, T third, FO fourth);

}
