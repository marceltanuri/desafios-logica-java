package exemplos.inverterLista;

import java.util.ArrayList;
import java.util.List;

public class InverterLista2 {
    public static <T> List<T> inverter(List<T> list) {
        List<T> invertida = new ArrayList<>(list.size());
        for (int i = list.size() - 1; i >= 0; i--) {
            invertida.add(list.get(i));
        }
        return invertida;
    }
}
