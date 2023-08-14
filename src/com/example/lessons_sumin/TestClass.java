package com.example.lessons_sumin;

/**
 * @author Pekhov A.V.
 * @created 05/09/2021 - 18:07
 */

final public class TestClass {

    final public void test() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        int i, j, k;
        for (i = 0; i < 3; i++) {
            for (j = 1; j < 4; j++) {
                for (k = 2; k < 5; k++) {
                    if((i == j) && (j == k)) {
                        System.out.println(i);
                    }
                }
            }
        }
    }
}