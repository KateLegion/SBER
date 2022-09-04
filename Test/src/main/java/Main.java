import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        File file = new File("src/Задача ВС Java Сбер.csv");

        try (Scanner sc = new Scanner(file, StandardCharsets.UTF_8))
        {
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        /*Scanner console = new Scanner(System.in);
        while (console.hasNextLine()) {
            String text = console.next();
            String[] words = text.split(";");

            System.out.println("City{" + "name='" + words[1] + "', region='" + words[2] + "', district='" + words [3] + "', population='" + words[4] + "', foundation='" + words[5] + "'}");

        }*/
    }
}