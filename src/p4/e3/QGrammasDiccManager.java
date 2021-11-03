package p4.e3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class QGrammasDiccManager {
    private Map<String, List<String>> hmap = new HashMap<>();
    private Integer q;

    public QGrammasDiccManager(Integer q) {
        this.q = q;
    }

    public Map<String, List<String>> getHmap() {
        return hmap;
    }

    public Integer getQ() {
        return q;
    }

    public void addWord(String word){
        List<String> qgrammas = QGrammasMaker.getGrammasFor(word,q);
        hmap.put(word, qgrammas);
    }


}