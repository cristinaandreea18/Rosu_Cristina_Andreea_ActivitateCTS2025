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
            Elev el = new Elev();
            super.citesteAplicant(input2,el);

            el.setClasa(input2.nextInt());
            el.setTutore(input2.next());

            elevi.add(el);
        }

        input2.close();
        return elevi;
    }
}
