package day2;

public class Strings {
    public static void main(String[] args) {
        String s = "hello";
        String s2 = s;
        s2 = s2 + "!";

        System.out.println(s);
        System.out.println(s2);

        //same with other primitive types
//        int x = 10;
//        int y =  x;
//        y++;
//        System.out.println(x);
//        System.out.println(y);

//        f(s, x);
//
//        System.out.println(s);
//        System.out.println(x);


        System.out.println(s=="hello");
        System.out.println(s.equalsIgnoreCase("Hello"));
        System.out.println(s=="");

    }


    static void f(String s, int i){
        s+="!";
        i++;
    }
}
