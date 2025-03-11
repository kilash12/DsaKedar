public class javaArarraysmalest {
    public static void main(String[] args) {
        int a [] = {25, 11, 7, 75, 56};
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if(min>a[i]){
                min = a[i];
            }
        }
        System.err.println(min);
    }
}
