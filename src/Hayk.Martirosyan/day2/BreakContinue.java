package day2;

public class BreakContinue {
    public static void main(String[] args) {

        outerLoop:
        for(int i=0; ; i++){

            for (int j=0; j<10; j++){

                if(i==10)
                    break outerLoop;
                if(j>=i){
                    System.out.println();
                    continue outerLoop;
                }
                System.out.print('*');

            }


        }
    }
}
