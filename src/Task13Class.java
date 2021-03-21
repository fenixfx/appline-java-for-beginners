import java.util.Scanner;

public class Task13Class {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите строку:");
        String input_string = scan.nextLine();
        int latin_word_counter = 0;

        for (String word:input_string.split(" ")) {
            if (word.matches("[A-Za-z]+")) {
                System.out.println(word);
                latin_word_counter++;
            }
        }
        System.out.println("Слов состоящих из латиницы в строке: " + latin_word_counter);
    }
}
