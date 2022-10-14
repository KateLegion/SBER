import java.io.*;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class SortName {


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
                if ((int) data[i].getName().charAt(0) == (int) data[i-j].getName().charAt(0) && firstCityName > secondCityName) {
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
                if ((int) data[i].getName().charAt(1) == (int) data[i-j].getName().charAt(1) && (int) data[i].getName().charAt(0) == (int) data[i-j].getName().charAt(0) && firstCityName > secondCityName) {
                    City temp = data[i - j];
                    data[i - j] = data[i];
                    data[i] = temp;
                }
            }
        }
        for (int i = 1; i < data.length; i++) {
            for (int j = i; j > 0; j--) {
                if ((int) data[i].getName().charAt(3)) {
                    continue;
                }
                Character firstCityName = new Character(data[i - j].getName().charAt(3));
                Character secondCityName = new Character(data[i].getName().charAt(3));
                if ((int) data[i].getName().charAt(2) == (int) data[i-j].getName().charAt(2) && (int) data[i].getName().charAt(1) == (int) data[i-j].getName().charAt(1) && (int) data[i].getName().charAt(0) == (int) data[i-j].getName().charAt(0) && firstCityName > secondCityName) {
                    City temp = data[i - j];
                    data[i - j] = data[i];
                    data[i] = temp;
                }
            }
        }
        //for(int i = 0; i < data.length; i++)
        //System.out.println(data[i].getFullData());
        //for(int i = 0; i < 5; i++) {
        //System.out.println((int)(data[i].getName().charAt(0)) + " " + data[i].getName().charAt(0));
        //if(data[i].getName().charAt(0) >= 192) System.out.println(data[i].getName().charAt(0));
        //}

        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i].getFullData());
        }
        //CompareTwoElement(data[0], data[1]);
        //CompareTwoElement(data[0], data[5]);
        //for(int i = 0; i < 10; i++)
        // System.out.println(data[i].getName());
        System.out.println( (int) data[0].getName().charAt(0));
    }

    /*public static void sortNameSecondChar(City[] data) {
        for (int i = 1; i < data.length; i++) {
            for (int j = i; j > 0; j--) {
                Character firstCityName = new Character(data[i - j].getName().charAt(1));
                Character secondCityName = new Character(data[i].getName().charAt(1));
                if ((int) data[i].getName().charAt(0) == (int) data[i-j].getName().charAt(0) && firstCityName > secondCityName) {
                    City temp = data[i - j];
                    data[i - j] = data[i];
                    data[i] = temp;
                }
            }
        }
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i].getFullData());
        }
    }*/

    public  void CompareTwoElement(City oneCity, City twoCity){
        Integer firstNum = new Integer(oneCity.getPopulation());
        Integer twoNum = new Integer((twoCity.getPopulation()));
        if(firstNum > twoNum) System.out.println(oneCity.getName());
        else System.out.println(twoCity.getName());
    }
}
