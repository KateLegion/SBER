import java.io.*;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        File file = new File("src/Задача ВС Java Сбер.csv");

        try (Scanner sc = new Scanner(file, StandardCharsets.UTF_8)) {
            for (int i = 0; i < 7; i++) {
                String text = sc.nextLine();
                String[] words = text.split(";");

                //for (int j = 0; j < words.length; j++) {
                    //System.out.println(words[j]);
                //}
                //String[] array = {words[0], words[1], words[2], words[3], words[4], words[5]};
                City tmp = new City ();
                tmp.setName(words[1]);
                tmp.setRegion(words[2]);
                tmp.setDistrict(words[3]);
                tmp.setPopulation(words[4]);
                tmp.setFoundation(words[5]);
                System.out.println(tmp.getFullData());

            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}