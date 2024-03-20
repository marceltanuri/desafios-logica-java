package exemplos.palindromo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> palavras = new ArrayList<>(Arrays.asList(
                "radar", "hello", "A man, a plan, a canal, Panama!",
                "Was it a car or a cat I saw?", "12321"
        ));

        for (String palavra : palavras) {
            System.out.println("'" + palavra + "' É palíndromo? " + Palindromo1.ehPalindromo(palavra));
        }

    }
}
