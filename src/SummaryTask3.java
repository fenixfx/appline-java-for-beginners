import java.util.Scanner;

public class SummaryTask3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int line_count;
        int max_size_line = 0;
        System.out.println("Введите количество строк: ");
        line_count = scan.nextInt();
        String[] str_array = new String[line_count];

        for (int i = 0; i < line_count; i++) {
            System.out.println("Введите строку " + i + ":");
            str_array[i] = scan.next();
            if (getUnique(str_array[i]).length() > getUnique(str_array[max_size_line]).length()) {
                max_size_line = i;
            }
        }
        scan.close();

        System.out.println("Ответ: " + str_array[max_size_line]);
    }
    public static String getUnique (String input_str){
        String result = "";
        for (char character:input_str.toCharArray()) {
            if (!result.contains(String.valueOf(character))) result += character;
        }
        return result;
    }
}
