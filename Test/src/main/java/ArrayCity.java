import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class ArrayCity {

    public static void printArrayCity(City[] data) {
        for(int i = 0; i < data.length; i++)
            System.out.println(data[i].getFullData());
    }
}
