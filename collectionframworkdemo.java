
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class collectionframworkdemo {
    public static void main(String[] args) {
        collectionframworkd();
        
    }
    static  void collectionframworkd(){
        int arr [] = {1,2,3,4};
        ArrayList <Integer> list = new ArrayList<>(Arrays.asList(1,2,4,6));
        System.out.println(arr[0]);
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(3));


        Map<Integer,String> map = new HashMap<>(Map.of(1,"kailash",2,"dsfhbnjkf"));
        System.out.println(map.get(2));
    }
}
