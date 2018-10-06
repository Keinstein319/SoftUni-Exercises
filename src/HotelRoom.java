import java.util.Scanner;

public class HotelRoom {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String month = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());

        double studio = 0;
        double apart = 0;
        double discountstud= 0;
        double discountapart= 0;

        if ((month.equals("May") || (month.equals("October")))) {
            studio = 50;
            apart = 65;
            if (nights > 7 && nights<14) {
                discountstud = 0.05;
            } else if (nights > 14) {
                discountstud=0.3;
            }

        } else if ((month.equals("June") || (month.equals("September")))) {
            studio = 75.20;
            apart = 68.70;
            if (nights>14){discountstud= 0.2;}
        } else if ((month.equals("July") || (month.equals("August")))) {
            studio = 76;
            apart = 77;
        } if (nights>14){
            discountapart=0.1;
        }

        double paidstud=studio*nights-(studio*nights*discountstud);
        double paidapart=apart*nights-(apart*nights*discountapart);

        System.out.printf("Apartment: %.2f lv.", paidapart);
        System.out.printf("\nStudio: %.2f lv.", paidstud);

    }
}