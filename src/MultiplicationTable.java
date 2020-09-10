import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число для умножения: ");
        int res = scanner.nextInt();
        System.out.println(res + "*" + 1 + "=" + res*1);
        System.out.println(res + "*" + 2 + "=" + res*2);
        System.out.println(res + "*" + 3 + "=" + res*3);
        System.out.println(res + "*" + 4 + "=" + res*4);
        System.out.println(res + "*" + 5 + "=" + res*5);
        System.out.println(res + "*" + 6 + "=" + res*6);
        System.out.println(res + "*" + 7 + "=" + res*7);
        System.out.println(res + "*" + 8 + "=" + res*8);
        System.out.println(res + "*" + 9 + "=" + res*9);
        System.out.println(res + "*" + 10 + "=" + res*10);
    }
}
