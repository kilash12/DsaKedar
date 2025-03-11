
import java.util.ArrayList;
import java.util.Iterator;

public class Customexample{
    public static void main(String[] args) {
        ArrayList<String> city = new ArrayList<>();
        city.add("mumbai");
        city.add("kl");
        city.add("aligarh");
        city.add("hathras");
        city.add("gurgaw");
        city.add("agra");
        

        Iterator itr = city.iterator();
         

        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
        System.out.println();
        
    }
}

