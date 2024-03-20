package exemplos.inverterLista;

import java.util.ArrayList;
import java.util.List;

public class InverterLista5 {
    public static <T> List<T> inverter(List<T> list) {
        List<T> invertida = new ArrayList<>(list.size());
        for (int i = 0; i < list.size(); i++) {
            invertida.add(0, list.get(i));
        }
        return invertida;
    }
}
