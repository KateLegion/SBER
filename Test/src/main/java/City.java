import java.util.Scanner;

    public class City {
    private String region;
    private String name;
    private String district;
    private String population;
    private String foundation;

        /*public City(String region, String name, String district, String population, String foundation) {
            this.region = region;
            this.name = name;
            this.district = district;
            this.population = population;
            this.foundation = foundation;
        }*/

        public  City(String[] data){
            this.region = data[2];
            this.name = data[1];
            this.district = data[3];
            this.population = data[4];
            this.foundation = data[5];
        }

        public String getRegion() {
            return region;
        }

        public void setRegion(String region) {
            this.region = region;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDistrict() {
            return district;
        }

        public void setDistrict(String district) {
            this.district = district;
        }

        public String getPopulation() {
            return population;
        }

        public void setPopulation(String population) {
            this.population = population;
        }

        public String getFoundation() {
            return foundation;
        }

        public void setFoundation(String foundation) {
            this.foundation = foundation;
        }

        public String getFullData() {
            return "City{" +
                    "name='" + name + '\'' +
                    ", region='" + region + '\'' +
                    ", district='" + district + '\'' +
                    ", population='" + population + '\'' +
                    ", foundation='" + foundation + '\'' +
                    '}';
        }
}
