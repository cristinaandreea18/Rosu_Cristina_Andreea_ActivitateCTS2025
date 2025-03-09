package ro.cts.readere;

import ro.cts.clase.Aplicant;
import ro.cts.clase.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentReader extends AplicantReader {

    public List<Aplicant> readAplicanti(String file) throws FileNotFoundException, NumberFormatException {
        Scanner input = new Scanner(new File(file));
        input.useDelimiter(",|\n");
        List<Aplicant> studenti = new ArrayList<Aplicant>();

        while (input.hasNext()) {
            Student s = new Student();
            super.citesteAplicant(input,s);

            s.setAn_studii(input.nextInt());
            s.setFacultate((input.next()).toString());
            studenti.add(s);
        }
        input.close();
        return studenti;
    }
}
