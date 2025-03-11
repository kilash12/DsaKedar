

public class THirdelementofarray {
  public  static int getThirdelement(int a [], int total)
{
    int temp;
    for (int i = 0; i < total; i++) {
        for (int j = i+1; j < total; j++) {
           if(a[i]>a[j]){
            temp = a[i];
            a[i]= a[j];
            a[j]= temp;
           } 
        }
    }
    return a[total-2];

}
public static void main(String[] args) {
        int a[] = {1,4,6,7,9,1,5,6,7,8,63};
        int b[] = {4,2,1,5,4,3};
        System.err.println(getThirdelement(a,a.length));
        System.err.println(getThirdelement(b,b.length));
}
    
}
