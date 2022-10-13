public class SortPopulation {
    public static void sortPopulation(City[] data) {
        for (int i = 1; i < data.length; i++) {
            for (int j = i; j > 0; j--) {
                Integer firstCityPopulation = new Integer(data[i-j].getPopulation());
                Integer secondCityPopulation = new Integer(data[i].getPopulation());
                if (firstCityPopulation < secondCityPopulation) {
                    City temp = data[i];
                    data[i] = data[i-j];
                    data [i-j] = temp;
                }
            }

        }

        for (int i = 0; i < data.length; i++)
            System.out.println(data[i].getFullData());
    }
}
