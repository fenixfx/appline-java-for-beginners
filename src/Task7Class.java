import java.util.Scanner;

public class Task7Class {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x = 1, y = 2, z = 3, inp;

        System.out.println("Введите размер массива:");
        int [] arr = new int[scan.nextInt()];

        for(int i=0; i < arr.length; i++){
            inp = scan.nextInt();
            if (inp == x || inp == y || inp == z){
                System.out.print("Данное значение имеется в константах");
                break;
            } else {
                System.out.printf("В массив добавлен элемент: %s\n", inp);
                arr[i] = inp;
            }
        }
        scan.close();
    }
}
