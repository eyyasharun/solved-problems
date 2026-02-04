class Solution {
    public int romanToInt(String s) {
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            int curr = value(s.charAt(i));

            // If next symbol exists and is larger, subtract
            if (i + 1 < s.length() && curr < value(s.charAt(i + 1))) {
                sum -= curr;
            } else {
                sum += curr;
            }
        }
        return sum;
    }

    // Helper method to get value of Roman character
    private int value(char c) {
        if (c == 'I') return 1;
        if (c == 'V') return 5;
        if (c == 'X') return 10;
        if (c == 'L') return 50;
        if (c == 'C') return 100;
        if (c == 'D') return 500;
        if (c == 'M') return 1000;
        return 0;
    }
}