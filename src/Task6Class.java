import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class Task6Class {
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
    }

    public static void distFun(int size, float value){
        switch (size){
            case 1:
                System.out.println("Метры: " + value);
                System.out.println("Мили: " + value / 1609);
                System.out.println("Ярды: " + value * 1.094);
                System.out.println("Футы: " + value * 3.281);
                break;
            case 2:
                System.out.println("Метры: " + value * 1609);
                System.out.println("Мили: " + value);
                System.out.println("Ярды: " + value * 1760);
                System.out.println("Футы: " + value * 5280);
                break;
            case 3:
                System.out.println("Метры: " + value / 1.094);
                System.out.println("Мили: " + value / 1760);
                System.out.println("Ярды: " + value);
                System.out.println("Футы: " + value / 3);
                break;
            case 4:
                System.out.println("Метры: " + value / 3.281);
                System.out.println("Мили: " + value / 5280);
                System.out.println("Ярды: " + value / 3);
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
                System.out.println("Фунты: " + value * 2.205);
                System.out.println("Стоны: " + value / 6.35);
                System.out.println("Унции: " + value * 35.274);
                break;
            case 2:
                System.out.println("Килограммы: " + value / 2.205);
                System.out.println("Фунты: " + value);
                System.out.println("Стоны: " + value / 14);
                System.out.println("Унции: " + value * 16);
                break;
            case 3:
                System.out.println("Килограммы: " + value * 6.35);
                System.out.println("Фунты: " + value * 14);
                System.out.println("Стоны: " + value);
                System.out.println("Унции: " + value * 224);
                break;
            case 4:
                System.out.println("Килограммы: " + value / 35.274);
                System.out.println("Фунты: " + value / 16);
                System.out.println("Стоны: " + value / 224);
                System.out.println("Унции: " + value);
                break;
            default:
                System.out.println("Выбрана некорректная единица измерения");
        }
    }
}
