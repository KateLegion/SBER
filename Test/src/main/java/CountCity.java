import java.util.ArrayList;

public class CountCity {
    public static void countCityRegion(City[] data) {
        int count = 0;
        ArrayList<String> arrayRegion = new ArrayList<>();
        ArrayList<String> arrayCount = new ArrayList<>();
        for (int i = 0; i < data.length; i++) {
            if (!arrayRegion.contains(data[i].getRegion())) {
                arrayRegion.add(data[i].getRegion());
                count = 1;
                arrayCount.add(arrayRegion.indexOf(data[i].getRegion()), Integer. toString(count));
            }
            else if (arrayRegion.contains(data[i].getRegion())) {
                int tmp = Integer.parseInt(arrayCount.get(arrayRegion.indexOf(data[i].getRegion()))) + 1;
                arrayCount.add(arrayRegion.indexOf(data[i].getRegion()), Integer. toString(tmp));
            }
        }
        for(int i = 0; i<arrayRegion.size(); i++) {
            String region = arrayRegion.get(i);
            String counts = arrayCount.get(i);
            System.out.println(region + " - " + counts);
        }
    }
}
