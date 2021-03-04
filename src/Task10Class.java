import java.util.Scanner;

public class Task10Class {
    public static void main(String[] args) {
        int rowCount, colCount;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество строк");
        rowCount = scan.nextInt();
        System.out.println("Введите количество столбцов");
        colCount = scan.nextInt();
        if (rowCount > 0 & colCount > 0) {
            int[][] numbers = new int[rowCount][colCount];
            for (int i = 0; i < rowCount; i++) {
                System.out.println("Введите значения для строки " + (i+1));
                for (int j = 0; j < colCount; j++) {
                    numbers[i][j] = scan.nextInt();
                }
            }
            for (int el:numbers[0]) {
                System.out.print(el * 3 + "\t");
            }
        } else {
            System.out.println("Введено некорректное число");
        }
    }
}
