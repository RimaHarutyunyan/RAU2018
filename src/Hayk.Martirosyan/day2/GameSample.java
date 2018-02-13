package day2;

import java.util.Arrays;
import java.util.Scanner;

public class GameSample {
    public static void main(String[] args) {


        String []a = {"S1", "S2", "S3"};//read items from console!
        String []b = new String[a.length];
        String []c = new String[a.length];

        hanoi(a, b, c);
        System.out.println(Arrays.deepToString(c));
    }




    public static void hanoi(String[]a, String[]b, String[]c) {

    }
    /*
    1.hanoi
    2.count words that has matching oposite

    3.count words that are symetric (polyndrom)
    4.convert strings to oposite
    5.matrix multiplication
    6.calculaor with + - *  / sin cos
    */
}
