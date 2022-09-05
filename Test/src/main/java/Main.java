import java.io.*;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        File file = new File("src/Задача ВС Java Сбер.csv");

        try (Scanner sc = new Scanner(file, StandardCharsets.UTF_8)) {
            //Задание 1
            /*String[] arrCity = new String[1109];
            for (int i = 0; i < arrCity.length; i++) {
                String text = sc.nextLine();
                String[] words = text.split(";");
                City tmp = new City();
                tmp.setName(words[1]);
                tmp.setRegion(words[2]);
                tmp.setDistrict(words[3]);
                tmp.setPopulation(words[4]);
                tmp.setFoundation(words[5]);
                System.out.println(tmp.getFullData());

            }*/
            //Задание 2
            System.out.println(new SortName());
            
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}