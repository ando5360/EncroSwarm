package io.coolshit.encrosync.utils;

public interface BitWiseFunctions {
        default boolean AND(boolean x, boolean y){
            return x & y;
        }
        default boolean OR(boolean x, boolean y){
            return x | y;
        }
        default boolean NOT(boolean x) return !x;}
        default boolean XOR(boolean x, boolean y){
            return x ^ y;
        }
        default boolean NAND(boolean x, boolean y){
            return !(x & y);
        }
        default boolean NOR(boolean x, boolean y){
            return !(x | y);
        }
        default boolean XNOR(boolean x, boolean y){
            return x == y;
        };
}
