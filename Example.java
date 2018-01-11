import java.util.Scanner;
import java.util.Random;

class Example {
    public static void main(String[] args){
        // for (String str : args) {
        //     System.out.println(str);
        // }

        // int n = Integer.parseInt(args[0]);
        // double a = Double.parseDouble(args[2]);

        // Scanner scanner = new Scanner(System.in);

        // System.out.println("type a number boi");
        // double x = scanner.nextDouble();
        // System.out.println("You typed " + x);

        Random r = new Random();
        boolean a = true;

        while (a) {
            int z = r.nextInt(999999999) + 1;
            System.out.println(z);
        }

    }
}