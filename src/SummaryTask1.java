import java.text.DecimalFormat;
import java.util.Scanner;

public class SummaryTask1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float usd_rate;
        DecimalFormat cust_format = new DecimalFormat("#.00");

        System.out.println("Введите курс доллара:");
        usd_rate = scan.nextFloat();

        System.out.println("Введите сумму:");
        System.out.print("Итого: " + cust_format.format(scan.nextFloat() / usd_rate) + " долларов");
    }
}
