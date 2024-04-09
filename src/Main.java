import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<String> participante1 = new ArrayList<>();
        participante1.add("202020");
        participante1.add("tomas");
        participante1.add("ledesma");
        participante1.add("22");
        participante1.add("11202020");
        participante1.add("911");
        participante1.add("O+");

        List<List<String>> participantesCircuitoChico = new ArrayList<>();

        participantesCircuitoChico.add(participante1);

        //categoria -> participantes -> info participante
        Map<String, List<List<String>>> categorias = new HashMap<String, List<List<String>>>();

        //Circuito chico
        categorias.put("Circuito chico", participantesCircuitoChico);

        //Categorias
        Map<String, List<String>> infoCategorias = new HashMap<String, List<String>>();
        List<String> infoCircuitoChico = new ArrayList<>();
        infoCircuitoChico.add("1");
        infoCircuitoChico.add("2 km por selva y arroyos.");

        infoCategorias.put("Circuito chico", infoCircuitoChico);

        //Circuito medio

        categorias.put("Circuito medio", participantesCircuitoChico);

        List<String> infoCircuitoMedio = new ArrayList<>();
        infoCircuitoMedio.add("2");
        infoCircuitoMedio.add("2 km por selva y arroyos.");

        infoCategorias.put("Circuito chico", infoCircuitoChico);

        //Circuito avanzado
    }
}