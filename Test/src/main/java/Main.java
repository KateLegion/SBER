import java.io.*;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        // Выделение памяти для хранения Данных из Считанного Файла
        City[] arCity = new City[1109];
        // Путь к файлу, где нужно считать города
        File file = new File("src/Задача ВС Java Сбер.csv");
        // Исключение для проверки наличия файла и чтение
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
        //ArrayCity tmpArray = new ArrayCity();
        //tmpArray.printArrayCity(arCity);

        // 2 задание Сортировка по названию города
        //Arrays.sort(arCity, (o1, o2) -> o1.getName().compareTo(o2.getName()));

        // 2 задание Сортировка по Фед. округу и названию города
        /*Arrays.sort(arCity, (o1, o2) -> {
            if (o1.getDistrict().equals(o2.getDistrict())) {
                return o1.getName().compareTo(o2.getName());
            }
            return o1.getDistrict().compareTo(o2.getDistrict());
        });*/
        //for (int i = 0; i < arCity.length; i++) {
        //    System.out.println(arCity[i].getFullData());
        //}

        // 3 задание Сортировка по численности населения + индекс самого многочисленного города
        //SortPopulation tmpSortPop = new SortPopulation();
        //tmpSortPop.sortPopulation(arCity);

        // 4 задание Подсчет городов в каждом регионе
        //CountCity tmpCount = new CountCity();
        //tmpCount.countCityRegion(arCity);
    }

}