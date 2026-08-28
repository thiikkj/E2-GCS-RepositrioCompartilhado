import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class ListaOperacoes {

    //A (INCOMPLETO!)
    public int nOcorrencias(ArrayList<Integer> l, Integer el) {
        return 0;
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
        return null;
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