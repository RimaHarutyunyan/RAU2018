package day2;

public class StringBuilders {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        String s = "";
        for (int i=0; i<70_000; i++){
            s+="a";
        }
        System.out.printf("%,d ms\n", System.currentTimeMillis()-start);

        start = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<70_000; i++){
            sb.append("a");
        }
        s = sb.toString();
        System.out.printf("%,d ms\n", System.currentTimeMillis()-start);
    }

}
