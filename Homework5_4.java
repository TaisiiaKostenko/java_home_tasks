package Classwork5;

import java.util.Arrays;
import java.util.Scanner;

public class Homework5_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите размер массива ");
        int number = sc.nextInt();

        int[] arrayInt = createArrayInt(number);
        System.out.println("Ваш массив--> " + Arrays.toString(arrayInt));

        int[] positiveNumArray = arraysPositiveElem(arrayInt);
        System.out.println("Массив из положительных элементов--> " + Arrays.toString(positiveNumArray));

        int[] negativeNumArray = arraysNegativetiveElem(arrayInt);
        System.out.println("Массив из отрицательных элементов--> " + Arrays.toString(negativeNumArray));

    }
    static int[] createArrayInt(int size){
        if (size < 1){
            return null;
        }
        int[] arrayInt = new int[size];

        for (int i= 0; i<arrayInt.length; i++){
            arrayInt[i] = (int)((Math.random() * 15) - 5);
        }

        return arrayInt;
    }
    static int[] arraysPositiveElem(int[] array) {
        int lengthOfPositiveArray = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                lengthOfPositiveArray++;
            }

        }
        int[] positiveElemArray = new int[lengthOfPositiveArray];
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                positiveElemArray[counter] = array[i];
                counter++;
            }
        }
        return positiveElemArray;
    }
    static int[] arraysNegativetiveElem(int[] array) {
        int lengthOfNegativeArray = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                lengthOfNegativeArray++;
            }

        }
        int[] negativeElemArray = new int[lengthOfNegativeArray];
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                negativeElemArray[counter] = array[i];
                counter++;
            }
        }
        return negativeElemArray;
    }

}
