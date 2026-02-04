class Solution {
    public int romanToInt(String s) {
          s = s.toUpperCase();
        HashMap<Character,Integer>ss=new HashMap<>();
        ss.put('I',1);
         ss.put('V',5);
          ss.put('X',10);
           ss.put('L',50);
            ss.put('C',100);
             ss.put('D',500);
              ss.put('M',1000);

        
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            int curr = ss.getOrDefault(s.charAt(i), 0);

            int next = 0;
            if (i + 1 < s.length()) {
                next = ss.getOrDefault(s.charAt(i + 1), 0);
            }

            if (curr < next) {
                sum -= curr;
            } else {
                sum += curr;
            }
        }
        return sum;
    }
}