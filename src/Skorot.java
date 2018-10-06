import java.util.Scanner;

public class Skorot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double input = Double.parseDouble(scanner.nextLine());
        String inputmetric = scanner.nextLine();
        String outputmetric = scanner.nextLine();

        double number = 0;

        if (inputmetric.equals("mm")) {
            number = input / 1000;
        } else if (inputmetric.equals("km")) {
            number = input / 0.001;
        } else if (inputmetric.equals("m")) {
            number = input / 1;
        } else if (inputmetric.equals("cm")) {
            number = input / 100;
        } else if (inputmetric.equals("mi")) {
            number = input / 0.000621371192;
        } else if (inputmetric.equals("in")) {
            number = input / 39.3700787;
        } else if (inputmetric.equals("ft")) {
            number = input / 3.2808399;
        } else if (inputmetric.equals("yd")) {
            number = input / 1.0936133;
        }
        if (outputmetric.equals("mm")) {
            number = number * 1000;
        } else if (outputmetric.equals("km")) {
            number = number * 0.001;
        } else if (outputmetric.equals("m")) {
            number = number * 1;
        } else if (outputmetric.equals("cm")) {
            number = number * 100;
        } else if (outputmetric.equals("mi")) {
            number = number * 0.000621371192;
        } else if (outputmetric.equals("in")) {
            number = number * 39.3700787;
        } else if (outputmetric.equals("ft")) {
            number = number * 3.2808399;
        } else if (outputmetric.equals("yd")) {
            number = number * 1.0936133;
        }
        System.out.printf("%.8f %s", number, outputmetric);
    }
}