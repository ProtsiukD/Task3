package practical;

import java.util.Scanner;

/**
 * Created by prots on 26.04.2017.
 */
public class Materic {
    private String country;
    Materic(String country){
        setCountry(country);
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public String getCountry() {
        return country;
    }
    public enum  Country{
        AUSTRALIA, EURASIA, SOUTH_AMERICA, NORTH_AMERICA
    }
    public void getMateric(){
        Country country;
        switch (getCountry()){
            case "Ukraine":case "London":case "Germany":
                System.out.println(country = Country.EURASIA);break;
            case "Mexico":case "USA":case "Canada":
                System.out.println( country = Country.NORTH_AMERICA);break;
            case "Peru":case "Brasilia":case "Chili":
                country = Country.SOUTH_AMERICA;break;
            case "Australia":
                country = Country.AUSTRALIA;break;
            default:
                System.out.println("This country isn't in list");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String country;
        country = scanner.nextLine();
        Materic materic = new Materic(country);
        materic.getMateric();
    }
}
