import java.util.Scanner;

public class Task8Class {

    public static void main(String[] args){
        int lim, sum = 0, i = 1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите целое положительное число:");
        lim = scan.nextInt();
        if (lim > 0) {
            sum += 1;
            while (i + 2 <= lim){
                i += 2;
                sum += i;
            }
            System.out.print("Сумма всех нечетных чисел: " + sum);
        } else {
            System.out.print("Введено некорректное число");
        }
        scan.close();
    }
}