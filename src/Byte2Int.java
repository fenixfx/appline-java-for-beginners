import java.util.Scanner;

// Задание №4
public class Byte2Int {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите последовательность байт: ");
        Integer res = Integer.parseInt(scanner.nextLine(), 2);
        System.out.print("Получено число в десятичной системе: " + res);
    }
}
