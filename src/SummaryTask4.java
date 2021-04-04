import java.util.Scanner;

public class SummaryTask4 {
    public static void main(String[] args) {
        int attempts_executed = 0;
        System.out.println("Загадка:\nСидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает");
        while (attempts_executed < 3){
            String answer = new Scanner(System.in).nextLine();
            if (answer.equals("Заархивированный вирус")) {
                System.out.println("Правильно!");
                break;
            }  else if (attempts_executed == 0 && answer.equals("Подсказка")) {
                System.out.println("Не ешь, подумой!");
                attempts_executed = 2;
            } else if (answer.equals("Подсказка")) {
                System.out.println("Подсказка не доступна");
            } else if (attempts_executed == 2){
                System.out.println("Обидно, приходи в другой раз!");
                break;
            } else {
                System.out.println("Подумай еще!");
                attempts_executed++;
            }
        }
    }
}
