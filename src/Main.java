import java.util.HashMap;
import java.util.Map;

public class Main {
    static String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna" +
            " aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. " +
            "Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur." +
            " Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();
        String lowerText = text.toLowerCase(); //приводим текст к нижнему регистру
        String text1 = lowerText.replaceAll("[,. ]", ""); // выкидываем из текста запятые, точки и пробелы

        //заполняем мапу парами (символ-частота символа)
        for (int i = 0; i < text1.length(); i ++) {
           char c = text1.charAt(i);
           if (map.containsKey(c)) {
               int value = map.get(c);
               value ++;
               map.put(c, value);
           } else {
               map.put(c, 1);
           }
        }

        //определяем самый редкий и самый частый символы в строке
        int max = 0;
        int min = Integer.MAX_VALUE;
        char charMax;
        char charMin;

        for (Character k : map.keySet()) {
            if (map.get(k) > max) {
                max = map.get(k);
                charMax = k;
            }
            if(map.get(k) < min) {
                min = map.get(k);
                charMin = k;
            }
        }
        
    }
}
