import java.util.*;

public class a_11_16 {

    /*
    16. Write a method called is1to1 that accepts a map whose keys and values are strings as its parameter and returns true if
    no two keys map to the same value. For example, {Marty=206–9024, Hawking=123–4567, Smith=949–0504, Newton=123–4567}
    should return false, but {Marty=206–9024, Hawking=555–1234, Smith=949–0504, Newton=123–4567}
    should return true. The empty map is considered 1-to-1 and returns true.
     */

    public static void main(String[] args) {

        Map<String, String> testMap1 = new HashMap<>();
        Map<String, String> testMap2 = new HashMap<>();

        testMap1.put("Marty", "206-9024");
        testMap1.put("Hawking", "123-4567");
        testMap1.put("Smith", "949-0504");
        testMap1.put("Newton", "123-4567");

        testMap2.put("Marty", "206-9024");
        testMap2.put("Hawking", "555-1234");
        testMap2.put("Smith", "949-0504");
        testMap2.put("Newton", "123-4567");

        System.out.println("Result should be false: " + is1to1(testMap1));
        System.out.println("Result should be true: " + is1to1(testMap2));
    }

    public static boolean is1to1(Map<String, String> map) {

        // makes a set containing the keys of the map
        Set<String> setOfKeys = map.keySet();

        // makes a collection containing the values of the map
        Collection<String> collectionOfMapValues = map.values();

        // makes a set of the values (automatically removes duplicates, due to HastSet)
        Set<String> setOfValues = new HashSet<>(collectionOfMapValues);

        boolean returnBoolean = true;

        // If the setOfValues is not == the setOfKeys it means that the HashSet has removed duplicates
        // and therefor there was two or more keys who maps to the same value and the variable is set to false
        if (!(setOfKeys.size() == setOfValues.size())) {
            returnBoolean = false;
        }

        return returnBoolean;
    }
}
