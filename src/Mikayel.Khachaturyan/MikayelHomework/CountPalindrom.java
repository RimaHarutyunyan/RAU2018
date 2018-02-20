package MikayelHomework;

import java.util.Scanner;

public class CountPalindrom {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int count = 0;
        String myString = new String();

        for (int i = 0; i < 5; i++) {
//        while(s.has`NextLine()){
            myString = s.nextLine();
            if (isPalindrome(myString)) {
                count++;
            }

        }
        System.out.println(count);

    }

    //formatting
    private static boolean isPalindrome(String s) {
        if (s.length() <= 1) {
            return true;
        }//
        String first = s.substring(0, 1);
        String last = s.substring(s.length() - 1, s.length());//substring(s.length()-1)
        return (first.equals(last)) && isPalindrome(s.substring(1, s.length() - 1));
    }
}
