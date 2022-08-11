import java.lang.Math;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Ievadi skaitli x");
        int x = scan.nextInt();
        System.out.println("Ievadi skaitli y");
        int y = scan.nextInt();
        System.out.println("Izvēlies matemātisko darbību");

        String mathOp = scan.next();

        switch (mathOp) {
            case "+":
                System.out.println ("Rezultāts ir "+  sum(x, y));
                break;
            case "-":
                System.out.println ("Rezultāts ir "+  atn(x, y));
                break;
            case "*":
                System.out.println ("Rezultāts ir "+  reiz(x, y));
                break;
            case "/":
                System.out.println ("Rezultāts ir "+  dal(x, y));
                break;
            default: System.out.println ("Izvēlētā matemātiskā darbība nav pieejama vai neeksistē!!!");

        };



    };

    public static int sum(int x, int y) {
        return x + y;
    }
    public static int atn(int x, int y) {
        return x - y;
    }
    public static int reiz(int x, int y) {
        return x * y;
    }
    public static int dal(int x, int y) {
        return x / y;
    }

}
