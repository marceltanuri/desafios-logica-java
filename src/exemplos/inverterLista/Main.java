package exemplos.inverterLista;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        for(var i = 0; i < 90000; lista.add("abcdefg" + String.valueOf(i++)));

        medirTempo(() -> test(lista));

    }

    private static void test(List<String> lista) {
        System.out.println("Lista original: " + lista);
        List<String> invertida = InverterLista5.inverter(lista);
        System.out.println("Lista invertida: " + invertida);
    }

    private static void medirTempo(Runnable runnable) {
        long inicio = System.currentTimeMillis();
        runnable.run();
        long fim = System.currentTimeMillis();
        long tempoExecucao = fim - inicio;
        System.out.println("Tempo de execução: " + tempoExecucao + " ms");
    }
}
