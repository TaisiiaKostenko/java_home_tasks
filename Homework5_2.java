package Classwork5;

import java.util.Arrays;
import java.util.Scanner;

public class Homework5_2 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите размер массива ");

        int number = sc.nextInt();

        int[] arrayInt = createArrayInt(number);

        System.out.println("Ваш массив " + Arrays.toString(arrayInt));
        System.out.println("Количество нечетных элементов массива "  + numberAmountOfOddElements(arrayInt)[1]);
        System.out.println("Сумма нечетных элементов массива " + numberAmountOfOddElements(arrayInt)[0]);
    }


    static int[] createArrayInt(int size){
        if (size < 1){
            return null;
        }
        int[] arrayInt = new int[size];

        for (int i= 0; i<arrayInt.length; i++){
            arrayInt[i] = (int)((Math.random() * 15) -15);
        }

        return arrayInt;
    }
    static int[] numberAmountOfOddElements(int[] array){
        int quantity = 0;
        int sum = 0;
        for(int i =0; i<array.length;i++){
            if (array[i] % 2 != 0 ){
                sum += array[i];
                quantity++;
            }
        }
        int[] Array ={sum,quantity};
        return Array;
    }
}

