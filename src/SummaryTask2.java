import java.util.Scanner;

public class SummaryTask2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char[] inp_arr;
        int result;

        System.out.println("Введите уравнение:");
        inp_arr = scan.nextLine().toCharArray();

        if (inp_arr[4] == 'x') {
            result = inp_arr[1] == '+' ? inp_arr[0] + inp_arr[2]:inp_arr[0] - inp_arr[2];
        } else if (inp_arr[0] == 'x') {
            result = inp_arr[1] == '+' ? inp_arr[4] - inp_arr[2]:inp_arr[4] + inp_arr[2];
        } else{
            result = inp_arr[1] == '+' ? inp_arr[4] - inp_arr[0]:inp_arr[0] - inp_arr[4];
        }
        System.out.println("Значние неизвестной x равно: " + result);
    }
}
