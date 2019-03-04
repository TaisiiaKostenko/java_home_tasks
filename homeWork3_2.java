package com.epam.classwork3;

public class homeWork3_2 {
    public static void main(String[] arg) {
        int row = 10;

        for(int i=row; i>=1; i--){
            for(int j=i; j<=row; j++){
                System.out.print(" ");
            }
            for(int j=1; j<i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}

