package Klausuren.Klausur_08_02_2021.Aufgabe_006.Aufgabe_008;

import java.io.IOException;
import java.io.InputStream;
import java.util.function.IntPredicate;

public class FilteredInputStream {
    private final InputStream is;
    private final IntPredicate filter;

    public FilteredInputStream(InputStream is, IntPredicate filter) {
        this.is = is;
        this.filter = filter;
    }

    /*  Liefert nächsten Bytewert des Eingabestroms für den das
        Filterkriterium erfüllt ist. Wenn Kriterium nicht erfüllt oder kein
        Wert, dann ist die Ausgabe -1.
     */
    public int read() throws IOException {
        int a;
        while ((a = is.read()) != -1) {
            if (filter.test(a)) {
                return a;
            }
        }
        return -1;
    }
}
