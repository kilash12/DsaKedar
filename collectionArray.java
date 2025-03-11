import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class collectionArray {
    public static int getThirdelement(Integer[] a, int n) {
        List<Integer> list = Arrays.asList(a);
        Collections.sort(list, Collections.reverseOrder());
        return list.get(2); // Get the third largest element
    }

    public static void main(String[] args) {
        Integer[] a = {2, 7,8,9,10, 4, 5, 1, 3,  4};
        System.out.println(getThirdelement(a, a.length));
    }
}
