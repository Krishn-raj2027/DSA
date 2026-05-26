import java.util.*;

class Solution {
    public String intToRoman(int num) {

        String s = String.valueOf(num);

        Hashtable<Integer, String> map = new Hashtable<>();

        map.put(1, "I");
        map.put(4, "IV");
        map.put(5, "V");
        map.put(9, "IX");

        map.put(10, "X");
        map.put(40, "XL");
        map.put(50, "L");
        map.put(90, "XC");

        map.put(100, "C");
        map.put(400, "CD");
        map.put(500, "D");
        map.put(900, "CM");

        map.put(1000, "M");

        StringBuilder ans = new StringBuilder();

        int power = s.length() - 1;

        for(int i = 0; i < s.length(); i++) {

            int digit = s.charAt(i) - '0';

            int value = digit * (int)Math.pow(10, power);

            while(value > 0) {

                if(map.containsKey(value)) {
                    ans.append(map.get(value));
                    break;
                }

                else if(value >= 1000) {
                    ans.append("M");
                    value -= 1000;
                }

                else if(value >= 500) {
                    ans.append("D");
                    value -= 500;
                }

                else if(value >= 100) {
                    ans.append("C");
                    value -= 100;
                }

                else if(value >= 50) {
                    ans.append("L");
                    value -= 50;
                }

                else if(value >= 10) {
                    ans.append("X");
                    value -= 10;
                }

                else if(value >= 5) {
                    ans.append("V");
                    value -= 5;
                }

                else {
                    ans.append("I");
                    value -= 1;
                }
            }

            power--;
        }

        return ans.toString();
    }
}