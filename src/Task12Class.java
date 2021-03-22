public class Task12Class {
    public static void main(String[] args) {
        String input_string = "I like Java!!!";
        boolean true_conditions = true;

        if (input_string.contains("Java")) {
            System.out.println("Строка содержит \"Java\"");
        } else true_conditions = false;
        if (input_string.startsWith("I like")) {
            System.out.println("Строка начинается с \"I like\"");
        } else true_conditions = false;
        if (input_string.endsWith("!!!")){
            System.out.println("Строка заканчивается \"!!!\"");
        } else true_conditions = false;
        if (true_conditions) {
            System.out.println(input_string.toUpperCase());
        }
        System.out.println(input_string.replace("a", "o").substring(7, 11));
    }
}
