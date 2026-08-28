import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class ListaOperacoes {

    //A (INCOMPLETO!)
    public int nOcorrencias(ArrayList<Integer> l, Integer el) {
        int count = 0;
        for (Integer x : l) {
            if (x.equals(el)) {
                count++;
            }
        }
        return count;
    }


    //B
    public boolean hasRepeat(ArrayList<Integer> l) {
        Set<Integer> vistos = new HashSet<>();
        for (Integer el : l) {
            if (!vistos.add(el)) {
                return true;
            }
        }
        return false;
    }


    //C
    public int nroRepeat(ArrayList<Integer> l) {
        ArrayList<Integer> jaContados = new ArrayList<>();
        int n = 0;
        for (Integer el : l) {
            if (jaContados.contains(el)) {
                continue;
            }
            jaContados.add(el);

            int ocorrencias = 0;
            for (Integer atual : l) {
                if (atual.equals(el)) {
                    ocorrencias++;
                }
            }
            if (ocorrencias > 1) {
                n++;
            }
        }
        return n;
    }


    //D (INCOMPLETO!)
    public ArrayList<Integer> listRepeat(ArrayList<Integer> l) {
        Set<Integer> vistos = new HashSet<>();
        Set<Integer> repetidos = new LinkedHashSet<>();
        for (Integer el : l) {
            if (!vistos.add(el)) {
                repetidos.add(el);
            }
        }
        return new ArrayList<>(repetidos);
    }


    //E
    public ArrayList<Integer> union(ArrayList<Integer> l1, ArrayList<Integer> l2) {
        Set<Integer> setUniao = new LinkedHashSet<>();
        setUniao.addAll(l1);
        setUniao.addAll(l2);
        return new ArrayList<>(setUniao);
    }


    //F
    public ArrayList<Integer> intersect(ArrayList<Integer> l1, ArrayList<Integer> l2) {
        ArrayList<Integer> inter = new ArrayList<>();
        for (Integer el : l1) {
            if (l2.contains(el) && !inter.contains(el)) {
                inter.add(el);
            }
        }
        return inter;
    }
}