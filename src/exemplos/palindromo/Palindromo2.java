package exemplos.palindromo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Palindromo2 {


    public static boolean ehPalindromo(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }

        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }

        return true;
    }
}
