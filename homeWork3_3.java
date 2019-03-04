package com.epam.classwork3;

public class homeWork3_3 {
    public static void main(String[] arg) {

        int rows = 10;
        {
            for (int i = 0; i < rows; i++) {

                for (int j = 0; j < rows - i; j++) {

                    System.out.print(" ");
                }
                for (int j = 0; j < i; j++) {

                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}