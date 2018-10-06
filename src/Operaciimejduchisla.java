import java.util.Scanner;

public class Operaciimejduchisla {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        String op = scanner.nextLine();

        int result = 0;


        switch (op) {
            case "+":
                result = n1 + n2;
                String evenodd = "a";
                if ((n1 + n2) % 2 == 0) {
                    evenodd = "even";

                } else evenodd = "odd";
                System.out.println(n1 + " " + op + " " + n2 + " = " + result + " - " + evenodd);
                break;
            case "-":
                result = n1 - n2;
                String evenodd1 = "a";
                if ((n1 - n2) % 2 == 0) {
                    evenodd1 = "even";

                } else evenodd1 = "odd";
                System.out.println(n1 + " " + op + " " + n2 + " = " + result + " - " + evenodd1);
                break;
            case "*":
                result = n1 * n2;
                String evenodd3 = "a";
                if ((n1 * n2) % 2 == 0) {
                    evenodd3 = "even";

                } else evenodd3 = "odd";
                System.out.println(n1 + " " + op + " " + n2 + " = " + result + " - " + evenodd3);
                break;
            case "/":
                if (n2 == 0) {
                    System.out.println("Cannot divide " + n1 + " by zero");
                } else {

                double result1 = n1 / 1.0 / n2;

                System.out.printf("%d / %d = %.2f", n1, n2, result1);}
                break;
            case "%":
                if (n2 == 0) {
                    System.out.println("Cannot divide " + n1 + " by zero");
                } else {
                    result = n1 % n2;

                    System.out.println(n1 + " " + op + " " + n2 + " = " + result);
                }
        }

    }

}
