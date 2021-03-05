import java.util.Scanner;

public class Task4Class {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x, y, z;
        x = scan.nextInt();
        y = scan.nextInt();
        z = scan.nextInt();
        int res = (x + y + z) / 3;
        String answer = res > 3 ? res + "\nПрограмма выполнена корректно" : "" + res;
        System.out.println(answer);
        scan.close();
    }
}