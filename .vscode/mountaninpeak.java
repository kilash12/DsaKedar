public class mountaninpeak {
    public static void main(String[] args) {
        int arr [] = {0,1,2,3,4,5,0,2};
        System.out.println(peakk(arr));
        
    }

    
    //     int i =0 ;
    //     while(i<arr.length && arr[i] < arr[i+1]){
    //         i++;

    //     }
    //     return i;

    // }
   static int peakk( int arr []){
//     for (int i = 0; i < arr.length; i++) {
//         if(arr[i] > arr[i+1]){
//             return i;
//         }
       
        
//     }
//     return -1;
// }
  int s =0;
  int e = arr.length-1;


  while(s<e){
    int m = s+(e-s)/2;
    if(arr[m]<arr[m+1]){
        s = m+1;
    }else{
        e = m;
    }
  }
   return s; 
}
}