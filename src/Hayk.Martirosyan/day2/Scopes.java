package day2;

public class Scopes {
    public static void main(String[] args) {
        int x = 0;
        {
            int y = x;
//            long x = 1L;
        }
//        String []a = new String[10];
//        for(String item : a){
//
//        }

        String a = "A";
        switch(a){
            case "A":

                break;
            case "B":

        }
//
//        System.out.println(y);
    }
}
