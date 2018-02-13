package day2;

import java.math.BigDecimal;

public class BigNumbers {

    public static void main(String[] args) {

        System.out.println(2.0 - 1.1);

        BigDecimal b1 = new BigDecimal("2.0");//string vs 2.0
        BigDecimal b2 = new BigDecimal("1.1");//vs 1.1

        System.out.println(b2.subtract(b1));
    }
}
