import java.io.*;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        // Выделение памяти для хранения Данных с Считанного Файла
        City[] arCity = new City[1109];
        // Путь к файлу, где нужно считать
        File file = new File("src/Задача ВС Java Сбер.csv");
        // Исключение, для проверки наличия файла и чтение
        try (Scanner sc = new Scanner(file, StandardCharsets.UTF_8)) {
            // Заполнение Данных Массива
            //String[] arrCity = new String[1109];
            for (int i = 0; i < arCity.length; i++) {
                String text = sc.nextLine();
                String[] words = text.split(";");
                City tmp = new City(words);
                arCity[i] = tmp;
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        // Проверка считанных данных
        //for(int i = 0; i < arCity.length; i++)
            //System.out.println(arCity[i].getFullData());

        // Сортировка по Алфавиту по первому Индексу Столбца
        SortName tmpSort = new SortName();
        tmpSort.SortNameFirstChar(arCity);


        // TODO Пример работы Типовых и Ссылочных Данных
        //int x = 5;
        //System.out.println(x); //  5
        //IncreaseNum(x);
        //System.out.println(x); //  5
        //x = IncreaseNumR(x);
        //System.out.println(x); //  6
    }


    public  static void Sum(int a, int b){
        int k;
        k = a + b;
        System.out.println(k);
    }

    public  static void IncreaseNum(int a) {
        a++;
        System.out.println(a); // 6
    }

    public  static int IncreaseNumR(int a){
        a++;
        return  a;
    }

    public  static int SumR(int a, int b){
        int k;
        k = a+ b;
        System.out.println(k);
        return k;
    }
}