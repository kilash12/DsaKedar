
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class listmethodimplement {

    static void listmethodimpleme(){
        // List<String>list = new ArrayList<>();
        // list.add("A");
        // list.add("B");
        // list.add(1,"c");
        // System.out.println(list);
       
        // list1.addAll(1,list2);
        // list1.addAll(list2);
        // System.out.println(list1);
        // list1.clear();
        // System.out.println(list1.isEmpty());
        // System.out.println(list1.equals(list2));
        // System.out.println(list1.hashCode());
        // System.out.println(list1.get(1));
        // System.out.println(list1.isEmpty());
        // list1.addAll(list2);
        // System.out.println(list1.lastIndexOf(2));
        // Object[] arr = list1.toArray();
        // System.out.println(Arrays.toString(arr));
        List<Integer>list1 = new ArrayList<>(Arrays.asList(1,2));
        List<Integer>list2 = new ArrayList<>(Arrays.asList(1,2));
        list1.addAll(list2);
    //     System.out.println(list1.contains(3));
    //     System.out.println(list1.containsAll(list2));
    //     System.out.println(list1.lastIndexOf(2));
    //     System.out.println(list1.remove(0));
    //     System.out.println(list1);
    //     System.out.println(list1.removeAll(list1));
    //     System.out.println(list1.isEmpty());
    // list1.replaceAll(n->n*2);
    // System.out.println(list1);
    // System.out.println(list1.retainAll(list2));
    list1.sort(Integer::compareTo);
    System.out.println(list1);
    List<Integer>sublist = list1.subList(1, 3);
    System.out.println(sublist);
     }
    
    public static void main(String[] args) {
        listmethodimpleme();
    }
    
}
