import java.io.*;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        // Выделение памяти для хранения Данных из Считанного Файла
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
        // 1 задание Печать списка
        //ArrayCity.printArrayCity(arCity);

        // 2 задание Сортировка по Алфавиту
        //SortName tmpSort = new SortName();
        //tmpSort.sortNameFirstChar(arCity);

        // 3 задание Сортировка по численности населения + индекс самого многочисленного города
        //SortPopulation.sortPopulation(arCity);

        // 4 задание Подсчет городов в каждом регионе
        //CountCity.countCityRegion(arCity);
    }

}