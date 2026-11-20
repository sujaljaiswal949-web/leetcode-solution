
class Solution {
    public String numberToWords(int num) {
        if (num == 0) return "Zero";

        String[] below20 = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};

        String[] tens = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

        String[] units = {"", "Thousand", "Million", "Billion"};

        StringBuilder result = new StringBuilder();
        int i = 0;

        while (num > 0) {
            int part = num % 1000;

            if (part != 0) {
                String word = convert(part, below20, tens);
                result.insert(0, word + (units[i].isEmpty() ? "" : " " + units[i]) + " ");
            }

            num /= 1000;
            i++;
        }

        return result.toString().trim();
    }

    private String convert(int num, String[] below20, String[] tens) {
        if (num == 0) return "";

        if (num < 20) return below20[num];

        if (num < 100) {
            return tens[num / 10] + (num % 10 == 0 ? "" : " " + below20[num % 10]);
        }

        return below20[num / 100] + " Hundred" +
               (num % 100 == 0 ? "" : " " + convert(num % 100, below20, tens));
    }
}
