package ro.cts.readere;

import ro.cts.clase.Aplicant;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public abstract class AplicantReader {
    public abstract List<Aplicant> readAplicanti(String file) throws FileNotFoundException;

    public Aplicant citesteAplicant(Scanner input, Aplicant apl) {
        apl.setNume(input.next());
        apl.setPrenume((input.next()).toString());
        apl.setVarsta(Integer.valueOf(input.nextInt()));
        apl.setPunctaj(Integer.valueOf(input.nextInt()));

        int nr = Integer.valueOf(input.nextInt());
        String[] vect = new String[5];
        for (int i = 0; i < nr; i++)
            vect[i] = input.next();

        apl.setNrProiecte(nr,vect);
        return apl;
    }
}
