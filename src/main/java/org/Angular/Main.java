package org.Angular;

import AST.Array;
import AST.Value;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Array simpleArray = new Array(Arrays.asList(
                new Value(10),
                new Value("Hello"),
                new Value(true)
        ));
        System.out.println(simpleArray);

        Array nestedArray = new Array(Arrays.asList(
                new Value(simpleArray),
                new Value(42)
        ));
        System.out.println(nestedArray);
    }
}
