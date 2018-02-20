package MikayelHomework;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Stack;

public class GameSample {

    public static void main(String[] args) {


        Stack<String> a = new Stack<String>();
        Stack<String> b = new Stack<String>();
        Stack<String> c = new Stack<String>();

        Scanner s = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            a.push(s.nextLine());
        }
        hanoi(5, a, b, c);
        System.out.println(c);

    }

    static void hanoi(int n, Stack<String> a, Stack<String> b, Stack<String> c) {
        if(n==1){
            c.push(a.pop());//peek
        }
        else {
            hanoi(n - 1, a, c, b);
            c.push(a.pop());//peek
            hanoi(n - 1, a, c, b);
        }

        if (n != 1) {
            hanoi(n - 1, a, c, b);
        }
        c.push(a.pop());//peek
//        a.pop();
        if (n != 1) {
            hanoi(n - 1, b, a, c);
        }
    }

}