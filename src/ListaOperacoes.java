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


    //C (INCOMPLETO!)
    public int nroRepeat(ArrayList<Integer> l) {
        return 0;
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


    //F (INCOMPLETO!)
    public ArrayList<Integer> intersect(ArrayList<Integer> l1, ArrayList<Integer> l2) {
        return null;
    }
}