package day2;

public class Conversions {
    public static void main(String[] args) {
        int i = 10;
        byte b = 20;
        long l = 100L;
        double d = 1.2;
        float f = 1.2f;


        i = b;
//        b = i;
        l = i = b;
//        l = d;
//        f = d;
        d = f;
        f = i;
        d = l;


//        b = (byte)0xFFFF10;
//        System.out.println(b);
        System.out.println(0x7fffffff + 1L);


    }

}
