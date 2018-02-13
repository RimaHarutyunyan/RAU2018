package day2;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Scanner;

public class IOSample2 {

    public static void main(String[] args) throws IOException {

//        System.out.println(Paths.get("myfile.txt").toUri());
        Scanner in = new Scanner(Paths.get("day2.IOSample2.txt"), "UTF-8");
        int a = in.nextInt();
        int b = in.nextInt();
        PrintWriter out = new PrintWriter("day2.IOSample2-out.txt", "UTF-8");
        out.println(a+b);
        out.close();//!!
    }
}
