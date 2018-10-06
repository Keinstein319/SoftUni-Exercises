import java.util.Scanner;

public class vreme15 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int hours1 = Integer.parseInt(scanner.nextLine());
        int minutes1 = Integer.parseInt(scanner.nextLine());
        minutes1 = (minutes1 + 15);
        int minutes2 = minutes1;

        if (minutes1 >= 60) {
            minutes2 = minutes1 - 60;
            hours1 = hours1 + 1;
        }

        if (hours1 > 23) {
            hours1 = 0;
        }

        if (minutes2 < 10) {
            System.out.println("" + hours1 + ":0" + minutes2);
        } else {
            System.out.println("" + hours1 + ":" + minutes2);
        }
    }
}