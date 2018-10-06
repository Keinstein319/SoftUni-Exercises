import java.text.DecimalFormat;
import java.util.Scanner;

public class Choreography {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double steps = Double.parseDouble(scanner.nextLine());
        double ppl = Double.parseDouble(scanner.nextLine());
        double days = Double.parseDouble(scanner.nextLine());

        double stepsperday = Math.ceil(steps/days/steps*100);
        double stepspp =stepsperday/ppl;;

        if (stepsperday<=13){
            System.out.printf("Yes, they will succeed in that goal! %.2f%%.",stepspp);
        }else System.out.printf("No, They will not succeed in that goal! Required %.2f%% steps to be learned per day.", stepspp);
    }
}