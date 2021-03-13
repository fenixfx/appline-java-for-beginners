import java.util.Scanner;

public class Task11Class {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String inp_str;

        System.out.println("Введите первое число:");
        inp_str = Float.toString(scan.nextFloat());

        System.out.println("Введите второе число:");
        int inp_int = (int) scan.nextFloat();

        System.out.println("Большее число: " + (Float.parseFloat(inp_str) >= inp_int ? inp_str : inp_int));
        System.out.println("Меньшее число: " + Double.parseDouble(Float.parseFloat(inp_str) <= inp_int ? inp_str : String.valueOf(inp_int)));
        scan.close();
    }
}
