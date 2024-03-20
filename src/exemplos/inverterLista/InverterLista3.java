package exemplos.inverterLista;

import java.util.LinkedList;
import java.util.List;

public class InverterLista3 {
    public static <T> List<T> inverter(List<T> list) {
        List<T> invertida = new LinkedList<>();
        for (T elemento : list) {
            invertida.add(0, elemento);
        }
        return invertida;
    }
}
