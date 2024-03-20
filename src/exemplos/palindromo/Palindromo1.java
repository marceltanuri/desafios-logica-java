package exemplos.palindromo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Palindromo1 {


    public static boolean ehPalindromo(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }

        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversed = new StringBuilder(str).reverse().toString();

        return str.equals(reversed);
    }
}
