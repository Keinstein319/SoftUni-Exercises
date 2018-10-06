import java.util.Scanner;

public class WorldRec {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double record = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double speed = Double.parseDouble(scanner.nextLine());

        double ivancho = distance * speed;
        double resist = ivancho + (Math.floor(distance / 15)) * 12.5;

        if (record > resist) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", resist);
        } else if (resist >= record) {
            double remain = resist - record;

            System.out.printf("No, he failed! He was %.2f seconds slower.", remain);
        }
    }
}