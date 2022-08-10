import java.lang.Math;
import java.util.Scanner;
import static java.lang.Double.sum;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Ievadi skaitli x");
        int x = scan.nextInt();
        System.out.println("Ievadi skaitli y");
        int y = scan.nextInt();
        System.out.println("Izvēlies matemātisko darbību");

        String mathOp = scan.nextLine();

        switch (mathOp) {
            case "+":
                sum(x, y);


        }

        int sum = x + y;
        System.out.println("Rezultāts ir " + sum);


    }



    public static int summ(int x, int y) {

        return x + y;
    }

}
