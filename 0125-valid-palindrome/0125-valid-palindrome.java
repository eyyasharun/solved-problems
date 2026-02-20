class Solution {
    public boolean isPalindrome(String s) {

        String h = "";
        int i = 0;

        while (i < s.length()) {
            char c = s.charAt(i);

            
            if (Character.isLetterOrDigit(c)) {
                h += Character.toLowerCase(c);
            }

            i++;
        }

        
        String rev = "";
        i = h.length() - 1;

        while (i >= 0) {
            rev += h.charAt(i);
            i--;
        }

        return h.equals(rev);
    }
}