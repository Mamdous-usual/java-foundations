import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class CountryMap {
    public static void main(String[] args) {
        Map<String, String> countryMap = new HashMap<>();
        countryMap.put("India", "New Delhi");
        countryMap.put("Bangladesh", "Dhaka");
        countryMap.put("China", "Beijing");
        countryMap.put("Nepal", "Kathmandu");
        countryMap.put("Pakistan", "Islamabad");

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the country name: ");
        String country = input.next();

        if (countryMap.containsKey(country)) {
            System.out.printf("Capital of %s is %s",country, countryMap.get(country));
        } else {
            System.out.println("Sorry we don't know the capital");
        }
    }
}
