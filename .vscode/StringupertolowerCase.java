public class StringupertolowerCase {
    public static void main(String[] args) {
        String s = "hELLO";
        System.out.println(fun(s));
        
    }
//     static  String convertUppertolower(String s){
//           char [] ch = s.toCharArray();
//           for (int i = 0; i < ch.length; i++) {
//             if(ch[i]>=65 && ch[i]<=90){
//                 ch[i] = (char)(ch[i]+32);
               
//             }
            
              
//           }
//           return String.valueOf(ch);
          
//     }
    
// }
static String fun(String s){
    // String res ="";
    // for (int i = 0; i < s.length(); i++) {
    //     if('A'<=s.charAt(i) && s.charAt(i)>='Z'){
    //         res += (char) (s.charAt(i) + ('a' - 'A'));

    //     }else{
    //         res+=s.charAt(i);
    //     }
    //     return res;
    StringBuilder sb = new StringBuilder();
    for(char ch : s.toCharArray()){
        if(ch >=65 && ch<=90){
            ch=(char)(ch+32);
        }
        sb.append(ch);

    }
    return sb.toString();
        
    }
}
