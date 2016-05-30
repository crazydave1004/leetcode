public class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        if (numerator == 0) return "0";
        String res = "";
        if (denominator == 0) return res;
        if (numerator < 0 ^ denominator < 0) res += "-";
        long num = numerator, den = denominator;
        num = Math.abs(num);
        den = Math.abs(den);
        long result = num / den;
        res += String.valueOf(result);
        long reminder = (num % den) * 10;
        if (reminder == 0) return res;
        HashMap<Long, Integer> hash = new HashMap<Long, Integer>();
        res += ".";
        while (reminder != 0) {
            if (hash.containsKey(reminder)) {
                int end = hash.get(reminder);
                String part1 = res.substring(0, end);
                String part2 = res.substring(end);
                res = part1 + "(" + part2 + ")";
                return res;
            }
            hash.put(reminder, res.length());
            result = reminder / den;
            res += String.valueOf(result);
            reminder = (reminder % den) * 10; 
        }
        return res;
    }
}