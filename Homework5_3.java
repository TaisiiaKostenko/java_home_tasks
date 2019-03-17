package Classwork5;

import java.util.Arrays;
import java.util.Scanner;

public class Homework5_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите размер массива ");

        int number = sc.nextInt();

        int[] arrayInt1 = createArrayInt(number);
        int[] arrayInt2 = createArrayInt(number);

        System.out.println("Ваш первый массив --> " + Arrays.toString(arrayInt1));
        System.out.println("Ваш второй массив --> " + Arrays.toString(arrayInt2));
        System.out.println("Массив-сумма первого и второго--> " + Arrays.toString(arraysSum(arrayInt1, arrayInt2)));

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
    static int[] arraysSum(int[] arrayInt1, int[] arrayInt2) {
        int[] tempArray1 = Arrays.copyOf(arrayInt1, arrayInt1.length);
        int[] tempArray2 = Arrays.copyOf(arrayInt2, arrayInt2.length);
        int[] sumArray = new int[arrayInt1.length];
        for (int i = 0; i < arrayInt1.length; i++) {
            sumArray[i] = arrayInt1[i] + arrayInt2[i];

        }
        return sumArray;
    }

}
