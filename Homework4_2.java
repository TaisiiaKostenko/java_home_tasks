package classwork4;
import java.util.Scanner;
public class Homework4_2 {
    public static void toBinaryString(int a) {
        String s = "";
        while (a > 0)
        {
            s =  ( (a % 2 ) == 0 ? "0" : "1") + s;
            a = a / 2;
        }
        System.out.println(s);
    }
    public static void main(String[] args) {
        int a = 24;
        toBinaryString(a);
    }
}
