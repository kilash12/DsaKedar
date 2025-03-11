class Solution {
    public static void main(String[] args) {
        String s = "hello world";
        Solution solution = new Solution();
        System.out.println(solution.lengthOfLastWord(s));  // Output: 5
    }

    public int lengthOfLastWord(String s) {
        int len = s.length();
        int c = 0;

        // Start from the last character, going backward
        for (int i = len - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                // Stop when the first space is found
                break;
            }
            c++;  // Count characters in the last word
        }

        return c;
    }
}
