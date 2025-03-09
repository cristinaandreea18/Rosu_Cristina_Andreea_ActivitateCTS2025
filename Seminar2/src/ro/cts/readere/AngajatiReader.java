package ro.cts.readere;

import ro.cts.clase.Angajat;
import ro.cts.clase.Aplicant;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AngajatiReader extends AplicantReader {

    public List<Aplicant> readAplicanti(String file) throws FileNotFoundException {
        Scanner input2 = new Scanner(new File(file));
        input2.useDelimiter(",");
        List<Aplicant> angajati = new ArrayList<Aplicant>();

        while (input2.hasNext()) {
            Angajat ang = new Angajat();
            super.citesteAplicant(input2,ang);

            ang.setSalariu(input2.nextInt());
            ang.setOcupatie(input2.next());
            angajati.add(ang);
        }
        input2.close();
        return angajati;
    }
}
