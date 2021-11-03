package p4.e3;

import java.util.Collection;

public class Test {
    public static void main(String[] args) {
    	QGrammasDiccManager qgd = new QGrammasDiccManager(2);
        qgd.addWord("casa");
        qgd.addWord("calle");
        qgd.addWord("Galleta");
        System.out.println("DICC: "+qgd.getHmap());
        String wordToUse = "LLUEVE";
        Collection<String> comparisonResult = ComparisonEngine.compare(qgd.getHmap(), wordToUse);
        System.out.println("  Matches: " + comparisonResult);
        
        System.out.println("  Matches: " + ComparisonEngine.compare(qgd.getHmap(), "LLueve"));
        
        System.out.println("  Matches: " + ComparisonEngine.compare(qgd.getHmap(), "a"));
    }
}