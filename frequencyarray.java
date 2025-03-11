public class frequencyarray {
    public static void main(String[] args) {
        int a [] = {1  ,  2   ,8,  3,   2 ,  2,   2 ,  5,   1 };
        
        int fr[] = new int[a.length];
       
        for(int i = 0 ; i < a.length ; i ++ ){
            int c =1;
           for(int j = i+1; j<a.length;j++){
                  if(a[i]==a[j]){
                       c++;
                       fr[j] = -1;
                       
                  }
           }
           if(fr[i]!= -1){
            fr[i] = c;

           }
        }
        for(int i = 0; i <fr.length; i++){
            if(fr[i]!= -1){
                
                System.out.println(a[i] + "    |    " + fr[i]);  
               }

        }
    }
}
