package com.epam.classwork3;

public class homeWork3_1 {
    public static void main(String[] arg) {
        int count = 10;

        for (int i = 0; i < count; i++) {
            for (int k = 0; k < i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i =0; i < count; i++) {
            for (int k = 10; k > i; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
