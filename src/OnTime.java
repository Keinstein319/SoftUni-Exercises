import java.util.Scanner;

public class OnTime {
    public static void main(String[] args) {
// https://pastebin.com/RBNE1at8 PASTEBIN LINK
        Scanner scanner = new Scanner(System.in);

        int examhr = Integer.parseInt(scanner.nextLine());
        int exammin = Integer.parseInt(scanner.nextLine());

        int arrivhr = Integer.parseInt(scanner.nextLine());
        int arrivmin = Integer.parseInt(scanner.nextLine());

        int examtotal = examhr * 60 + exammin;
        int arrivtotal = arrivhr * 60 + arrivmin;

        if (arrivtotal > examtotal) {
            double latetime = arrivtotal - examtotal;
            double hrslate = Math.floor(latetime / 60);
            double minlate = latetime % 60;

            System.out.println("Late");
            if (latetime < 60) {

                System.out.printf("%.0f minutes after the start", minlate);
            } else if (minlate<10) {System.out.printf("%.0f:0%.0f hours after the start", hrslate, minlate);}
            else System.out.printf("%.0f:%.0f hours after the start", hrslate, minlate);
        }
        if (arrivtotal <= examtotal && examtotal - arrivtotal <= 30) {
            double latetime = examtotal - arrivtotal;
            double hrslate = latetime / 60;
            double minlate = latetime % 60;
            if (examtotal == arrivtotal) {
                System.out.println("On time");
            } else
                System.out.printf("on time %.0f minutes before the start" , minlate);
        }
        if (arrivtotal < examtotal && examtotal - arrivtotal > 30) {
            double latetime = examtotal - arrivtotal;
            double hrslate = latetime / 60;
            double minlate = latetime % 60;
            System.out.println("Early");
            if (latetime < 60) {

                System.out.printf("%.0f minutes before the start", minlate);
            } else if (minlate < 10) {
                System.out.printf("%.0f:0%.0f hours before the start", hrslate, minlate);
            } else System.out.printf("%.0f:%.0f hours before the start", hrslate, minlate);
        }
    }
}