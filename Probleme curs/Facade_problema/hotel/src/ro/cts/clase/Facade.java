package ro.cts.clase;

public class Facade {
    public static String verificareDisponibilitateCameraHotel(int codCamera){
        CamereLibere libere = new CamereLibere();
        if(libere.verificareDisponibiltateCamera(codCamera)){
            Menajera menajera = new Menajera();
            if(menajera.esteCurataCamera(codCamera)){
                if(menajera.areProsoapeCurate(codCamera)){
                    return "Camera este disponibila pentru rezervare";
                }
                else {
                    return "Camera are nevoie de prosoape noi!";
                }
            }
            else
            {
                return "Camera trebuie curatata!";
            }
        }
        else
        {
            return "Trebuie sa fie eliberata camera";
        }
    }
}
