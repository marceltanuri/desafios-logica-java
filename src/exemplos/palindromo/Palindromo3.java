package exemplos.palindromo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Palindromo3 {

    public static boolean ehPalindromo(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }

        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int inicio = 0;
        int fim = str.length() - 1;

        while (inicio < fim) {
            if (str.charAt(inicio) != str.charAt(fim)) {
                return false;
            }
            inicio++;
            fim--;
        }

        return true;
    }
}
