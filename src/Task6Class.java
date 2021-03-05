import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class Task6Class {
    public static int MILE_METER_COEFF = 1609;
    public static int FOOT_MILE_COEFF = 5280;
    public static int YARD_MILE_COEFF = 1760;
    public static int YARD_FOOT_COEFF = 3;
    public static double YARD_METER_COEFF = 1.094;
    public static double FOOT_METER_COEFF = 3.281;

    public static double KILO_POUND_COEFF = 2.205;
    public static double KILO_STONE_COEFF = 6.35;
    public static double KILO_UNCIA_COEFF = 35.274;
    public static int STONE_POUND_COEFF = 14;
    public static int STONE_UNCIA_COEFF = 224;
    public static int UNCIA_POUND_COEFF = 16;

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int type, size;
        float value;
        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние");
        type = scan.nextInt();
        switch (type){
            case 1:
                System.out.println("Выберите единицу измерения: 1 - килограмм, 2 - фунт, 3 - стон, 4 - унция");
                size = scan.nextInt();
                System.out.println("Введите число");
                value = scan.nextFloat();
                massFun(size, value);
                break;
            case 2:
                System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
                size = scan.nextInt();
                System.out.println("Введите число");
                value = scan.nextFloat();
                distFun(size, value);
                break;
            default:
                System.out.println("Выбрана некорректная величина");
        }
        scan.close();
    }

    public static void distFun(int size, float value){
        switch (size){
            case 1:
                System.out.println("Метры: " + value);
                System.out.println("Мили: " + value / MILE_METER_COEFF);
                System.out.println("Ярды: " + value * YARD_METER_COEFF);
                System.out.println("Футы: " + value * FOOT_METER_COEFF);
                break;
            case 2:
                System.out.println("Метры: " + value * MILE_METER_COEFF);
                System.out.println("Мили: " + value);
                System.out.println("Ярды: " + value * YARD_MILE_COEFF);
                System.out.println("Футы: " + value * FOOT_MILE_COEFF);
                break;
            case 3:
                System.out.println("Метры: " + value / YARD_METER_COEFF);
                System.out.println("Мили: " + value / YARD_MILE_COEFF);
                System.out.println("Ярды: " + value);
                System.out.println("Футы: " + value / YARD_FOOT_COEFF);
                break;
            case 4:
                System.out.println("Метры: " + value / FOOT_METER_COEFF);
                System.out.println("Мили: " + value / FOOT_MILE_COEFF);
                System.out.println("Ярды: " + value / YARD_FOOT_COEFF);
                System.out.println("Футы: " + value);
                break;
            default:
                System.out.println("Выбрана некорректная единица измерения");
        }
    }

    public static void massFun(int size, float value){
        switch (size){
            case 1:
                System.out.println("Килограммы: " + value);
                System.out.println("Фунты: " + value * KILO_POUND_COEFF);
                System.out.println("Стоны: " + value / KILO_STONE_COEFF);
                System.out.println("Унции: " + value * KILO_UNCIA_COEFF);
                break;
            case 2:
                System.out.println("Килограммы: " + value / KILO_POUND_COEFF);
                System.out.println("Фунты: " + value);
                System.out.println("Стоны: " + value / STONE_POUND_COEFF);
                System.out.println("Унции: " + value * UNCIA_POUND_COEFF);
                break;
            case 3:
                System.out.println("Килограммы: " + value * KILO_STONE_COEFF);
                System.out.println("Фунты: " + value * STONE_POUND_COEFF);
                System.out.println("Стоны: " + value);
                System.out.println("Унции: " + value * STONE_UNCIA_COEFF);
                break;
            case 4:
                System.out.println("Килограммы: " + value / KILO_UNCIA_COEFF);
                System.out.println("Фунты: " + value / UNCIA_POUND_COEFF);
                System.out.println("Стоны: " + value / STONE_UNCIA_COEFF);
                System.out.println("Унции: " + value);
                break;
            default:
                System.out.println("Выбрана некорректная единица измерения");
        }
    }
}
