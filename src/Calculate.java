
import java.util.*;

public class Calculate {
    public static void main(String[] args) {
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

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String[] parts = input.split(" ");

        if (parts.length != 3) {
            throw new IllegalArgumentException("Неверный формат ввода");
        }

        int a =0, b = 0;

        try {
            a = Integer.parseInt(parts[0]);
            b = Integer.parseInt(parts[2]);

            if (a < 1 || a > 10 || b < 1 || b > 10) {
                throw new IllegalArgumentException("Числа должны быть от 1 до 10 включительно");
            }

        } catch (NumberFormatException e) {
            try {
                int c = romanNumbers.get(parts[0]);
            int d = romanNumbers.get(parts[2]);
            int result1;
            switch (parts[1]) {
                case "+":
                    result1 = c + d;
                    break;
                case "-":
                    result1 = c - d;
                    break;
                case "*":
                    result1 = c * d;
                    break;
                case "/":
                    result1 = c / d;
                    break;
                default:
                    throw new IllegalArgumentException("Неверная арифметическая операция");
            }
                if (result1 != 0) {
                    System.out.println(romanResults.get(result1));
                } else {
                    throw new IllegalArgumentException("Ответ не должно быть меньше нулья");
                }
            }catch (Exception r) {
                throw new NullPointerException("Неверный Формат");
            }
        }

            int result;
        try {
            switch (parts[1]) {
                case "+":
                    result = a + b;
                    break;
                case "-":
                    result = a - b;
                    break;
                case "*":
                    result = a * b;
                    break;
                case "/":
                    result = a / b;
                    break;
                default:
                    throw new IllegalArgumentException("Неверная арифметическая операция");
            }

            System.out.println(result);
        }catch (ArithmeticException e) {
        }
    }
}


