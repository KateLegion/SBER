import java.io.*;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class SortName {
    public SortName() throws IOException {
        File file = new File("src/Задача ВС Java Сбер.csv");
        try (Scanner sc = new Scanner (file, StandardCharsets.UTF_8)) {
            String[][] arCity = new String[1109][6];
            for (int i = 0; i < arCity.length; i++) {
                String text = sc.nextLine();
                String[] words = text.split(";");
                for (int j = 0; j < arCity[i].length; j++){
                    arCity[i][j] = words[j];
                }
            }
            for (String[] StringArr : arCity) {
                for (String WordArr : StringArr) {
                    System.out.print(WordArr + "\t");
                }
                System.out.println();
            }
        }
    }
}
