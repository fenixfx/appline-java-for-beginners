import java.util.Scanner;

public class Task5Class {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x, y;
        double res;
        String op;
        x = scan.nextInt();
        y = scan.nextInt();
        op = scan.next();
        if (y == 0 & op.equals("/")) {
            System.out.println("Деление на 0!");
        } else {
            switch (op){
                case "+":
                    res = x + y;
                    break;
                case "-":
                    res = x - y;
                    break;
                case "*":
                    res = x * y;
                    break;
                case "/":
                    res = (double) x / y;
                    break;
                default: res = 0;
            }
            System.out.println(res);
        }
        scan.close();
    }
}
