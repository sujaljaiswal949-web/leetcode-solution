class Solution {
    public int romanToInt(String s) {
        s = s.replace("IV", "IIII");
        s = s.replace("IX", "VIIII");
        s = s.replace("XL", "XXXX");
        s = s.replace("XC", "LXXXX");
        s = s.replace("CD", "CCCC");
        s = s.replace("CM", "DCCCC");

        int sum = 0;
        for (char c : s.toCharArray()) {
            if (c == 'M') sum += 1000;
            else if (c == 'D') sum += 500;
            else if (c == 'C') sum += 100;
            else if (c == 'L') sum += 50;
            else if (c == 'X') sum += 10;
            else if (c == 'V') sum += 5;
            else if (c == 'I') sum += 1;
        }

        return sum;
    }
}