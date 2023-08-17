import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

    }

    public int romanToInt(String s) {
        int integer = 0;
        int prevValue = 0;
        HashMap<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        for (int i = s.length() - 1; i >= 0; i--) {
            int currentValue = romanValues.get(s.charAt(i));
            if (currentValue < prevValue) {
                integer -= currentValue;
            } else {
                integer += currentValue;
                prevValue = currentValue;
            }
        }
        return integer;
    }
}