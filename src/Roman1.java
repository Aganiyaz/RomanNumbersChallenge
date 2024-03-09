import java.util.HashMap;

public class Roman1 {
    void roman(String a, String b) {
        HashMap<String, Integer> romanNumbers = new HashMap<>();
        romanNumbers.put("I", 1);
        romanNumbers.put("II", 2);
        romanNumbers.put("III", 3);
        romanNumbers.put("IV", 4);
        romanNumbers.put("V", 5);
        romanNumbers.put("VI", 6);
        romanNumbers.put("VII", 7);
        romanNumbers.put("VIII", 8);
        romanNumbers.put("IX", 9);
        romanNumbers.put("X", 10);

        HashMap<Integer, String> romanResults = new HashMap<>();
        romanResults.put(1, "I");
        romanResults.put(2, "II");
        romanResults.put(3, "III");
        romanResults.put(4, "IV");
        romanResults.put(5, "V");
        romanResults.put(6, "VI");
        romanResults.put(7, "VII");
        romanResults.put(8, "VIII");
        romanResults.put(9, "IX");
        romanResults.put(10, "X");
        romanResults.put(11, "XI");
        romanResults.put(12, "XII");
        romanResults.put(13, "XIII");
        romanResults.put(14, "XIV");
        romanResults.put(15, "XV");
        romanResults.put(16, "XVI");
        romanResults.put(17, "XVII");
        romanResults.put(18, "XVIII");
        romanResults.put(19, "XIX");
        romanResults.put(20, "XX");


    }
}
