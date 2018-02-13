package day2;

import java.util.Scanner;

public class IOSample {
    enum Operator {PLUS, MINUS, POWER}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input command ");
        String command = in.nextLine();

        System.out.print("Input a ");
        int a = in.nextInt();
        System.out.print("Input b ");
        int b = in.nextInt();


        Operator operator = Operator.valueOf(command);
        int result;
        switch (operator){
            case PLUS:
                result = a+b;
                break;
            case MINUS:
                result = a-b;
                break;
            case POWER:
                result = (int) Math.pow(a, b);
                break;
            default:
                throw new IllegalArgumentException(String.format("Unsupported operator %s", operator));
        }
//        System.out.println("result=" + result);
        System.out.println(String.format("result=%,d", result));



    }
}
