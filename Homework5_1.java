package Classwork5;

import java.util.Arrays;
import java.util.Scanner;

public class Homework5_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите размер массива ");

        int number = sc.nextInt();

        int[] arrayInt = createArrayInt(number);

        System.out.println("Ваш массив " + Arrays.toString(arrayInt));
        System.out.println("Ваш массив в обратном порядке" + Arrays.toString(arrayReverse(arrayInt)));
    }


    static int[] createArrayInt(int size){
        if (size < 1){
            return null;
        }
        int[] arrayInt = new int[size];

        for (int i= 0; i<arrayInt.length; i++){
            arrayInt[i] = (int)(Math.random() * 15);
        }

        return arrayInt;
    }


    static int[] arrayReverse (int[] array){
        int[] reversedArray = Arrays.copyOf(array,array.length);

        int a = 0;
        for (int i = 0 ; i < ((reversedArray.length) / 2) ; i++){
            a = reversedArray[reversedArray.length - i - 1];
            reversedArray[reversedArray.length - i - 1] = reversedArray[i] ;
            reversedArray[i] = a;
        }

        return reversedArray;


        }
}

