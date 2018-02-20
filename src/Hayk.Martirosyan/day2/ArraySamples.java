package day2;

import java.util.Arrays;

public class ArraySamples {

    public static void main(String[] args) {
        int[] a = new int[10];
//        int b[] = new int[10];
//        int b[10];
        int[] smallPrimes = {2, 3, 5, 7, 11, 13};
        int[] smallPrimes2 = new int[]{17, 19, 23, 29, 31, 37};
        int[] z = new int[0];
        String[] empty = {};

        String[]s = new String[5];
//        System.out.println(s[9]);
        System.out.println(s[2]);
//        s.length = 10;



        for(int item : a){
            item = -1;
        }

//        for(int item : a){
//            System.out.println(item);
//        }

        int[] b = a;
        b[1] = 100;
        System.out.println(a[1]);
        System.out.println(b[1]);

        int[][] a2 = new int[2][];
        a2[0] = new int[]{1, 2};
        a2[1] = new int[]{3, 4, 5};
        System.out.println(Arrays.deepToString(a2));
//
//        a2 = new int[2][3];
//        System.out.println(Arrays.deepToString(a2));
    }
}
