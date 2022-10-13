import java.io.*;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class SortName {


    public void SortNameFirstChar(City[] data)  {

        //for(int i = 0; i < data.length; i++)
            //System.out.println(data[i].getFullData());
        //for(int i = 0; i < 5; i++) {
            //System.out.println((int)(data[i].getName().charAt(0)) + " " + data[i].getName().charAt(0));
            //if(data[i].getName().charAt(0) >= 192) System.out.println(data[i].getName().charAt(0));
        //}

        for(int i = 0; i < 5; i++)

            System.out.println(data[i].getFullData());

        CompareTwoElement(data[0], data[1]);
        CompareTwoElement(data[0], data[5]);
        //for(int i = 0; i < 10; i++)
           // System.out.println(data[i].getName());
    }

    public  void CompareTwoElement(City oneCity, City twoCity){
        Integer firstNum = new Integer(oneCity.getPopulation());
        Integer twoNum = new Integer((twoCity.getPopulation()));
        if(firstNum > twoNum) System.out.println(oneCity.getName());
        else System.out.println(twoCity.getName());
    }
}
