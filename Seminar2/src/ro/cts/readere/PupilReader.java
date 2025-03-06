package ro.cts.readere;

import ro.cts.clase.Aplicant;
import ro.cts.clase.Elev;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PupilReader extends AplicantReader {

    public List<Aplicant> readAplicanti(String file) throws FileNotFoundException {
        Scanner input2 = new Scanner(new File(file));
        input2.useDelimiter(",|\n");
        List<Aplicant> elevi = new ArrayList<Aplicant>();

        while (input2.hasNext()) {
//            String nume = input2.next();
//            String prenume = input2.next();
//            int varsta = input2.nextInt();
//            int punctaj = input2.nextInt();
//            int nr = input2.nextInt();
//            String[] vect = new String[5];
//            for (int i = 0; i < nr; i++)
//                vect[i] = input2.next();

            Elev el = new Elev();
            super.citesteAplicant(input2,el);
            int clasa = input2.nextInt();
            String tutore = input2.next();
            el.setClasa(clasa);
            el.setTutore(tutore);
            elevi.add(el);
        }

        input2.close();
        return elevi;
    }
}
