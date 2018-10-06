import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double budget = Double.parseDouble(scanner.nextLine());
        String category = scanner.nextLine();
        int ppl = Integer.parseInt(scanner.nextLine());

        double price = 0;
        double procent = 0;
        double ticketmoney = 0;
        double remain;

        if (ppl >= 1 && ppl <= 4) {
            procent = 0.75;
        } else if (ppl >= 5 && ppl <= 9) {
            procent = 0.6;
        } else if (ppl >= 10 && ppl <= 24) {
            procent = 0.5;
        } else if (ppl >= 25 && ppl <= 49) {
            procent = 0.4;
        } else if (ppl >= 50) {
            procent = 0.25;
        }

        if (category.equals("VIP")) {
            price = 499.99;
            ticketmoney = (budget - (procent * budget));
            remain =Math.abs( ticketmoney - price * ppl);

            if (ticketmoney > price * ppl) {
                System.out.printf("Yes! You have %.2f leva left.", remain);
            } else if (ticketmoney < price * ppl) {
                System.out.printf("Not enough money! You need %.2f leva.", remain);
            }
        }else if (category.equals("Normal")) {
                price = 249.99;
                ticketmoney = (budget - (procent * budget)) ;
                remain=Math.abs(ticketmoney - price*ppl);

                if (ticketmoney > price*ppl) {
                    System.out.printf("Yes! You have %.2f leva left.", remain);
                } else if (ticketmoney < price*ppl) {
                    System.out.printf("Not enough money! You need %.2f leva.", remain);
                }
        }
    }
}