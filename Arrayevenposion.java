public class Arrayevenposion {
    public static void main(String[] args) {
        char a[] = {'a','b','c','d','e','f'};
        for (int i = 0; i < a.length; i++) {
            if(i%2!=0){
                System.err.println(a[i]+" ");
            }
            
        }
    }
}
