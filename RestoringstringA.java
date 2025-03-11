public class RestoringstringA {
    public static void main(String[] args) {
        int indices[] = {4, 3, 2, 0, 1}; 
        String s = "apple";  
        RestoringstringA obj = new RestoringstringA();  
        String ans = obj.restoreString(s, indices);  
        System.out.println(ans);  // Expected output: "leppa"
    }

    public String restoreString(String s, int[] indices) {
        char[] restro = new char[s.length()];  // Create an array to store reordered characters
        for (int i = 0; i < s.length(); i++) {
            restro[indices[i]] = s.charAt(i);  // Place characters in the correct position
        }
        return new String(restro);  // Convert char array to String and return
    }
}
