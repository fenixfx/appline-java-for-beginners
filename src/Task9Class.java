import java.util.Scanner;

public class Task9Class {

    public static void main(String[] args){
        int listSize;
        double numListAverage;
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите размер массива:");
        listSize = scan.nextInt();
        if (listSize > 0) {
            double[] numbersList = new double[listSize];
            for (int i = 0; i < listSize; i++) {
                numbersList[i] = scan.nextDouble();
            }
            numListAverage = calcNumListAverage(numbersList);
            for (double el:numbersList) {
                System.out.print(el * numListAverage + "\t");
            }
        } else {
            System.out.println("Введено некорректное число");
        }
        scan.close();
    }

    public static double calcNumListAverage(double[] numbersList) {
        double listAverage=0;
        for (double el:numbersList) {
            listAverage += el;
        }
        return listAverage / numbersList.length;
    }
}
