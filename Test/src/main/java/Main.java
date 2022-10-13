import java.io.*;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        // Выделение памяти для хранения Данных с Считанного Файла
        City[] arCity = new City[1109];
        // Путь к файлу, где нужно считать города
        File file = new File("src/Задача ВС Java Сбер.csv");
        // Исключение, для проверки наличия файла и чтение
        try (Scanner sc = new Scanner(file, StandardCharsets.UTF_8)) {
            // Заполнение Данных Массива
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
        //1 задание Печать списка
        ArrayCity.printArrayCity(arCity);


        // Сортировка по Алфавиту по первому Индексу Столбца
        /*SortName tmpSort = new SortName();
        tmpSort.SortNameFirstChar(arCity);*/


        // TODO Пример работы Типовых и Ссылочных Данных
        //int x = 5;
        //System.out.println(x); //  5
        //IncreaseNum(x);
        //System.out.println(x); //  5
        //x = IncreaseNumR(x);
        //System.out.println(x); //  6
    }

}