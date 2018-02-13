package day2;

public class ArraySamples {

    public static void main(String[] args) {
        int []a = new int[10];
//        int b[] = new int[10];
//        int b[10];
        int[] smallPrimes = { 2, 3, 5, 7, 11, 13 };
        int []smallPrimes2 =  new int[] { 17, 19, 23, 29, 31, 37 };
        int []z = new int[0];
        String []empty = {};

//        String[]s = new String[5];
//        System.out.println(a[9]);
//        System.out.println(s[2]);
//        s.length = 10;




//        for(int item : a){
//            System.out.println(item);
//        }

//        for(int item : a){
//            item = -1;
//        }



        int []b = a;
        b[1] = 100;
        System.out.println(a[1]);
        System.out.println(b[1]);


    }
}
