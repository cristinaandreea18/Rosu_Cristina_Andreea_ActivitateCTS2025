package ro.cts.clase;

public class Internet implements RoboticArmConnection {
    private String retea;
    private static Internet instance = null;

    private Internet(String retea) {
        this.retea = retea;
    }

    public static Internet getInstance(String retea){
        if(instance==null){
            return new Internet(retea);
        }
        return instance;
    }

    @Override
    public void descriere() {
        System.out.println("S-a realizat o conexiune la internet");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Internet{");
        sb.append("retea='").append(retea).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
