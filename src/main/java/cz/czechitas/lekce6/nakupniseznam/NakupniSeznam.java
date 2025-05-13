package cz.czechitas.lekce6.nakupniseznam;

import java.util.ArrayList;
import java.util.List;

public class NakupniSeznam {
    private final List<Polozka> seznam = new ArrayList<>();

    public void run() {
        naplnSeznam();
        System.out.printf("Na začátku seznam obsahuje %d položek:", seznam.size()).println();
        System.out.println(this);

        Polozka tretiPolozka = ziskejTretiPolozku();
        System.out.printf("Třetí položka je: %s", tretiPolozka).println();

        smazDruhouPolozku();
        tretiPolozka = ziskejTretiPolozku();
        System.out.printf("Nová třetí položka je: %s", tretiPolozka).println();

        pridejDalsiPolozku();
        System.out.printf("Na konci seznam obsahuje %d položek:", seznam.size()).println();
        System.out.println(this);
    }

    /**
     * Naplní seznam alespoň 4 položkami.
     */
    private void naplnSeznam() {
        //TODO
        seznam.add(new Polozka("jablko", 2, "kg"));
        seznam.add(new Polozka("hruska", 3, "kg"));
        seznam.add(new Polozka("zmrzlina", 4, "kusy"));
        seznam.add(new Polozka("kaiserka", 5, "kusů"));

    }

    /**
     * Vrátí třetí položku ze seznamu.
     *
     * @return
     */
    private Polozka ziskejTretiPolozku() {
        //TODO
        seznam.get(3);
        return seznam.get(3);
    }

    /**
     * Smaže druhou položku ze seznamu.
     */
    private void smazDruhouPolozku() {
        //TODO
        seznam.remove(3);

    }

    /**
     * Přidá novou položku na konec seznamu.
     */
    private void pridejDalsiPolozku() {
        //TODO
        seznam.addLast(new Polozka("caj", 1, "kus"));
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Nákupní seznam");
        builder.append("\n");
        for (Polozka polozka : seznam) {
            builder.append("* ");
            builder.append(polozka);
            builder.append("\n");
        }
        return builder.toString();
    }
}
