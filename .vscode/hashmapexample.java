import java.util.HashMap;

public class hashmapexample {
    public static void main(String[] args) {
        HashMap<String , Integer> map = new HashMap<>();
        map.put("Apple", 10);
        map.put("banana", 34);
        map.put("guava", 40);
        map.put("leechi", 50);


        System.out.println("Price of Apple"+map.get("Apple"));

        System.out.println("present"+map.containsKey("banana"));

        map.remove("banana");

        for(String key: map.keySet()){
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }
    }
    
}
