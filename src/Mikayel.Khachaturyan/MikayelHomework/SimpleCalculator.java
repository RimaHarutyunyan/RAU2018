package MikayelHomework;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SimpleCalculator{

    public static void main( String args[] ) {

        Scanner s = new Scanner(System.in);
        String line = s.nextLine();
        String pattern1 = "([0-9]*)([ ]*)([/+*-])([ ]*)([0-9]*)";
        pattern1 = "(\\d+)\\s*([/+*-])\\s*(\\d+)";
        String pattern2 = "(sin|cos)([( ]*)([0-9]*)([) ]*)";
        pattern2 = "(sin|cos)\\(\\s*(\\d+)\\s*\\)";


        Pattern r1 = Pattern.compile(pattern1);
        Pattern r2 = Pattern.compile(pattern2);




        Matcher m1 = r1.matcher(line);
        Matcher m2 = r2.matcher(line);


        if (m1.find()) {
            double a = Double.parseDouble(m1.group(1));
            double b = Double.parseDouble(m1.group(5));
            switch (m1.group(3)) {
                case "/": {
                    System.out.println(a / b);
                    return;//break
                }
                case "+": {
                    System.out.println(a + b);
                    return;
                }
                case "-": {
                    System.out.println(a - b);
                    return;
                }
                case "*": {
                    System.out.println(a * b);
                    return;
                }
            }
        }
        else if(m2.find()){
            double c=Double.parseDouble(m2.group(3));
            switch (m2.group(1)){
                case "sin":{
                    System.out.println(Math.sin(c));
                    return;//break
                }
                case "cos":{
                    System.out.println(Math.cos(c));
                    return;
                }

            }
        }
        else{
            System.out.println("Not Parsed");
        }



    }
}