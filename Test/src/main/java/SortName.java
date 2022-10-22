import java.io.*;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.*;

/*public class SortName {


    public static void sortNameFirstChar(City[] data) {

        for (int i = 1; i < data.length; i++) {
            for (int j = i; j > 0; j--) {
                Character firstCityName = new Character(data[i - j].getName().charAt(0));
                Character secondCityName = new Character(data[i].getName().charAt(0));
                if (firstCityName > secondCityName) {
                    City temp = data[i - j];
                    data[i - j] = data[i];
                    data[i] = temp;
                }
            }
        }
        for (int i = 1; i < data.length; i++) {
            for (int j = i; j > 0; j--) {
                Character firstCityName = new Character(data[i - j].getName().charAt(1));
                Character secondCityName = new Character(data[i].getName().charAt(1));
                if ((int) data[i].getName().charAt(0) == (int) data[i - j].getName().charAt(0) && firstCityName > secondCityName) {
                    City temp = data[i - j];
                    data[i - j] = data[i];
                    data[i] = temp;
                }
            }
        }
        for (int i = 1; i < data.length; i++) {
            for (int j = i; j > 0; j--) {
                Character firstCityName = new Character(data[i - j].getName().charAt(2));
                Character secondCityName = new Character(data[i].getName().charAt(2));
                if ((int) data[i].getName().charAt(1) == (int) data[i - j].getName().charAt(1) && (int) data[i].getName().charAt(0) == (int) data[i - j].getName().charAt(0) && firstCityName > secondCityName) {
                    City temp = data[i - j];
                    data[i - j] = data[i];
                    data[i] = temp;
                }
            }
        }
        for (int i = 1; i < data.length; i++) {
            for (int j = i; j > 0; j--) {
                if (data[i].getName().length() > 3 && data[i - j].getName().length() > 3) {
                    Character firstCityName = new Character(data[i - j].getName().charAt(3));
                    Character secondCityName = new Character(data[i].getName().charAt(3));
                    if ((int) data[i].getName().charAt(2) == (int) data[i - j].getName().charAt(2) && (int) data[i].getName().charAt(1) == (int) data[i - j].getName().charAt(1) && (int) data[i].getName().charAt(0) == (int) data[i - j].getName().charAt(0) && firstCityName > secondCityName) {
                        City temp = data[i - j];
                        data[i - j] = data[i];
                        data[i] = temp;
                    }
                } else {
                    continue;
                }
            }
        }
        for (int i = 1; i < data.length; i++) {
            for (int j = i; j > 0; j--) {
                if (data[i].getName().length() > 4 && data[i-j].getName().length() > 4) {
                    Character firstCityName = new Character(data[i - j].getName().charAt(4));
                    Character secondCityName = new Character(data[i].getName().charAt(4));
                    if ((int) data[i].getName().charAt(3) == (int) data[i - j].getName().charAt(3) && (int) data[i].getName().charAt(2) == (int) data[i - j].getName().charAt(2) && (int) data[i].getName().charAt(1) == (int) data[i - j].getName().charAt(1) && (int) data[i].getName().charAt(0) == (int) data[i - j].getName().charAt(0) && firstCityName > secondCityName) {
                        City temp = data[i - j];
                        data[i - j] = data[i];
                        data[i] = temp;
                    }
                } else {
                    continue;
                }
            }
        }
        for (int i = 1; i < data.length; i++) {
            for (int j = i; j > 0; j--) {
                if (data[i].getName().length() > 5 && data[i-j].getName().length() > 5) {
                    Character firstCityName = new Character(data[i - j].getName().charAt(5));
                    Character secondCityName = new Character(data[i].getName().charAt(5));
                    if ((int) data[i].getName().charAt(4) == (int) data[i - j].getName().charAt(4) && (int) data[i].getName().charAt(3) == (int) data[i - j].getName().charAt(3) && (int) data[i].getName().charAt(2) == (int) data[i - j].getName().charAt(2) && (int) data[i].getName().charAt(1) == (int) data[i - j].getName().charAt(1) && (int) data[i].getName().charAt(0) == (int) data[i - j].getName().charAt(0) && firstCityName > secondCityName) {
                        City temp = data[i - j];
                        data[i - j] = data[i];
                        data[i] = temp;
                    }
                } else {
                    continue;
                }
            }
        }

        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i].getFullData());
        }
    }
}
*/