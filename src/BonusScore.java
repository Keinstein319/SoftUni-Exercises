import java.util.Scanner;

public class BonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        double bonus1 = 0;
        double bonus2 = 0;
        if (num1>1000){
            bonus1 = bonus1 + (0.1 * num1);

        }else if (num1>100 & num1<1000){

          bonus1 = bonus1 + (0.2 * num1);

        }else if (num1 <= 100) {
               bonus1 = bonus1 + 5;
        }

        if (num1%2==0) {
                bonus2 = bonus2 + 1;
            } else if (num1%5==0){
                bonus2= bonus2+2;

            }

        System.out.println(bonus1+ bonus2);
        System.out.println(num1+bonus1+bonus2);
        }



    }
