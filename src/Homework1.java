import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//https://pastebin.com/dzunXn7B
        String flower = scanner.nextLine();
        int number = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double roza = 5;
        double dali = 3.80;
        double lale = 2.80;
        double narcis = 3;
        double gladi = 2.50;

        double remain = 0;

        switch (flower) {
            case "Roses":
                remain = (budget - (number * roza));

                if (number > 80) {
                    remain = (budget - ((number * roza) - 0.1 * (number * roza)));

                }
                if (remain >= 0) {
                    System.out.printf("Hey, you have a great garden with %d Roses and %.2f leva left.", number, remain);
                } else if (remain < budget) {
                    System.out.printf("Not enough money, you need %.2f leva more.", Math.abs(remain));
                }
                break;
            case "Dahlias":
                remain = (budget - (number * dali));

                if (number > 90) {
                    remain = (budget - ((number * dali) - 0.15 * (number * dali)));

                }
                if (remain >= 0) {
                    System.out.printf("Hey, you have a great garden with %d Dahlias and %.2f leva left.", number, remain);
                } else if (remain < budget) {
                    System.out.printf("Not enough money, you need %.2f leva more.", Math.abs(remain));
                }
                break;
            case "Tulips":
                remain = (budget - (number * lale));

                if (number > 80) {
                    remain = (budget - ((number * lale) - 0.15 * (number * lale)));

                }
                if (remain >= 0) {
                    System.out.printf("Hey, you have a great garden with %d Tulips and %.2f leva left.", number, remain);
                } else if (remain < budget) {
                    System.out.printf("Not enough money, you need %.2f leva more.", Math.abs(remain));
                }
                break;
            case "Narcissus":
                remain = (budget - (number * narcis));

                if (number < 120) {
                    remain = (budget - ((number * narcis) + 0.15 * (number * narcis)));

                }
                if (remain >= 0) {
                    System.out.printf("Hey, you have a great garden with %d Narcissus and %.2f leva left.", number, remain);
                } else if (remain < budget) {
                    System.out.printf("Not enough money, you need %.2f leva more.", Math.abs(remain));
                }
                break;
            case "Gladiolus":
                remain = (budget - (number * gladi));

                if (number < 80) {
                    remain = (budget - ((number * gladi) + 0.2 * (number * gladi)));

                }
                if (remain >= 0) {
                    System.out.printf("Hey, you have a great garden with %d Gladiolus and %.2f leva left.", number, remain);
                } else if (remain < budget) {
                    System.out.printf("Not enough money, you need %.2f leva more.", Math.abs(remain));
                }
                break;


        }
    }
}
