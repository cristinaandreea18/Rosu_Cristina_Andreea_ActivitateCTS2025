package ro.cts.readere;

import ro.cts.clase.Aplicant;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public abstract class AplicantReader {
    public abstract List<Aplicant> readAplicanti(String file) throws FileNotFoundException;

    public Aplicant citesteAplicant(Scanner input, Aplicant apl) {
        String nume = input.next();
        String prenume = (input.next()).toString();
        int varsta = Integer.valueOf(input.nextInt());
        int punctaj = Integer.valueOf(input.nextInt());
        int nr = Integer.valueOf(input.nextInt());
        String[] vect = new String[5];
        for (int i = 0; i < nr; i++)
            vect[i] = input.next();

        apl.setNume(nume);
        apl.setPrenume(prenume);
        apl.setVarsta(varsta);
        apl.setPunctaj(punctaj);
        apl.setNr_proiecte(nr,vect);
        return apl;
    }
}
