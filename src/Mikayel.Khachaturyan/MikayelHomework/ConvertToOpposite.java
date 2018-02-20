package MikayelHomework;

import java.util.Scanner;

public class ConvertToOpposite {

    //format
    public static void main(String[] args) {

        String myString;//null
        String reverse = "";//""
        Scanner s = new Scanner(System.in);
        myString = s.nextLine();
        for (int i = myString.length(); i >= 1; i--) {
            reverse = reverse + myString.substring(i - 1, i);
        }
        System.out.println(reverse);


    }
}