package day2;

import java.util.Arrays;

public class MultidimensionalArrays {
    public static void main(String[] args) {
        int[][] twoDimensionalArray = new int[][]{
                {0, 1},
                {1, 0}
        };

        int [][][]a3d = new int [2][3][4];

//        System.out.println(Arrays.deepToString(twoDimensionalArray));
//        System.out.println(Arrays.deepToString(a3d));

//        int[]tmp = twoDimensionalArray[0];
//        twoDimensionalArray[0] = twoDimensionalArray[1];
//        twoDimensionalArray[1] = tmp;
//
//        System.out.println(Arrays.deepToString(twoDimensionalArray));
        int[][]a2 = new int[2][2];
        a2[0] = new int[10];
        System.out.println(Arrays.deepToString(a2));
    }
}
