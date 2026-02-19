class Solution {
    public String addBinary(String a, String b) {

        int s = a.length() - 1;
        int h = b.length() - 1;

        String sum = "";
        int carry = 0;

        while (s >= 0 || h >= 0) {

            int bitA = 0;
            int bitB = 0;

            if (s >= 0) {
                bitA = a.charAt(s) - '0';
            }

            if (h >= 0) {
                bitB = b.charAt(h) - '0';
            }

            int total = bitA + bitB + carry;

            if (total == 0) {
                sum = "0" + sum;
                carry = 0;
            } 
            else if (total == 1) {
                sum = "1" + sum;
                carry = 0;
            } 
            else if (total == 2) {
                sum = "0" + sum;
                carry = 1;
            } 
            else { // total == 3
                sum = "1" + sum;
                carry = 1;
            }

            s--;
            h--;
        }

        if (carry == 1) {
            sum = "1" + sum;
        }

        return sum;
    }
}
