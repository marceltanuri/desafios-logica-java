package exemplos.inverterLista;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InverterLista4 {
    public static <T> List<T> inverter(List<T> list) {
        Stack<T> pilha = new Stack<>();
        for (T elemento : list) {
            pilha.push(elemento);
        }

        List<T> invertida = new ArrayList<>(list.size());
        while (!pilha.isEmpty()) {
            invertida.add(pilha.pop());
        }
        return invertida;
    }
}
