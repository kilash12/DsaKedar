
//     public static void main(String[] args) {
//         skip(" ", "abcade");
        
//     }
//     static  void  skip(String p , String up){
//         if(up.isEmpty()){
//             System.out.println(p);
//             return;
//         }
//         char ch = up.charAt(0);
//         if(ch=='a'){
//             skip(p, up.substring(1));
//         }
//         else{
//             skip(p+ch, up.substring(1));
//         }
//     }
// // }
// public class stringexample {
//     public static void main(String[] args) {
//         skip(" ", "abcadeaaaadsf");
        
//     }
//     static void skip(String p , String up){
//         if(up.isEmpty()){
//             System.out.println(p);
//             return;
//         }
//         char ch = up.charAt(0);
//         if(ch=='a'){
//             skip(p, up.substring(1));
//         }else{
//             skip(p+ch, up.substring(1));
//         }
//     }
// 
// public class stringexample {
//     public static void main(String[] args) {
//         String str = "hello";
//         System.out.println(str.substring(1,5));
//     }
// }
// public class stringexample {
//     public static void main(String[] args) {
//         sudAscii(" ", "abc");
        
//     }
//     static  void sudAscii(String p , String up ){
//         if(up.isEmpty()){
//         System.out.println(p);
//         return;
//         }
//         char ch = up.charAt(0);
//         sudAscii(p+ch, up.substring(1));
//         sudAscii(p, up.substring(1));
//         sudAscii(p+(ch+0), up.substring(1));
//     }
// }
public class stringexample {
    public static void main(String[] args) {
        String ans =skipAppnotApple("appabcapplecdeappleapp");
        System.out.println(ans);
        
    }
//     static String skip(String up){
//         if(up.isEmpty()){
//             return "";
//         }
//         char ch = up.charAt(0);
//         if(ch=='a'){
//              return  skip(up.substring(1));

//         }
//         return  ch+skip(up.substring(1));
//     }
// }
// static String skipApple(String up){
//     // if(up.isEmpty()){
//     //     return "";
//     // }
//     // char ch = up.charAt(0);
//     // if(up.startsWith("apple")){
//     //   return   skipApple(up.substring(5));
//     // }else{
//     //     return up.charAt(0)+ skipApple(up.substring(1));
//     // }   

// }
// }
static String skipAppnotApple(String up){
    // if(up.isEmpty()){
    //     return "";
    // }
    // char ch = up.charAt(0);
    // if(up.startsWith("apple")){
    //   return   skipApple(up.substring(5));
    // }else{
    //     return up.charAt(0)+ skipApple(up.substring(1));
    // }   
         if(up.isEmpty()){
            return "";

         }
         if(up.startsWith("app")&& !up.startsWith("apple")) {
            return skipAppnotApple(up.substring(3));
         }else{
            return up.charAt(0)+ skipAppnotApple(up.substring(1));
         }

}
}