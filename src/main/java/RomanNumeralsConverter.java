import java.util.HashMap;
import java.util.Scanner;

public class RomanNumeralsConverter {
    static HashMap<Character, Integer> romanConversions = new HashMap<>() {{
        put('I', 1);
        put('V', 5);
        put('X', 10);
    }};

    static int getNumber(String romanNumeral)
    {
        int number = 0;

        // Replaces IV and IX for their equivalent in our known roman numerals, so they can be added later
        romanNumeral = romanNumeral.replace("IV", "IIII").replace("IX", "VIIII");

        char[] chars = romanNumeral.toCharArray();

        try
        {
            for (char c : chars) {
                number += romanConversions.get(c);
            }
        }
        catch (Exception e)
        {
            throw new UnsupportedOperationException("The input provided is not recognised or supported as a roman numeral");
        }

        return number;
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter a Roman Numeral");

        String romanNumeral = in.nextLine();

        System.out.println(getNumber(romanNumeral));
    }
}