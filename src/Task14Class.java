import javax.sound.midi.Soundbank;
import java.util.Random;

public class Task14Class {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] rand_val_arr = new int[15];
        for (int i = 0; i < rand_val_arr.length; i++) {
            rand_val_arr[i] = rand.nextInt(41) - 20;
        }
        System.out.println("Минимальный элемент массива: " + get_arr_min_max_abs(rand_val_arr)[0]);
        System.out.println("Максимальный элемент массива: " + get_arr_min_max_abs(rand_val_arr)[1]);
        System.out.println("Наибольшее значение по модулю: " + get_arr_min_max_abs(rand_val_arr)[2]);
    }

    public static int[] get_arr_min_max_abs(int[] inp_arr){
        int max_val = inp_arr[0];
        int min_val = inp_arr[0];
        int abs_max;
        for (int el:inp_arr) {
            max_val = Math.max(max_val, el);
            min_val = Math.min(min_val, el);
        }
        abs_max = Math.max(Math.abs(max_val), Math.abs(min_val));
        return new int[]{min_val, max_val, abs_max};
    }
}
