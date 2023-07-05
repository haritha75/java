import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {


        //example

    List<City> list = new ArrayList<>();
    
    City c1 = new City("delhi", 11);
    City c2 = new City("mumbai",15);

    list.add(c1);
    list.add(c2);

    List<String> li = list.stream().map(n -> n.getName()).collect(Collectors.toList()); //first c1 object  stored in list and c2  like this same data converting into streams.in method first c1 object and getting name then c2 like this working.
    System.out.println(li);



        //here first whatever the data in method it converting in to streams and in filter method what the cities object passing and in cities object getting temperature which is less than 12  and collecting the data and finally based on the filter method getting in name and that data stored as a list.
        System.out.println(prepareTemperature().stream().filter(f -> f.getTemperature() > 12).map(n -> n.getName()).collect(Collectors.toList()));
        
    }


   
private static List<City> prepareTemperature()
 
{
    List<City> cities = new ArrayList<>();
    cities.add(new City("Mexico", 14));
    cities.add(new City("New York", 13));
    cities.add(new City("Dubai", 43));
    cities.add(new City("London", 15));
    cities.add(new City("Alaska", 1));
    cities.add(new City("Kolkata", 30));
    cities.add(new City("Sydney", 11));
    cities.add(new City("Mexico", 14));
    cities.add(new City("Dubai", 43));
    return cities;

}
    
}
