package exemplos.inverterLista;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InverterLista1 {
    public static <T> List<T> inverter(List<T> list) {
        List<T> invertida = new ArrayList<>(list);
        Collections.reverse(invertida);
        return invertida;
    }
}
