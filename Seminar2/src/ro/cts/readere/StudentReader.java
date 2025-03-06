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
            //to do
            Student s = new Student();
            super.citesteAplicant(input,s);
            int an_studii = input.nextInt();
            String facultate = (input.next()).toString();
            s.setFacultate(facultate);
            s.setAn_studii(an_studii);
            studenti.add(s);
        }
        input.close();
        return studenti;
    }
}
